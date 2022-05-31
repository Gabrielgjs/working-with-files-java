package application;

import java.io.File;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// Manipulando pastas com File
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = scan.nextLine();
		
		File path = new File(strPath);
		
		File[]  folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
 		
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		scan.close();
	}

}
