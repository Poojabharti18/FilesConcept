package Files;

public class StudentFileReader {

	public static void main(String[] args) {
		public void read() throws IOException
		{
		Student s1=new Student(1001,"gayathri","CBE");
		Student s2=new Student(1002,"ravi","HYD");
		Student s3=new Student(1003,"hari","Banglore");
		ArrayList<Student>studentlist=new ArrayList<Student>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		FileReader f=new FileReader("d:/student.csv");
		BufferedReader br=new BufferedReader(f);
		String col=br.readLine();
		String row=br.readLine();
		while(row!=null)
		{
			String []data=row.split(",");
			String id=data[0];
			String name=data[1];
			String address=data[2];
			row=br.readLine();
		}
		}
		

	

	}

}
