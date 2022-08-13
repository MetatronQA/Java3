package Lesson1Object.HomeWork.HomeWork1_0.Team;

import Lesson1Object.HomeWork.HomeWork1_0.Status;

public class TeamMember {
    private final String name;
    private Status status = Status.NoPassedDistance;
    private final int power;

    public TeamMember(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void run(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, " пробежал дистанцию");
        } else {
            changeStatus(Status.NoPassedDistance, " не пробежал дистанцию");
        }
    }

    public void jump(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, " прыжок за считан");
        } else {
            changeStatus(Status.NoPassedDistance, " прыжок не за считан");
        }
    }

    public void swim(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, " проплыл дистанцию");
        } else {
            changeStatus(Status.NoPassedDistance, " не проплыл дистанцию");
        }
    }

    public void fight(int courseDifficulty) {
        if (checkPower(courseDifficulty)) {
            changeStatus(Status.PassedDistance, " победил в бою");
        } else {
            changeStatus(Status.NoPassedDistance, " проиграл в бою");
        }
    }

    private boolean checkPower(int courseDifficulty) {
        return power > courseDifficulty || power == courseDifficulty;
    }

    private void changeStatus(Status newStatus, String message) {
        status = newStatus;
        System.out.println(name + message);
    }


}








