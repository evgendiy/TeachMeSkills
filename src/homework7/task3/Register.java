package homework7.task3;

public class Register {

    Document[] documentsArray = new Document[10];
    int countOfdoc = 0;

    public void saveDocument(Document doc) {
        if (countOfdoc < documentsArray.length) {
            documentsArray[countOfdoc] = doc;
            System.out.println("Document retained");
            countOfdoc++;
        }
    }

    public void showDocumentInfo(Document doc) {
        doc.showInfo();
    }

}
