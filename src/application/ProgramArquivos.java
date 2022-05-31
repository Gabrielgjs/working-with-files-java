package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProgramArquivos {

	public static void main(String[] args) {
		
		String path = "C:\\temp\\in.txt";
		
		List<Product> list = new ArrayList<Product>();
		
		//Comando para abrir o arquivo que está armazenado na variável path.
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();// lê 1 linha do arquivo!
			line = br.readLine();
			while(line != null) {
				
				String[] vect = line.split(","); // recorta variável line a partir da virgula, criando um vetor com os valores contidos em line.
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer  quantity = Integer.parseInt(vect[2]);
				
				Product prod = new Product(name,price,quantity);
				list.add(prod);
				
				line = br.readLine();
			}
			System.out.println("PRODUCTS: ");
			for (Product p : list) {
				System.out.println(p);
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
