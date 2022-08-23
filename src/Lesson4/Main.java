package Lesson4;


public class Main {
    public static void main(String[] args) {
        doPhoneBook();
        Arrays wordsArray = new Arrays(createArrayWords());
        wordsArray.doArrayWords();

    }
    private static void doPhoneBook() {
        Phones phoneBook = new Phones();
        phoneBook.addElementPhoneBook("Olga","81111111111");
        phoneBook.addElementPhoneBook("Olga","82222222222");
        phoneBook.addElementPhoneBook("Olga","83333333333");

        phoneBook.addElementPhoneBook("Nikolay","444444");
        phoneBook.addElementPhoneBook("Nikolay","444444");
        phoneBook.addElementPhoneBook("Nikolay","4444445");
        phoneBook.addElementPhoneBook("Nikolay","555 555");
        phoneBook.addElementPhoneBook("Nikolay","666 666 666");

        System.out.println("Olga: " + phoneBook.getPhonesByName("Olga"));
        System.out.println("Nikolay: " + phoneBook.getPhonesByName("Nikolay"));
        System.out.println("Sergey: " + phoneBook.getPhonesByName("Sergey"));
        System.out.println("Ivan: " + phoneBook.getPhonesByName("Ivan"));
    }

    private static String[] createArrayWords() {
        String [] strings = new String[10];
        strings[0] = "Shmel";
        strings[1] = "ACIG";
        strings[2] = "Garmonia";
        strings[3] = "Dacha";
        strings[4] = "Kombo";
        strings[5] = "Kolya";
        strings[6] = "Love";
        strings[7] = "Friend";
        strings[8] = "Vernis";
        strings[9] = "Prosti";
        return strings;
    }
}
