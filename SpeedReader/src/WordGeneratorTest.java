import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;


public class WordGeneratorTest {
	/* File tested contained the following:
	 * Hello, this is a test file.
	 * This file has exactly 18 words.
	 * It also has only 3 sentences.
	 */
	
	
	
	@Test
	public void testGetWordCount() throws IOException {
		WordGenerator testFile = new WordGenerator("/home/gopalasw/csc207/labs/csc207-speed-reader/text.txt");
		while(testFile.hasNext())
	    {
        	testFile.next();
        }
		assertEquals("testFile.getWordCount = 18", 18, testFile.getWordCount());
	}
	@Test
	public void testGetSentenceCount() throws IOException {
		WordGenerator testFile = new WordGenerator("/home/gopalasw/csc207/labs/csc207-speed-reader/text.txt");
		while(testFile.hasNext())
	    {
        	testFile.next();
        }
		assertEquals("testFile.getSentenceCount = 3", 3, testFile.getSentenceCount());
	}
}
