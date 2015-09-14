

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WordGenerator {

    private File input;
    private int wordCount = 0;
    private int sentenceCount = 0;
    private Scanner text;

    public WordGenerator(String filename) throws IOException{
        this.input = new File(filename);
        this.text = new Scanner(input);
    }

    public boolean hasNext() {
        return text.hasNext();
    }

    public String next() {
    	String currentWord = text.next();
    	this.wordCount++;
    	if(currentWord.charAt(currentWord.length()-1) == '.' ||
    	   currentWord.charAt(currentWord.length()-1) == '!' ||
    	   currentWord.charAt(currentWord.length()-1) == '?')
    		this.sentenceCount++;
    	
        return currentWord;
    }

    public int getWordCount() {
        return this.wordCount;
    }


    public int getSentenceCount() {
        return this.sentenceCount;
    }
   
	
   

}
