package homework.lesson02.lesson01.Course;

import homework.lesson02.lesson01.Team.TeamMember;


public class Swim extends Obstacle {
    public Swim(int difficulty) {
        super(difficulty);
    }


        @Override
    public void goStart(TeamMember member) {
        member.swim(super.getDifficulty());
    }
}

