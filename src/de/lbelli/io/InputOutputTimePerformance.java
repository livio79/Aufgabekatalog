package de.lbelli.io;

import java.io.*; 
 

public class InputOutputTimePerformance {
	public static void main(String[] args) {
		String input = "C:\\Users\\belli\\Desktop\\MEDIA\\Immagini\\bvb.png";
		String output ="C:\\Users\\belli\\Desktop\\MEDIA\\bvb2.png";
		long start, end;
		int [] byteSize = {1, 2, 4, 8, 16, 32, 64, 256, 1024, 2048, 4096};
		 
		 try ( FileInputStream fis  = new FileInputStream(input);
			   FileOutputStream fos = new FileOutputStream(output);) {
			 
			 for(int i = 0; i < byteSize.length; i++) {
			 
				 start = System.nanoTime();
				 
				 byte [] bytes = new byte[byteSize[i]];
				 int in = 0;
				 
				 while((in = fis.read(bytes)) != -1) {
					 fos.write(bytes, 0, in);
				 }
				 
				 end = System.nanoTime();
				 System.out.printf("Time: [%4d] %d5\n"  ,  byteSize[i],  (end - start));
			 }
			 
		 } catch (IOException e) {
			 e.getStackTrace();
		 }
	}
}
