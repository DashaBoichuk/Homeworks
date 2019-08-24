package first_task;

import first_task.Animal;
import first_task.Cat;
import first_task.Dog;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            animal.feed();
            animal.voice();
        }
    }
}
