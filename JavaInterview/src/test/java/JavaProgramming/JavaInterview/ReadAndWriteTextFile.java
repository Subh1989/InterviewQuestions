package JavaProgramming.JavaInterview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteTextFile {

	public static void main(String[] args) throws IOException {
		
		ReadAndWriteTextFile.readText();
		ReadAndWriteTextFile.writeText();

	}

	private static void writeText() throws IOException {
		
		FileWriter fw = new FileWriter(System.getProperty("user.dir")+"\\WriteText");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("The Testing is completed");
		bw.close();
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\WriteText");
		BufferedReader br = new BufferedReader(fr);
		String s;
		if((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		
	}

	private static void readText() throws IOException {
		
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\ReadText");
		BufferedReader br = new BufferedReader(fr);
		String s;
		if((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		
	}

}
