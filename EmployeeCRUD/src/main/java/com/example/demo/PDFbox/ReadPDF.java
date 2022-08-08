package com.example.demo.PDFbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;


public class ReadPDF {
	
  
	@Test
	public void readPDFfile()  throws Exception
	{
		File file=new File("C:\\Users\\Admin\\Downloads\\sample.pdf");
		
	
			FileInputStream fis=new FileInputStream(file);
		
			PDDocument pdfdocument =PDDocument.load(fis);
			
			PDFTextStripper pdfTextStripper=new PDFTextStripper();
			String docText=pdfTextStripper.getText(pdfdocument);
			
			System.out.println(docText);
			
			System.out.println("----------------------------------------"+pdfdocument.getPages().getCount());
			
			pdfdocument.close();
			fis.close();
			
	}

}
