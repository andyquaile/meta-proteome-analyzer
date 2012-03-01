package de.mpa.io;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

import org.apache.commons.codec.binary.Base64;

/**
 * Auxiliary class for 64-bit related methods.
 * 
 * @author Alex Behne
 */
public class SixtyFourBitStringSupport {
	
	/**
	 * Method to build a peak HashMap from double arrays representing m/z and intensity pairs.
	 * 
	 * @param mzArray The array of m/z values.
	 * @param inArray The array of intensity values.
	 * @return
	 */
	public static HashMap<Double, Double> buildPeakMap(double[] mzArray, double[] inArray) {
		HashMap<Double, Double> peaks = new HashMap<Double, Double>(mzArray.length);
		for (int i = 0; i < mzArray.length; i++) {
			peaks.put(mzArray[i], inArray[i]);
		}
		return peaks;
	}

	/**
	 * Method to decode a 64-bit String into an array of doubles.<br>
	 * Will use default byte order (big endian).
	 * 
	 * @param encodedString The encoded String.
	 * @return
	 */
	public static double[] decode64bitString(String encodedString) {
		return decode64bitString(encodedString, ByteOrder.BIG_ENDIAN);
	}
	
	/**
	 * Method to decode a 64-bit String into an array of doubles using a specified byte order.
	 * 
	 * @param encodedString The encoded string.
	 * @param byteOrder The byte order.
	 * @return double[]
	 */
	public static double[] decode64bitString(String encodedString, ByteOrder byteOrder) {
		byte[] byteArray = Base64.decodeBase64(encodedString);

        ByteBuffer bb = ByteBuffer.wrap(byteArray);
        bb.order(byteOrder);

        double[] res = new double[byteArray.length/8];
        for (int i = 0; i < res.length; i++) {
        	res[i] = bb.getDouble(i*8);
        }
		return res;
	}

}
