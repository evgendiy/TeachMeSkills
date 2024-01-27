package homework7.task2;

public class Accountant implements DisplayablePosition {
    String position = "Accountant";

    @Override
    public void showPosition() {
        System.out.println(position);
    }
}
