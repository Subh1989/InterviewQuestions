package JavaProgramming.JavaInterview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompleteTextDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\ReadText");
		BufferedReader reader = new BufferedReader(fr);
  
        String line; 
          
        // Initializing counters 
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
        int paragraphCount = 1; 
        int whitespaceCount = 0; 
          
        // Reading line by line from the  
        // file until a null is returned 
        while((line = reader.readLine()) != null) 
        { 
            if(line.equals("")) 
            { 
                paragraphCount++; 
            } 
            else 
            { 
                characterCount += line.length(); 
                  
                // \\s+ is the space delimiter in java 
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length; 
                whitespaceCount += countWord -1; 
                  
                // [!?.:]+ is the sentence delimiter in java 
                String[] sentenceList = line.split("[!?.:]+"); 
                  
                sentenceCount += sentenceList.length; 
            } 
        } 
          
       System.out.println("Total word count = " + countWord); 
       System.out.println("Total number of sentences = " + sentenceCount); 
       System.out.println("Total number of characters = " + characterCount); 
       System.out.println("Number of paragraphs = " + paragraphCount); 
       System.out.println("Total number of whitespaces = " + whitespaceCount); 

	}

}
