package homework.lesson02.lesson01.Course;

import homework.lesson02.lesson01.Team.TeamMember;

public class Jump extends Obstacle {
    public Jump(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goStart(TeamMember member) {
        member.jump(super.getDifficulty());
    }


}

