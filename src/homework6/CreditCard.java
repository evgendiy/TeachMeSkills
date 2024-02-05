package homework6;

/**
 * Создать класс CreditCard с полями номер счета, текущая сумма на счету.
 * Добавьте метод, который позволяет начислять сумму на кредитную карточку.
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 * Добавьте метод, который выводит текущую информацию о карточке. Напишите программу, которая создает три объекта
 * класса CreditCard у которых заданы номер счета и начальная сумма
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */
public class CreditCard {
    public static void main(String[] args) {
        CreditCard[] array = new CreditCard[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = new CreditCard(i + 1);
        }

        for (CreditCard card : array) {
            card.showInfo();
        }

        array[0].addMoney(10);
        array[1].addMoney(22);
        array[2].withdraw(50);

        for (CreditCard card : array) {
            card.showInfo();
        }

    }

    public int id;
    public double currentSum;

    public CreditCard(int id) {
        this.id = id;
        currentSum = 100.00;  //просто для примера
    }

    public double addMoney(double deposit) { //Корректно ли выбран тип возвращаемого значения для метода или лучше void?
        return currentSum += deposit;
    }

    public double withdraw(double amount) {
        if (amount <= currentSum) {
            currentSum -= amount;
        } else {
            System.out.println("Недостаточно средств");
        }
        return currentSum;
    }

    public void showInfo() {
        System.out.println("Номер счета: " + id);
        System.out.println("Cумма на счету: " + currentSum);
    }
}
