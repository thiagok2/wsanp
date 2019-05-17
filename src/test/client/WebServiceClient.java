package test.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import test.client.stubs.FileTransfererImpl;
import test.client.stubs.FileTransfererImplService;

public class WebServiceClient {
	public static void main(String[] args) {
        // connects to the web service
        FileTransfererImplService client = new FileTransfererImplService();
        FileTransfererImpl service = client.getFileTransfererImplPort();
         
        String fileName = "test-upload.zip";
        String filePath = "D:/desenv/MISC/" + fileName;
        File file = new File(filePath);
         
        // uploads a file
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream inputStream = new BufferedInputStream(fis);
            byte[] imageBytes = new byte[(int) file.length()];
            inputStream.read(imageBytes);
             
            service.upload(file.getName(), imageBytes);
 
            inputStream.close();
            System.out.println("File uploaded: " + filePath);
        } catch (IOException ex) {
            System.err.println(ex);
        }      
         
        // downloads another file
        fileName = "test-download.zip";
        filePath = "D:/desenv/MISC/downloads/" + fileName;
        byte[] fileBytes = service.download(fileName);
         
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            BufferedOutputStream outputStream = new BufferedOutputStream(fos);
            outputStream.write(fileBytes);
            outputStream.close();
             
            System.out.println("File downloaded: " + filePath);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
