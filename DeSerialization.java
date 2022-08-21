package Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {



		public static void main(String[] args) throws IOException, ClassNotFoundException {
			FileInputStream fin=new FileInputStream("output.txt");
			   ObjectInputStream in=new ObjectInputStream(fin);
			   Employee e1=(Employee) in.readObject();
			   System.out.println(e1.getId());
			   System.out.println(e1.getName());
			   System.out.println(e1.getSalary());
			   Employee e2=(Employee) in.readObject();
			   System.out.println(e2.getId());
			   System.out.println(e2.getName());
			   System.out.println(e2.getSalary());
			   Employee e3=(Employee) in.readObject();
			   System.out.println(e3.getId());
			   System.out.println(e3.getName());
			   System.out.println(e3.getSalary());
			   
		}

}
