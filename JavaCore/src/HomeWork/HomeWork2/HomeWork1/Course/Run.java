package HomeWork.HomeWork2.HomeWork1.Course;

import HomeWork.HomeWork2.HomeWork1.Course.Obstacle;
import HomeWork.HomeWork2.HomeWork1.Team.TeamMember;

public class Run extends Obstacle {
    public Run(int difficulty) {
        super(difficulty);
    }

     @Override
    public void goStart(TeamMember member) {
        member.run(super.getDifficulty());
    }
}
