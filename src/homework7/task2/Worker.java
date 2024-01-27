package homework7.task2;

public class Worker implements DisplayablePosition{
    String position = "Worker";

    @Override
    public void showPosition() {
        System.out.println(position);
    }
}
