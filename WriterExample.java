package Files;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("B.txt");
		fw.write("WelocmetoJava");
        fw.close();
        System.out.println("created");

	}

}
