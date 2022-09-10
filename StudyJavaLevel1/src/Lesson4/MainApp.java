package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);


    public static char player = '@';
    public static int playerHP = 100;
    public static int playerStr = 10;
    public static int playerCoins = 0;
    public static int playerScore = 0;
    public static int playerExp = 0;
    public static int playerX;
    public static int playerY;

    public static final int playerMoveUp = 8;
    public static final int playerMoveDown = 2;
    public static final int playerMoveLeft = 4;
    public static final int playerMoveRight = 6;

    public static int mapHeight;
    public static int mapWidth;

    public static char[][] map;
    public static char[][] invisibleMap;
    public static int mapSizeMin = 3;
    public static int mapSizeMax = 5;
    public static char emptyCell = '_';
    public static char readyCell = '*';

    public static char coin = '$';
    public static int coinsCount;
    public static int coinsValueMin = 10;
    public static int coinsValueMax = 20;
    public static int coinPrice;

    public static char enemy = 'E';
    public static int enemyHP;
    public static int enemyStr;
    public static int enemyValueMin = 20;
    public static int enemyValueMax = 30;
    public static int enemyPosX;
    public static int enemyPosY;

    public static int enemiesCount;
    public static int gameLevel = 0;

    public static void main(String[] args) {

        while (isPlayerAlive()) {
            ++gameLevel;
            System.out.println("**** START GAME LEVEL " + gameLevel + " ****");
            levelCycle();
        }
        System.out.println("GAME OVER Player Score " + playerScore);
    }

    public static void levelCycle() {
        createMap();
        createPlayer();
        makerItem(enemy, "Latish");
        makerItem(coin, "Coin");

        while (true) {
            printMap();
            playerMoveAction();

            if (!isPlayerAlive()) {
                System.out.println("Player dead. GameOver");
                break;
            }
            if (!isEnemyExist()) {
                System.out.println("Player W I N. Score is " + playerScore + " Level finish.");
                break;
            }
        }
        printMap();

    }

    public static void createMap() {
        mapWidth = randomValue(mapSizeMin, mapSizeMax);
        mapHeight = randomValue(mapSizeMin, mapSizeMax);
        map = new char[mapHeight][mapWidth];
        invisibleMap = new char[mapHeight][mapWidth];

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                map[y][x] = emptyCell;
                invisibleMap[y][x] = emptyCell;
            }
        }
        System.out.println("Log => Map " + mapWidth + "x" + mapHeight + " has been created.");
    }

    public static void createPlayer() {
        playerX = randomValue(0, mapWidth - 1);
        playerY = randomValue(0, mapHeight - 1);
        map[playerY][playerX] = player;
        System.out.println("Log => Player has been created in [" + (playerX + 1) + ":" + (playerY + 1) + "]");
        System.out.println("Log => Player Info [HP " + playerHP + "][ Player Score " + playerScore + "][ Player Coins " +playerCoins);
    }

    public static void makerItem(char item, String nameItem) {
        int itemCount = getFreeCells() / 3;

        int itemPosX;
        int itemPosY;

        if (item == enemy) {
            enemiesCount = itemCount;
            enemyHP = randomValue(enemyValueMin, enemyValueMax);
            enemyStr = randomValue(enemyValueMin, enemyValueMax);
        }
        if (item == coin) {
            coinPrice = randomValue(coinsValueMin, coinsValueMax) * gameLevel;
        }

        for (int i = 0; i <= itemCount; i++) {
            do {
                itemPosX = random.nextInt(mapWidth);
                itemPosY = random.nextInt(mapHeight);
            } while (!isEmptyCell(itemPosX, itemPosY, map) || !isEmptyCell(itemPosX, itemPosY, invisibleMap));
            invisibleMap[itemPosY][itemPosX] = item;
        }
        System.out.println("Log => " + nameItem + " has been created.Count is " + itemCount);
    }

    public static void playerMoveAction() {
        int playerLastX = playerX;
        int playerLastY = playerY;

        int playerDestination;

        do {
            System.out.print(" Select your move > UP " + playerMoveUp +
                    "| DOWN " + playerMoveDown +
                    "| LEFT " + playerMoveLeft +
                    "| RIGHT " + playerMoveRight + " >");
            playerDestination = scanner.nextInt();

            switch (playerDestination) {
                case playerMoveUp:
                    playerY -= 1;
                    break;
                case playerMoveDown:
                    playerY += 1;
                    break;
                case playerMoveRight:
                    playerX += 1;
                    break;
                case playerMoveLeft:
                    playerX -= 1;
                    break;
            }
        } while (!isValidPlayerMoveNextCell(playerX, playerY, playerLastX, playerLastY));

        playerNextCellCheck();
        map[playerLastY][playerLastX] = readyCell;
        invisibleMap[playerLastY][playerLastX] = emptyCell;
        map[playerY][playerX] = player;
    }

    public static void playerNextCellCheck() {
        if (invisibleMap[playerY][playerX] == enemy) {
            battle();
        }
        if ((invisibleMap[playerY][playerX] == coin)) {
            playerCoins += coinPrice;
            System.out.println("Log => Player get " + coinPrice + "coins. All coins " + playerCoins);
        }
    }

    public static void battle() {
        int battleRound = 1;
        int currentEnemyHealth = enemyHP;

        System.out.println("***** START BATTLE *****");
        while (isPlayerAlive() && currentEnemyHealth > 0) {
            System.out.println("**** ROUND BATTLE " + battleRound + " ***");
            System.out.print("[Player HP " + playerHP + " PlayerPower: " + playerStr + ") V/S ");
            System.out.println("Enemy (HP: " + currentEnemyHealth + " EnemyPower" + enemyStr + ")]");
            currentEnemyHealth -= playerStr;
            System.out.println("BATTLE Log => Player give damage to Enemy. Enemy HP is " + currentEnemyHealth);
            if (currentEnemyHealth > 0) {
                playerHP -=enemyStr;
                System.out.println("BATTLE Log => Enemy give damage to player. Player Hp is " + playerHP);
            } else {
                enemiesCount --;
                playerExp += enemyHP + enemyStr;
                playerScore ++;
                break;
            }
            battleRound ++;
        }
        System.out.println("==== THE END ====");
    }

    public static boolean isValidPlayerMoveNextCell(int nextCellX, int nextCellY, int lastCellX, int lastCellY) {
        if (isValidCell(nextCellX, nextCellY)) {
            System.out.println("Log => Player move to [" + (nextCellX + 1) + ":" + (nextCellY + 1) + "]");
            return true;
        } else {
            System.out.println("Log => Invalid move! ");
            playerX = lastCellX;
            playerY = lastCellY;
            return false;
        }
    }

    public static void printMap() {
        System.out.println("==== MAP ====");
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[y][x] + "¦");
            }
            System.out.println();
        }
        System.out.println("================");
    }

    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static boolean isPlayerAlive() {
        return playerHP > 0;
    }

    public static boolean isEmptyCell(int x, int y, char[][] map) {
        return map[y][x] == emptyCell;
    }

    public static boolean isValidCell(int x, int y) {
        return x >= 0 && x < mapWidth && y >= 0 && y < mapHeight;
    }

    public static boolean isEnemyExist() {
        return enemiesCount > 0;
    }

    public static int getFreeCells() {
        int tmp = 0;
        for (int i = 0; i < invisibleMap.length; i++) {
            for (int j = 0; j < invisibleMap[i].length; j++) {
                if (invisibleMap[i][j] == emptyCell) {
                    tmp++;
                }
            }
        }
        return tmp - 1;
    }

}
