package homework7.task2;

public class Director implements DisplayablePosition {
    String position = "Director";

    @Override
    public void showPosition() {
        System.out.println(position);
    }
}
