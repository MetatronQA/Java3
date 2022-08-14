package HomeWorkLesson1.Course;

import HomeWorkLesson1.Team.TeamMember;


public class Swim extends Obstacle {
    public Swim(int difficulty) {
        super(difficulty);
    }


        @Override
    public void goStart(TeamMember member) {
        member.swim(super.getDifficulty());
    }
}

