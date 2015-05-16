import java.util.Scanner;
import java.util.ArrayList;

public class Map {
	private static double x = 0.5, y = 0.5, totalDist = 0;

	public static void main(String[] args){
		/* Read in the values */
		Scanner scan = new Scanner(System.in);
		int treatCount = Integer.parseInt(scan.nextLine());
		ArrayList<Double[]> treats = new ArrayList<>();
		for (int i = 0; i < treatCount; i++){
			String[] temp = scan.nextLine().split(" ");
			Double[] treat = { Double.parseDouble(temp[0]), Double.parseDouble(temp[1]) };
			treats.add(treat);
		}

		/* Brute force attempt */
		while (treats.size() > 0){
			/* Find the closest one then remove it */
			double minDist = 1;
			int index = 0;
			double nextX = 0, nextY = 0;
			for (int i = 0; i < treats.size(); i++){
				double x2 = treats.get(i)[0], y2 = treats.get(i)[1];
				double dist = Math.min( getDist(x, y, x2, y2), minDist );
				if (dist < minDist){
					minDist = dist;
					index = i;
					nextX = x2;
					nextY = y2;
				}
			}

			totalDist += minDist;
			x = nextX;
			y = nextY;
			treats.remove(index);
		}

		System.out.println(totalDist);
	}

	/* Linear distance function */
	private static double getDist(double x1, double y1, double x2, double y2){
		return Math.sqrt( (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) );
	}
}