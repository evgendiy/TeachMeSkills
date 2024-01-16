package homework7.task3;

import java.util.Date;

public class EmployeeContract extends Document {

    String employeeName;
    Date endDate;

    public EmployeeContract() {
    }

    public EmployeeContract(Date dateOfDocuments, int numberOfDocument, String employeeName, Date endDate) {
        super(dateOfDocuments, numberOfDocument);
        this.employeeName = employeeName;
        this.endDate = endDate;
    }

    @Override
    void showInfo() {
        System.out.println(numberOfDocument+ " EmployeeContract "+dateOfDocuments);
    }
}
