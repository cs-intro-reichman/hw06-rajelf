import java.awt.Color;


public class Editor4 {

	public static void main (String[] args) {
		  // Reading command-line arguments
          String filename = args[0];
          int n = Integer.parseInt(args[1]);
  
          // Reading the source image
          Color[][] sourceImage = Runigram.read(filename);
  
          // Generating the grayscale version of the source image
          Color[][] grayscaleImage = Runigram.grayScaled(sourceImage);
  
          // Setting up the canvas for displaying the images
          Runigram.setCanvas(sourceImage);
  
          // Morphing from the source image to its grayscale version
          Runigram.morph(sourceImage, grayscaleImage, n);
      
          import java.awt.Color;

// Converts an Image to a greyscaled version of itself.
// Takes in an image file name and the number of steps for morphing.

public class Editor4 {

	public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Color[][] targetImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(targetImage, sourceImage, n);
	}
}
  
    
  }

  
  


