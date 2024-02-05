package homework6;

public class HardDiskDrive implements DisplayInformation {
    public String hddBrand;
    public int hddValue;
    public String type;

    public HardDiskDrive() {
        hddBrand = "noName";
        hddValue = 524288;
        type = "inner";
    }

    public HardDiskDrive(String hddBrand, int hddValue, String type) {
        this.hddBrand = hddBrand;
        this.hddValue = hddValue;
        this.type = type;
    }

    @Override
    public void showInfo() {
        System.out.println("HDD brand: " + hddBrand + "; HDD value: " + hddValue + "; HDD type: " + type + ".");
    }
}
