import java.util.Scanner;

public class Map {
	public static void main(String[] args){
		/* Read in the values */
		Scanner scan = new Scanner(System.in);
		int treatCount = Integer.parseInt(scan.nextLine());
		double[][] treats = new double[treatCount][2];
		for (int i = 0; i < treatCount; i++){
			String[] temp = scan.nextLine().split(" ");
			treats[i][0] = Double.parseDouble(temp[0]);
			treats[i][1] = Double.parseDouble(temp[1]);
		}

		double x = 0.5, y = 0.5;

		/* Check any values */
		for (int i = 0; i < treatCount; i++){
			System.out.println(treats[i][0] + ", " + treats[i][1]);
		}
	}
}