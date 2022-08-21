package Files;

import java.io.FileWriter;

import java.io.IOException;


public class DemoBuffer {

	public static void main(String[] args)throws IOException {
		FileWriter fw=new FileWriter("d:/student.csv");
		fw.write("id,name,Address");
		fw.write("\n12,gayathri,kknagar");
		fw.write("\n13,Ravi,Hyd");
		fw.write("\n14,sugumar,CBE");
		fw.write("\n15,richu,Banglore");
		
		fw.close();

	}

}
