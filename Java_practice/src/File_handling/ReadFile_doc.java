package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile_doc {

	public static void main(String[] args) throws FileNotFoundException {
		List<String>lines=new ArrayList<String>();
		FileInputStream f=new FileInputStream("C:\\Users\\Bhara\\OneDrive\\Desktop\\JAVA Selenium\\Java_practice Hellodoc.docx");
		int line;
		while((line=f.read())!=-1)
		{
			System.out.println((char)line);
		}
		for(String l:lines)
		{
			System.out.println((char)line);
		}

	}

}
