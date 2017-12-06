/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfilesize;

import java.io.File;

/**
 *
 * @author Kayum-603
 */
public class TestFileSize {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)
    {
		File file =new File("‪C:\Users\Sourav\Documents\live.pptx");

		if(file.exists()){

			double bytes = file.length();
			double kilobytes = (bytes / 1024);
			double megabytes = (bytes / (1024 * 1024)); // or double megabytes = (kilobytes / 1024);
//			double gigabytes = (megabytes / 1024);
//			double terabytes = (gigabytes / 1024);

			System.out.println("bytes : " + bytes);
			System.out.println("kilobytes : " + kilobytes);
			System.out.println("megabytes : " + megabytes);

		}else{
			 System.out.println("File does not exists!");
		}

    }
    
}
