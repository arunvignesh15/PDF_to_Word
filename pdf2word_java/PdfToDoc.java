package Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import com.spire.pdf.*;

public class PdfToDoc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			        //create a PdfDocument object
					String inputfile = "C:\\backup\\JAMES_CRA_2019.pdf";
					String outputdir = "C:\\backup\\output\\";
					String output2 = "C:\\backup\\doc\\";
					PDDocument	doc1 = null;
			        PDDocument doc = PDDocument.load(new File(inputfile));
			        int count = doc.getNumberOfPages();
			        System.out.println(count);
			        Splitter splitter = new Splitter();
			        List<PDDocument> Pages = splitter.split(doc);
			        for(int i=0;i<count;i++)
			        {
			        	doc1 = Pages.get(i);	        	
			        	doc1.save(outputdir+"file_"+ (i+1) +".pdf");
			        }
			        
			        PdfDocument doc2 = new PdfDocument();
			        for(int i=0;i<count;i++)
			        {	 		        	
			        	doc2.loadFromFile(outputdir+"file_"+ (i+1) +".pdf");
			        	doc2.saveToFile(output2+"file_"+ (i+1), FileFormat.DOCX);
			        }
			        doc2.close();
			        
	}

}
