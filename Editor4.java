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
      
  
    
  }

  
  


