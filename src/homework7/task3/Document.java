package homework7.task3;

import homework9.AbcException;
import homework9.DocumentValidationException;
import homework9.FinishOfDocException;
import homework9.SequenceNumberException;

import java.util.Date;

public abstract class Document {
    Date dateOfDocuments;
    String numberOfDocument;

    public Document() {
    }

    public Document(Date dateOfDocuments, String numberOfDocument) {
        if (documentValidation(numberOfDocument)) {
            this.numberOfDocument = numberOfDocument;
        }
        this.dateOfDocuments = dateOfDocuments;
    }

    public static boolean documentValidation(String numberOfDoc) throws DocumentValidationException {
        if (!numberOfDoc.contains("abc")) {
            throw new AbcException("Document number must contain \"abc\"");
        }
        if (!numberOfDoc.startsWith("555")) {
            throw new SequenceNumberException("Document number should start with \"555\"");
        }
        if (!numberOfDoc.endsWith("1a2b")) {
            throw new FinishOfDocException("Document number should end with \"1a2b\"");
        }
        return true;
    }

    void showInfo() {

    }
}
