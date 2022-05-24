package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) {
		// FileReader e bufferedReader
		
		String path = "C:\\temp\\in.txt";
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 

	}

}
