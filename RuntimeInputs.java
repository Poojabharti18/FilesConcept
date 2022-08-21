package Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeInputs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the id");
		int id=Integer.parseInt(br.readLine());
		System.out.println("enter the name");
		String name=br.readLine();
		System.out.println("enter the salary");
		float salary=Float.parseFloat(br.readLine());
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);

	}

}
