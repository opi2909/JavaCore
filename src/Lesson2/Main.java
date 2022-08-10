package Lesson2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String [][] field = new String [4][4];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {

                if (i == 1 && j == 1) {
                    field[i][j] = "1";
                }
                else {
                    field [i][j] = "10";
                }

            }
        }
        int [][] field2 = new int[4][4];
        makeField(field);
        changeField (field, field2);
        print(field2);
        sumField(field2);

    }

    public static void makeField (String [][] field) throws MyArraySizeException {
        if (field.length != 4 || field[0].length != 4) {
            throw new MyArraySizeException("Массив не соответствует параметру 4*4");
        }


    }
    public static void changeField (String [][] field, int [][] field2) throws MyArrayDataException {
        try {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    field2[i][j] = Integer.parseInt(field[i][j]);
                }
            }
        }
        catch (NumberFormatException e) {
            throw new MyArrayDataException("Массив содержит не только числа");
        }
    }
    public static void sumField (int [][] field2) {
        int result = 0;
        for (int i = 0; i < field2.length; i++) {
            for (int j = 0; j < field2[0].length; j++) {
                result += field2[i][j];
            }
        }
        System.out.println(result);
    }

    public static void print (int [][] field2) {
        for (int i = 0; i < field2.length; i++) {
            for (int j = 0; j < field2[0].length; j++) {
                System.out.print(field2[i][j]);
            }
        }
    }




}


