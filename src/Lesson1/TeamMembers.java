package Lesson1;

public class TeamMembers {
    String name;
    String gender;
    int power;



    public TeamMembers (String nameForMember, String genderForMember, int powerForMember) {
        name = nameForMember;
        gender = genderForMember;
        power = powerForMember;


    }
    public void infoAboutTeamMembers () {

        System.out.println(name + ", " + gender + ", " + power);
    }

}
