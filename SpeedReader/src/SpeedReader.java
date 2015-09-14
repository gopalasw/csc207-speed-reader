import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Color;
public class SpeedReader {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws IOException, InterruptedException {
		String filename;
		int width, height, fontSize, wpm;
		
		if(args.length == 5) {
		filename = args[0];
		width = Integer.parseInt(args[1]);
		height = Integer.parseInt(args[2]);
		fontSize = Integer.parseInt(args[3]);
		wpm = Integer.parseInt(args[4]);
		}
		else {
			System.out.println("Usage: SpeedReader <filename> <width> <height> <font size> <wpm>");
			return;
		}
		
		WordGenerator test = new WordGenerator(filename);
		DrawingPanel outputPanel = new DrawingPanel(width, height);
		Graphics g = outputPanel.getGraphics();
	    Font f = new Font("Courier", Font.BOLD, fontSize);
	    g.setFont(f);
    	Color color = new Color(0, 0, 0);
	    
	    while(test.hasNext())
	    {
	    	g.drawString(test.next(), 100, 100);
	    	Thread.sleep(60000 / wpm);
	    	outputPanel.clearWithoutRepaint();
	    }
	    
	    g.dispose();
	    System.out.println("Number of words: " + test.getWordCount() +
	    		"\nNumber of Sentences: " + test.getSentenceCount());
	}

}
