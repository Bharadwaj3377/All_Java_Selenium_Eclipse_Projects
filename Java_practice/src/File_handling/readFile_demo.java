package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readFile_demo {
    public static void main(String[] args) throws IOException {
    	File f=new File("sample.txt");
		if(f.exists())
		{
			System.out.println("File name: "+f.getName());
			System.out.println("File Location : "+f.getAbsolutePath());
			System.out.println("File Size "+f.length());
			System.out.println("File Readable: "+f.canRead());
			System.out.println("File Writable : "+f.canWrite());
			
		}
		else
		{
			System.out.println("File not found");
		}
		
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        for (String lineStr : lines) {
            System.out.println(lineStr);
        }
    }
}

