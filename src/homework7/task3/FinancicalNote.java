package homework7.task3;

import java.util.Date;

public class FinancicalNote extends Document {

    int departmentId;
    double totalAmount;

    public FinancicalNote(Date date) {
    }

    public FinancicalNote(Date dateOfDocuments, int numberOfDocument, int departmentId, double totalAmount) {
        super(dateOfDocuments, numberOfDocument);
        this.departmentId = departmentId;
        this.totalAmount = totalAmount;

    }

    @Override
    void showInfo() {
        System.out.println(numberOfDocument+ " FinancicalNote "+dateOfDocuments);
    }
}
