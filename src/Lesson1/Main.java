package Lesson1;

public class Main {
    public static void main(String[] args) {
        new Team("Pobeda");
        Course course1 = new Course(65);
        TeamMembers[] member = new TeamMembers[4];
        member[0] = new TeamMembers("Masha", "female", 80);
        member[1] = new TeamMembers("Ira", "female", 84);
        member[2] = new TeamMembers("Igor", "male", 100);
        member[3] = new TeamMembers("Stas", "male", 55);
        for (int i = 0; i <= 4; i++) {
            if (course1.powerConsumption <= member[i].power) {
                System.out.println(member[i].name + " прошел полосу препятствий");
            }
            else {
                System.out.println(member[i].name + " не прошел полосу препятствий");
            }
        }
        member[0].infoAboutTeamMembers();

    }


}
