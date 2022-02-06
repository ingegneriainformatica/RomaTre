package gen.gui;


import static gen.gui.CostantiGUI.RISORSA_IMMAGINE_MATTONE;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LettoreImmagini {

	static public Image leggiImmagineMattone() {
		return leggiImmagine(RISORSA_IMMAGINE_MATTONE);
	}

	static public Image leggiImmagineOggetto(String risorsaImmagine) {
		return (BufferedImage)leggiImmagine(risorsaImmagine);
	}
		
	static private Image leggiImmagine(String imagefilename) {
		try {
			return  ImageIO.read(new File(imagefilename));
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("\tCannot read "+imagefilename);
			throw new RuntimeException(e);
		}

	}

}
