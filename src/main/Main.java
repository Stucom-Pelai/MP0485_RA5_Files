package main;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		File f = new File(System.getProperty("user.dir") + File.separator + "resources/output.txt");
		File newFolder = new File("resources");
		// Check if folder exist, but it is created
		if (!newFolder.exists()) {
			newFolder.mkdir();
		}
		// Check if file exists
		if (!f.exists()) {
			f.createNewFile();
		}
	
		if (f.canRead()) {
			readFile(f);
		} else if (f.canWrite()) {
			writeFile(f);
		} else {
			System.out.println("Error writing in file");
		}
	
	}

	/**
	 * Read a file and show by console
	 */
	public static void readFile(File f) throws IOException {
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		fr.close();
		br.close();
	}

	/**
	 * Write a file with info from an array list
	 */
	public static void writeFile(File f) throws IOException {
		FileWriter fw = new FileWriter(f, true);
		PrintWriter pw = new PrintWriter(fw);
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> products = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Add new product: " + i);
			System.out.print("Write name: ");
			String name = sc.next();
			System.out.print("Write price: ");
			float price = sc.nextFloat();
			System.out.print("Write description: ");
			String description = sc.next();
			// add products to array list
			products.add(new Product(price, name, description));
			// Write data in file
			pw.append(products.get(i).toString());
		}
		pw.close();
		fw.close();

	}

}
