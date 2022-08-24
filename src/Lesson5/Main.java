package Lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        App data = new App();
        data.readFromFile("example.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("new_example.csv");
    }
}
