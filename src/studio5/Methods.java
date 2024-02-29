package studio5;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Methods {

	/**
	 * Compute the (Euclidean) distance between two points.
	 *
	 * @param x1 x-coordinate of a point
	 * @param y1 y-coordinate of a point
	 * @param x2 x-coordinate of another point
	 * @param y2 y-coordinate of another point
	 * @return the Euclidean distance between (x1,y1) and (x2,y2)
	 */
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		double distance = 0;
		// FIXME: Hint use Math methods (e.g. Math.sqrt) to compute the distance
		double disE = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		
		return disE;
	}

	/**
	 * Draw a bull's eye at the given location with the given radius.
	 *
	 * @param x      the x coordinate of the center of the bull's eye
	 * @param y      the y coordinate of the center of the bull's eye
	 * @param radius the radius of the bull's eye
	 */
	public static void drawBullsEye(double x, double y, double radius) {
		radius = 1.0;
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, radius);

		// TODO: Draw the remaining rings of the bull's eye
		// Blue ring with 3.0/4.0 the radius
		// suggested rgb values: 0, 109, 219
		
		double radiusB = 3.0/4.0;
			Color blue = new Color(0, 109, 219);
			StdDraw.setPenColor(blue); 
			StdDraw.filledCircle(x, y, radiusB);
	

		// Red ring with 1.0/2.0 the radius
		// suggested rgb values: 146, 0, 0
		
		double radiusR = 1.0/2.0;
			Color red = new Color(146, 0, 0);
			StdDraw.setPenColor(red); 
			StdDraw.filledCircle(x, y, radiusR);
		

		// Yellow ring with 1.0/4.0 the radius
		// suggested rgb values: 255, 255, 109

		double radiusY = 1.0/4.0;
			Color yellow = new Color(255, 255, 109);
			StdDraw.setPenColor(yellow); 
			StdDraw.filledCircle(x, y, radiusY);
}

	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 * 
	 * @param source      the source String
	 * @param target      the target character to be replaced
	 * @param replacement the replacement String
	 * 
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
	public static String substituteAll(String source, char target, String replacement) {
		String result = "hello";
		// TODO: Finish this method

		char ch = '!';
		String concatenatedText = result + ch;
		System.out.println(concatenatedText);
		return result;
	}

	/**
	 * Compute the sum of elements in an array
	 * 
	 * @param values an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];	
		}
		// FIXME: Compute the sum of the values in an array
		return sum;
	}

	/**
	 * Return an array of a given size filled with the provided value
	 * 
	 * @param length the length of the returned array
	 * @param value  the value to fill the array with
	 * @return and array of size that's filled with value
	 */
	public static int[] filledArray(int length, int value) {
		int[] values = new int[length]; // FIXME: Create an array of the appropriate size
		// TODO: Finish this method

		for(int i = 0; i < length; i++) {
				values[i] = value;
		}
		return values;
	}

	// TODO: Create an arrayMean method which accepts an int array of values parameter.
	// TODO: Create a JavaDoc comment for the arrayMean method.
	
	public static double arrrayMean(int[] array) {
		return arraySum (array) / array.length;
	}

	
}
