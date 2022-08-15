package HomeWorkLesson1.Team;

import HomeWorkLesson1.Status;

public class Team {

    private final TeamMember[] members;
    private final String name;

    public Team(String name, TeamMember... members) {
        this.members = members;
        this.name = name;
    }
    public TeamMember[] getMembers() {
        return members;
    }

    private void showResults() {
        printDivider();
        System.out.println("Команда победитель " + name);
        for (TeamMember member: members) {
            if (member.getStatus() == Status.NoPassedDistance){
                showResultMemberNoPassed(member);
            }
            else {
                showResultMemberPassed(member);
            }
        }
        printDivider();
    }

    public void showResultMemberNoPassed(TeamMember member){
        printDivider();
        System.out.println(member.getName() + "Не прошел полосу препятствий");
    }

    public void showResultMemberPassed(TeamMember member){
        printDivider();
        System.out.println(member.getName() + "Успешно прошел полосу препятствий");
    }

    private void printDivider() {
        System.out.println("---------------------------------------------------------");
    }
}
