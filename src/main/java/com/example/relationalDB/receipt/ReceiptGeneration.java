package com.example.relationalDB.receipt;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Component
public class ReceiptGeneration {
    private static final Logger logger = LoggerFactory.getLogger(ReceiptGeneration.class);

    public String generate(String fileName) {
        File templateFile;
        File tempFile = null;
        String htmlString;

        try {
            templateFile = new ClassPathResource("templates/receipt.html").getFile();
            tempFile = File.createTempFile(System.currentTimeMillis() + "", ".html");
            tempFile.getParentFile().mkdirs();
            File htmlTemplateFile = new File(templateFile.getAbsolutePath());
            htmlString = FileUtils.readFileToString(htmlTemplateFile, "UTF-8");
            htmlString = htmlString.replace("$janAmount", "1,000");
            htmlString = htmlString.replace("$febAmount", "2,000");
            FileUtils.writeStringToFile(tempFile, htmlString, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        ConverterProperties converterProperties = new ConverterProperties();
        try (FileOutputStream pdfFile = new FileOutputStream(fileName)) {
            HtmlConverter.convertToPdf(new FileInputStream(tempFile), pdfFile,
                    converterProperties);
        } catch (IOException e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        tempFile.deleteOnExit();
        return fileName;
    }


}
