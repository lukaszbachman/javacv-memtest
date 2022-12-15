package io.bitmasters;

import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.MatExpr;
import org.bytedeco.opencv.opencv_core.Size;

/**
 * @author Lukasz Bachman
 */
public class MemTest {

	static {
		System.setProperty("org.bytedeco.javacpp.logger.debug", "true");
	}

	public static void main(String[] args)
			  throws Exception
	{
		System.out.println("This is a test");
		System.out.println("PID: " + ProcessHandle.current().pid());
		Thread.sleep(10_000);

		// NOTE: uncomment code INSIDE ONE of these two methods below and import
		// appropriate classes
		loadFfmpeg(); // This has OKish memory consumption
		loadOpenCv(); // This loads makes the process consume 8GBs of RAM
		Thread.sleep(50_000);
		System.out.println("DONE");
	}

	private static void loadOpenCv() {
		MatExpr zeroes = Mat.zeros(new Size(10), 0);
		System.out.println(zeroes.size());
	}

	private static void loadFfmpeg() {
		//		try (AVClass klass = avcodec.av_bsf_get_class()) {
		//			System.out.println(klass);
		//		}
	}
}
