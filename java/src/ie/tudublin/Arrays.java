package ie.tudublin;

// Hello from Bryan

import processing.core.PApplet;

public class Arrays extends PApplet
{	
	//float[] rainFall = new float[12];
	float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for (int i = 0; i < rainFall.length; i++) 
		{
			println(months[i] + "\t" + rainFall[i]);	
		}

		for (float f : rainFall) {
			println(f);
		}

		for (String f : rainFall) {
			println(s);
		}

		int minIndex = 0;

		for (int i = 1; i < rainFall.length; i++) {
			if (rainFall[i] < rainFall[minIndex]) {
				minIndex = i;
			}
		}

		println(months[minIndex] + " has the minimum rainfall of " + );
	
		int maxIndex = 0;

		for (int i = 1; i < rainFall.length; i++) {
			if (rainFall[i] > rainFall[maxIndex]) {
				maxIndex = i;
			}
		}
	}

	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	
	}
}
