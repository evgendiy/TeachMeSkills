package homework7.task3;

import java.util.Date;

public class GoodsContract extends Document {
    String typeOfGood;
    int amountOfGood;

    public GoodsContract() {
    }

    public GoodsContract(Date dateOfDocuments, String numberOfDocument, String typeOfGood, int amountOfGood) {
        super(dateOfDocuments, numberOfDocument);
        this.typeOfGood = typeOfGood;
        this.amountOfGood = amountOfGood;
    }

    @Override
    void showInfo() {
        System.out.println(numberOfDocument+ " GoodsContract "+dateOfDocuments);
    }
}
