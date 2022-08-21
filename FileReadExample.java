package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fin=new FileInputStream("d:/B.txt");
		try {
		int i=0;
		while(i!=1)
		{
			i=fin.read();
			System.out.println((char)i);
			}
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}

}
