package Lesson1Object.HomeWork.HomeWork1_0.Course;

import Lesson1Object.HomeWork.HomeWork1_0.Team.TeamMember;

public class Run extends Obstacle {
    public Run(int difficulty) {
        super(difficulty);
    }

     @Override
    public void goStart(TeamMember member) {
        member.run(super.getDifficulty());
    }
}
