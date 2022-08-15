package HomeWork.Lection1;

import HomeWorkLesson1.Status;
import HomeWorkLesson1.Team.Team;
import HomeWorkLesson1.Team.TeamMember;

public class Course {
    private final Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (TeamMember member: team.getMember()) {
            for (Obstacle obs :obstacles) {
                obs.goStart(member);
                if (member.getStatus() == Status.NoPassedDistance) {
                    break;
                }
            }
        }
    }
}
