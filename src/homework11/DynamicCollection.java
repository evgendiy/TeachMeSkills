package homework11;

import java.util.Arrays;

public class DynamicCollection<T> {

    private Object[] array;
    protected int capacity; //размер
    private int size = 0;     //фактическое кол-во

    public DynamicCollection() {
        array = new Object[10]; //пусть по умолчанию создает на 10 элементов
        capacity = 10;
    }

    public DynamicCollection(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
            array = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Wrong capacity");
        }
    }

    private void automaticIncrease() {
        int newCapacity = capacity * 3 / 2 + 1; //вроде как в оригинале
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
    }

    public int getSize() {
        return size;
    }

    public void addElement(T element) {
        if (element != null) {
            if (size == capacity) {
                automaticIncrease();
            }
            array[size] = element;
            size++;
        }
    }

    @SuppressWarnings("unchecked")
    public T getElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of array bounds");
        }
        return (T) array[index];
    }

    public void removeElement(int index) { //удаление по индексу элемента
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of array bounds");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    public void removeAllElements() { //очистка всей коллекции
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public boolean checkElement(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "DynamicCollection{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
