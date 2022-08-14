package HomeWork.HomeWork2.HomeWork1.Course;

import HomeWork.HomeWork2.HomeWork1.Status;
import HomeWork.HomeWork2.HomeWork1.Team.Team;
import HomeWork.HomeWork2.HomeWork1.Team.TeamMember;

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
