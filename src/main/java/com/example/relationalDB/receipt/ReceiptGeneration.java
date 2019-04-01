package com.example.relationalDB.receipt;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class ReceiptGeneration {

	File htmlTemplateFile=null;
	{
		try {
			htmlTemplateFile = new ClassPathResource("templates/receipt.html").getFile();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
