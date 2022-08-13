package Lesson1Object.HomeWork.HomeWork1_0.Course;

import Lesson1Object.HomeWork.HomeWork1_0.Status;
import Lesson1Object.HomeWork.HomeWork1_0.Team.Team;
import Lesson1Object.HomeWork.HomeWork1_0.Team.TeamMember;

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
