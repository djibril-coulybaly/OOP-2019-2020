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
		background(0);
		float numSquare = 10;
		float sqLength = width/numSquare;

		for (int i = 0; i < numSquare; i++) {
			for (int j = 0; j < numSquare; j++) {
				stroke(0,255,0);
				rect(i *sqLength, j * sqLength, sqLength, sqLength);
			}
		}
	}
}
