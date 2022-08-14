package HomeWork.HomeWork2.HomeWork1.Course;

import HomeWork.HomeWork2.HomeWork1.Course.Obstacle;
import HomeWork.HomeWork2.HomeWork1.Team.TeamMember;


public class Swim extends Obstacle {
    public Swim(int difficulty) {
        super(difficulty);
    }


        @Override
    public void goStart(TeamMember member) {
        member.swim(super.getDifficulty());
    }
}

