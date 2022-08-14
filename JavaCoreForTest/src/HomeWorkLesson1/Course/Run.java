package HomeWorkLesson1.Course;

import HomeWorkLesson1.Team.TeamMember;

public class Run extends Obstacle {
    public Run(int difficulty) {
        super(difficulty);
    }

     @Override
    public void goStart(TeamMember member) {
        member.run(super.getDifficulty());
    }
}
