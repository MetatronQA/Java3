package Lesson1Object.HomeWork.HomeWork1_0.Course;

import Lesson1Object.HomeWork.HomeWork1_0.Team.TeamMember;


public class Swim extends Obstacle {
    public Swim(int difficulty) {
        super(difficulty);
    }


        @Override
    public void goStart(TeamMember member) {
        member.swim(super.getDifficulty());
    }
}

