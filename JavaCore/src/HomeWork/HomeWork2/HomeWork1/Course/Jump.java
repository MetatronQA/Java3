package HomeWork.HomeWork2.HomeWork1.Course;

import HomeWork.HomeWork2.HomeWork1.Team.TeamMember;

public class Jump extends Obstacle {
    public Jump(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goStart(TeamMember member) {
        member.jump(super.getDifficulty());
    }


}

