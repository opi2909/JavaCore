package Lesson3;

import java.util.ArrayList;

public class Box <T> {
    public double weightFruit = 0.0;
    ArrayList<T> fruits = new ArrayList();

    public <T> Box (double weightFruit) {
        this.weightFruit= weightFruit;
    }

    public void addFruit(T fruit) {

        fruits.add(fruit);
    }

    public double getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(Box<?> box){
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruits(Box<T> boxFruit){
        System.out.println("В первой коробке перед добавлением: " + fruits.size());
        System.out.println("Во второй коробке перед добавлением " + boxFruit.fruits.size());
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
        boxFruit.fruits.trimToSize();
        System.out.println("После добавления в первой коробке: " + fruits.size());
        System.out.println("После добавления во второй коробке: " + boxFruit.fruits.size());
    }
}
