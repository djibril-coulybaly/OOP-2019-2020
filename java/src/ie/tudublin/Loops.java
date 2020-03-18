package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{

	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		// background(0);		
		// stroke(255);
		// line(10, 10, 100, 10);
		// line(10, 20, 100, 20);
		// line(10, 30, 100, 30);
		// line(10, 40, 100, 40);

		// for(int y = 10 ; y <= 40 ; y += 10)
		// {
		// 	line(200, y, 300, y);
		// }

		// int yy = 10;
		// while(yy <= 40)
		// {
		// 	line(300, yy, 400, yy);
		// 	yy += 10;
		// }
		
		//picture1();
		//picture2();
		//picture3();
		//picture4();
		picture5();
	}

	public void picture1() {
		background(244,244,244);
		int x1 = 0;
		int y1 = 0;
		int w = width;
		int h = height;
		int xcentre = (width/2);
		int ycentre = (height/2); 


		for (y1 = 0; y1 <= h; y1 += 20) {
			stroke(0,0,0);
			line(x1, y1, xcentre, ycentre);
		}

		for (x1 = 0; x1 <= w; x1 += 20) {
			stroke(0,0,0);
			line(x1, y1, xcentre, ycentre);
		}

		for (; y1 > h-h; y1 -= 20) {
			stroke(0,0,0);
			line(x1, y1, xcentre, ycentre);
		}

		for (; x1 > w-w; x1 -= 20) {
			stroke(0,0,0);
			line(x1, y1, xcentre, ycentre);
		}
	}

	public void picture2() {
		int w = width;
		int h = height;
		int x = 25;
		int y = 50;

		int circleHeight = 50;
		int circleWidth = 50;

		background(244,244,244);

		for (; x < w; x += 50){
			fill(255,255,255);
			ellipse(x, y, circleWidth, circleHeight);
		}


	}

	public void picture3() {
		colorMode(HSB); //Sets the colorMode to HSB (Hue, Saturation and Brightness)
		noStroke();	//Removes the border from shapes after this line	

		float numBoxes = 10;  //Declaring the number of rectangles that we want 
		float colourSplit = (255/numBoxes); //Splitting the colour palette evenly by the number of rectangles that we've declared
		float gap = width / numBoxes; //how big we want the rectangle boxes to be

		for (int i = 0; i < numBoxes; i++) {
			fill(colourSplit * i, 255, 255);
			rect(i * gap, 0, gap, height);
		}	
	}

	public void picture4() {
		colorMode(HSB); //Sets the colorMode to HSB (Hue, Saturation and Brightness)
		noStroke();	//Removes the border from shapes after this line

		float numCircles = 10;  //Declaring the number of rectangles that we want 
		float colourSplit = 255 / numCircles; //Splitting the colour palette evenly by the number of rectangles that we've declared
		float diameter = width / numCircles; //how big we want the rectangle boxes to be
		float radius = diameter / 2;

		for (int i = 0; i < numCircles; i++){
			float x = radius + (i * diameter);
			fill(colourSplit * i, 255, 255);
			ellipse(x, radius, diameter, diameter);
		}
	}
	
	public void picture5() {
		// background(0);
		// stroke(0,255,0);
		// while (x <  width - x1) {
		// 	line(x, y, x, height - y);
		// 	x = x + ls;
		// }

		// while (y <=  height - y1) {
		// 	line(x, y, width - x, y);
		// 	y = y + ls;
		// }

		float lineSpacing = width * 0.1f; // Creates a variable that determines the spacing between each line
		float halfLineSpacing = lineSpacing / 2.0f; /* Creates a variable that determines the spacing between 
													   the line and the label axis */
		colorMode(RGB); // Sets the colour range to RGB (Red, Green, Blue)
		background(0);
		stroke(0, 255, 0);
		textAlign(CENTER, CENTER); // Aligns the text of the axis labels both horizontally and vertically
		for(int i = -5 ; i <=5 ; i ++) // For loop to draw the grid from the ranges -5 to 5
		{
			//Drawing the vertical and horizontal lines of the grid
			float x = map(i, -5, 5, lineSpacing, width -lineSpacing); /* Converting the range currently set in i from 
																		-5 - 5 to lineSpacing and width -lineSpacing
																		into the variable x */ 				
			line(x, lineSpacing, x, height - lineSpacing); //Draws the horizontal line of the grid  
			line(lineSpacing, x, width - lineSpacing, x); //Drawing the vertical line of the grid
			
			//Drawing the axis labels on the grid
			fill(255); //Sets the colour of the text to white
			text(i, x, halfLineSpacing); // Displays the axis label horizontally
			text(i, halfLineSpacing, x); // Displays the axis label vertically
		}
	}
	
}
