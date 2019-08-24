package second_task;

import first_task.Animal;
import first_task.Cat;
import first_task.Dog;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Teacher());
        people.add(new Cleaner());
        people.add(new Student());

        for (Person person : people) {
            person.Print();
            if (person instanceof Staff) ((Staff) person).Salary();

        }
    }
}
