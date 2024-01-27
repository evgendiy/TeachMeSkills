package homework7.task3;

import java.util.Date;

public abstract class Document {
    Date dateOfDocuments;
    int numberOfDocument;

    public Document() {
    }

    public Document(Date dateOfDocuments, int numberOfDocument) {
        this.dateOfDocuments = dateOfDocuments;
        this.numberOfDocument = numberOfDocument;
    }
    void showInfo(){

    }
}
