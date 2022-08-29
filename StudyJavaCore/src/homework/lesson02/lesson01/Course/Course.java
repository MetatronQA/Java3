package homework.lesson02.lesson01.Course;

import homework.lesson02.lesson01.Status;
import homework.lesson02.lesson01.Team.Team;
import homework.lesson02.lesson01.Team.TeamMember;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (TeamMember member: team.getMembers()) {
            for (Obstacle obs :obstacles) {
                obs.goStart(member);
                if (member.getStatus() == Status.NoPassedDistance) {
                    break;
                }
            }
        }
    }
}
