package tresEnRaya;

import java.awt.image.BufferedImage;
import java.util.HashMap;

public class Sprites {
	private HashMap<String, BufferedImage> sprites = new HashMap<String, BufferedImage>();
	
	private static Sprites instance = null;
	
	private static String Resources_Folder = "../resources/images/";
	
	public Sprites() {
		
	}
	
	public static Sprites getInstance(){
		if (instance == null) {
			instance = new Sprites();
		}
		return instance;
	}
}
