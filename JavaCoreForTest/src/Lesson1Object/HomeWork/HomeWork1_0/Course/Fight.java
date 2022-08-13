package Lesson1Object.HomeWork.HomeWork1_0.Course;

import Lesson1Object.HomeWork.HomeWork1_0.Team.TeamMember;

public class Fight extends Obstacle {
    public Fight(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goStart(TeamMember member) {
        member.fight(super.getDifficulty());
    }


}
