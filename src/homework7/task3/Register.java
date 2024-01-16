package homework7.task3;

public class Register {

    Document[] documentsArray = new Document[10];
    int countOfdoc = 0;

    public void saveDocument(Document doc) {
        if (doc instanceof Document) { //нужна ли такая проверка
            documentsArray[countOfdoc] = doc;
            System.out.println("Document retained");
            countOfdoc++;
        } else {
            System.out.println("Wrong document");
        }

    }

    public void showDocumentInfo(Document doc) {
       doc.showInfo();
    }

}
