package homework7.task3;

import homework9.AbcException;
import homework9.FinishOfDocException;
import homework9.SequenceNumberException;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        FinancicalNote financicalNote = new FinancicalNote(new Date(2024, 1, 16), "555abc1a2", 2, 22);
        GoodsContract goodsContract = new GoodsContract(new Date(2024, 1, 16), "2", "type", 11);
        EmployeeContract employeeContract = new EmployeeContract(new Date(2024, 1, 16), "3", "Alex", new Date(2025, 1, 16));
//        register.saveDocument(financicalNote);
//        register.saveDocument(goodsContract);
//        register.saveDocument(employeeContract);
//        System.out.println(Arrays.toString(register.documentsArray));

        //лучше такое разделять на несколько блоков try или в зависимости от потребности?
        try {
            DocumentValidation(financicalNote.numberOfDocument);
        } catch (AbcException e) {
            throw new AbcException("Invalid input: " + e.getMessage());
        } catch (SequenceNumberException e) {
            throw new SequenceNumberException("Invalid input: " + e.getMessage());
        } catch (FinishOfDocException e) {
            throw new FinishOfDocException("Invalid input: " + e.getMessage());
        }

//        register.showDocumentInfo(goodsContract);
//        register.showDocumentInfo(financicalNote);
//        register.showDocumentInfo(employeeContract);
    }

    public static void DocumentValidation(String numberOfDoc) throws AbcException, SequenceNumberException, FinishOfDocException {
        if (!numberOfDoc.contains("abc")) {
            throw new AbcException("Document number must contain \"abc\"");
        }
        if (!numberOfDoc.startsWith("555")) {
            throw new SequenceNumberException("Document number should start with \"555\"");
        }
        if (!numberOfDoc.endsWith("1a2b")) {
            throw new FinishOfDocException("Document number should end with \"1a2b\"");
        }

    }
}
