import animal.Animal;
import animal.Chicken;
import animal.Tiger;

import edibe.Edible;

import fruit.Fruit;
import fruit.Apple;
import fruit.Orange;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtoEat());
            }
        }

            Fruit[] fruits = new Fruit[2];
            fruits[0] = new Apple();
            fruits[1] = new Orange();
            for(Fruit fruit : fruits){
               System.out.println(fruit.howtoEat());
            }

    }

}
