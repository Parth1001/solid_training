package excersice_refactored;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        donaldDuck.quack();
        electricDuck.swim();
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
