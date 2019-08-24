package first_task;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Dog voice");
    }

    @Override
    public void feed() {
        System.out.println("Dog feed");
    }
}
