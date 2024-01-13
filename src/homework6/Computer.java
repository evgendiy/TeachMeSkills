package homework6;

/**
 * 1.	Создать класс для описания компьютера, в этом классе должны быть поля: стоимость, модель(строковый тип), RAM и HDD.
 * Для полей RAM и HDD следует создать свои собственные классы. Классы для RAM и HDD должны иметь конструктор по умолчанию
 * и конструктор со всеми параметрами.
 * Класс RAM имеет поля "название" и "объем".
 * Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний).
 * Класс Computer должен иметь два конструктора:
 * -	первый - с параметрами стоимость и модель,
 * -	второй - со всеми полями.
 * При создании объекта "компьютер" с помощью первого конструктора должны создаваться поля RAM и HDD с помощью
 * конструкторов по умолчанию. В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и
 * всех значений).
 * Тестовый сценарий для проверки:
 * создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран;
 * создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран
 */
public class Computer implements DisplayInformation {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1000, "nimbus2000");
        computer1.showInfo();
        Computer computer2 = new Computer(2000, "legion", new RandomAccessMemory("samsung", 1000), new HardDiskDrive("toshiba", 300, "inner"));
        computer2.showInfo();
    }

    double price;
    String model;
    RandomAccessMemory ram;
    HardDiskDrive hdd;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        ram = new RandomAccessMemory();
        hdd = new HardDiskDrive();
    }

    public Computer(double price, String model, RandomAccessMemory ram, HardDiskDrive hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public void showInfo() {
        System.out.println("The price of the computer: " + price + "; Model: " + model + ".");
        ram.showInfo();
        hdd.showInfo();
    }
}
