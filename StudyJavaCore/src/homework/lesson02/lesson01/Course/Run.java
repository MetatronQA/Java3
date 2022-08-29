package homework.lesson02.lesson01.Course;

import homework.lesson02.lesson01.Team.TeamMember;

public class Run extends Obstacle {
    public Run(int difficulty) {
        super(difficulty);
    }

     @Override
    public void goStart(TeamMember member) {
        member.run(super.getDifficulty());
    }
}
