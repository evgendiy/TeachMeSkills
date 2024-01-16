package homework7.task3;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        FinancicalNote financicalNote = new FinancicalNote(new Date(2024, 1, 16), 1, 2, 22);
        GoodsContract goodsContract = new GoodsContract(new Date(2024, 1, 16), 2, "type", 11);
        EmployeeContract employeeContract = new EmployeeContract(new Date(2024, 1, 16), 3, "Alex", new Date(2025, 1, 16));
        register.saveDocument(financicalNote);
        register.saveDocument(goodsContract);
        register.saveDocument(employeeContract);
        System.out.println(Arrays.toString(register.documentsArray));

        register.showDocumentInfo(goodsContract);
        register.showDocumentInfo(financicalNote);
        register.showDocumentInfo(employeeContract);
    }
}
