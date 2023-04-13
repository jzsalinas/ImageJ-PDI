package py.com.pdi;

import ij.ImagePlus;
import ij.process.ImageProcessor;

public class InvertirImagen {

	public static void main(String [] args ) {
		ImagePlus im = new ImagePlus("imagenes/einstein-low-contrast.tif");
		
		ImagePlus im2 = im.duplicate();
		
		im2.show();
		
//		ComputeHistogram ch = new ComputeHistogram();
//		
//		ch.setup(null, im);
//		
//		ImageProcessor ip = im.getProcessor();
//		
//		ch.run(ip);
		
		AutoContraste ac = new AutoContraste();
		
		ac.setup(null, im);
		
		ImageProcessor ip = im.getProcessor();
		
		ac.run(ip);
		
		im.show();
	}

}
