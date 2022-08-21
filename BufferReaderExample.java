package Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:/student.csv");
		BufferedReader br=new BufferedReader(fr);
		String col=br.readLine();
		System.out.println(col);
		String row=br.readLine();
		while(row!=null)
		{
			String []data=row.split(",");
			String id=data[0];
			String name=data[1];
			String address=data[2];
			System.out.println(id+" "+name+"   "+address);
			row=br.readLine();
		}

	}

}
