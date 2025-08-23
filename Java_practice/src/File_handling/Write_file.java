package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_file {

	public static void main(String[] args) {
		/*try {
		FileWriter w=new FileWriter("sample.txt");
		w.write("Hello");
		//w.newLine();
		w.write("Welcome to java learinig");
		w.close();
		System.out.println(w);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}*/
		
		try
		{
			BufferedWriter w=new BufferedWriter(new FileWriter("sample.txt",true));
			w.write("\nHello");
			w.newLine();
			w.write("\nWelcome to JAVA Learning");
			w.close();
			System.out.println("Write file successfully");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
