package HomeWork.Lection1;

import HomeWorkLesson1.Team.TeamMember;

public class Fight extends Obstacle {
    public Fight(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goStart(TeamMember member) {
        member.fight(super.getDifficulty());
    }


}
