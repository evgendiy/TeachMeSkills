package homework7.task3;

import java.util.Date;

public abstract class Document {
    Date dateOfDocuments;
    String numberOfDocument;

    public Document() {
    }

    public Document(Date dateOfDocuments, String numberOfDocument) {
        this.dateOfDocuments = dateOfDocuments;
        this.numberOfDocument = numberOfDocument;
    }
    void showInfo(){

    }
}
