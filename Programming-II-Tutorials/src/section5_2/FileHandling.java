package section5_2;

import java.io.*;

public class FileHandling {

	public static void main(String[] args) {

		File in = new File("src/in.txt"); // You have to create your own file and fill it with text - default Eclipse
											// directory is within project directory

		File out = new File("src/out.txt"); // If you haven't created it will be created automatically

		// Deprecated way to read from files [Deprecated means old and have been
				// replaced]

				/* try {
				 FileInputStream fis = new FileInputStream(file);
				 BufferedInputStream bis = new BufferedInputStream(fis);
				 DataInputStream dis = new DataInputStream(bis);
				 dis.readLine();
				 } catch (FileNotFoundException e1) {
				 e1.printStackTrace();
				 }
				 */
		
		try {
			FileReader fileReader = new FileReader(in);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			FileWriter filewriter = new FileWriter(out);
			BufferedWriter bufferedWriter = new BufferedWriter(filewriter);

			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				System.out.println(line); // To print to console
				bufferedWriter.write(line); // To write to file
				bufferedWriter.newLine();// To print new line - Try commenting it and see what will happen

			}
			bufferedReader.close(); // Common practice is to close readers at end of program
			bufferedWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // Prints error tracing
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
