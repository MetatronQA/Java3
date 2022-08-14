package HomeWork.HomeWork2.HomeWork1;

import HomeWork.HomeWork2.HomeWork1.Course.*;
import HomeWork.HomeWork2.HomeWork1.Team.Team;
import HomeWork.HomeWork2.HomeWork1.Team.TeamMember;
import HomeWorkLesson1.Course.*;

public class Main {

    public static void main(String[] args) {
        Team stars = new Team("Stars",
                new TeamMember("Zenit", 4),
                new TeamMember("Dinamo", 6),
                new TeamMember("Amkar", 10),
                new TeamMember("Derbi", 11));

        Course course = new Course(
                new Run(5),
                new Jump(5),
                new Swim(5),
                new Fight(6));

        course.doIt(stars);
    }
    
}
