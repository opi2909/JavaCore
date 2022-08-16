package Lesson3;

public class Main {
    public static void main(String[] args) {
        public static void Main () {
            Box<Apple> appleBox = new Box<Apple>(1);
            Box<Orange> orangeBox = new Box<Orange>(1.5);
            Box<Apple> appleBox2 = new Box<Apple>(1);
            for (int i = 0; i < 3; i++) {
                orangeBox.addFruit(new Orange());
                appleBox.addFruit(new Apple());
                appleBox2.addFruit(new Apple());
            }
            appleBox.addFruit(new Apple());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
            System.out.println("Вес коробки с яблоками: " + appleBox.getBoxWeight());
            System.out.println("Вес коробки с апельсинами: " + orangeBox.getBoxWeight());
            System.out.println("Общий вес - " + appleBox.compare(orangeBox));
        }
    }
}
