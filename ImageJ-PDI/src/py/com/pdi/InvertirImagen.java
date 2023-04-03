package py.com.pdi;

import ij.ImagePlus;

public class InvertirImagen {

	public static void main(String [] args ) {
		ImagePlus im = new ImagePlus("imagenes/blurry-moon.tif");
		
		im.show();
	}

}
