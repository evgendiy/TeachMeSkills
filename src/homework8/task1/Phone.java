package homework8.task1;


public class Phone {
    private long number;
    private int weight;
    private String model;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        if (String.valueOf(number).length() == 11) {  //для примера номера РБ 80** *** ** ** на практике для проверок наверное лучше String
            this.number = number;
        } else {
            System.out.println("Wrong number");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Wrong weight");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Phone() {

    }

    public Phone(long number, String model) {       //про это спрашивал на занятии(сеттеры в конструкторе)
        setNumber(number);
        this.model = model;
    }

    public Phone(long number, int weight, String model) {
        this(number, model);
        setWeight(weight);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, long number) {
        receiveCall(name);
        System.out.println(number);
    }

    public void sendMessage(String message, long... number) {
        for (long l : number) {
            System.out.println(l+message);
        }
    }
}
