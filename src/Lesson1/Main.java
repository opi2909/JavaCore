package Lesson1;

public class Main {
    public static void main(String[] args) {
        new Team("Pobeda");
        TeamMembers[] member = new TeamMembers[4];
        member[0] = new TeamMembers("Masha", "female", 80);
        member[1] = new TeamMembers("Ira", "female", 84);
        member[2] = new TeamMembers("Igor", "male", 100);
        member[3] = new TeamMembers("Stat", "male", 55);
        for (int i = 0; i <= 3; i++) {
            member[i].infoAboutTeamMembers();
        }

    }
}
