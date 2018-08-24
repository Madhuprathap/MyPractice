package com.images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CopyWrite {

	public static void main(String[] args) {
		BufferedImage img = null;
		File f = null;

		//read image
		try
		{
			f = new File("./Dog.jpg");
			img = ImageIO.read(f);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

		//get image width and height
		int width = img.getWidth();
		int height = img.getHeight();
		System.out.println(width + " " + height);

	}

}
