package Lesson1Object.HomeWork.HomeWork1_0.Course;

import Lesson1Object.HomeWork.HomeWork1_0.Team.TeamMember;

public class Jump extends Obstacle {
    public Jump(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goStart(TeamMember member) {
        member.jump(super.getDifficulty());
    }


}

