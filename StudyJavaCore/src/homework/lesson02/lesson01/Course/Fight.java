package homework.lesson02.lesson01.Course;

import homework.lesson02.lesson01.Team.TeamMember;

public class Fight extends Obstacle {
    public Fight(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goStart(TeamMember member) {
        member.fight(super.getDifficulty());
    }


}
