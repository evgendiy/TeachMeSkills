package homework6;

public class RandomAccessMemory implements DisplayInformation {
    public String ramBrand;
    public int ramValue;

    public RandomAccessMemory(){
        ramBrand = "noName";
        ramValue = 16384;
    }

    public RandomAccessMemory(String ramBrand, int value) {
        this.ramBrand = ramBrand;
        this.ramValue = value;
    }
    @Override
    public void showInfo() { //Возможно ли переделать через лямбда и есть ли смысл?
        System.out.println("RAM brand: " + ramBrand + "; RAM value: " + ramValue + ".");
    }


}
