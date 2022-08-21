package Files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class EmployeeMain {


	public static void main(String[] args) throws IOException {
		Employee emp=new Employee(1001,"gayathri",345000);
		Employee emp1=new Employee(1002,"Ravi",565000);
		Employee emp2=new Employee(1003,"kavi",905000);
		FileOutputStream fw=new FileOutputStream("output.txt");
		
		ObjectOutputStream out=new ObjectOutputStream(fout);
         out.writeObject(emp);
         out.writeObject(emp1);
         out.writeObject(emp2);
         out.flush();
         out.close();
         System.out.println("Serialization and Deserialization is been successfully executed");


	}
}
