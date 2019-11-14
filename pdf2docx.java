import com.spire.pdf.*;

public class PdfToDoc {

    public static void main(String[] args) {

        //create a PdfDocument object
        PdfDocument doc = new PdfDocument();

        //load a sample PDF file
        doc.loadFromFile("C:\\Users\\dell123\\Desktop\\pdf2doc\\example.pdf");

        //save as .doc file
        doc.saveToFile("C:\\Users\\dell123\\Desktop\\pdf2doc\\ToDoc.doc",FileFormat.DOC);

        //save as. docx file
        doc.saveToFile("C:\\Users\\dell123\\Desktop\\pdf2doc\\ToDocx.docx",FileFormat.DOCX);
        doc.close();
    }
}