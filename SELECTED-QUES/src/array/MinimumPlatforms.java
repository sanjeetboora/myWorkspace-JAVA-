package array;

import java.util.*;

//https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
public class MinimumPlatforms {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int trains = scn.nextInt();
		float[] arrival = new float[trains];
		float[] dep = new float[trains];
		for (int i = 0; i < trains; i++) {
			arrival[i] = scn.nextFloat();
		}
		for (int j = 0; j < trains; j++) {
			dep[j] = scn.nextFloat();
		}
		Arrays.sort(arrival);
		Arrays.sort(dep);
		System.out.println(minPlatforms(arrival, dep, trains));
	}

	public static int minPlatforms(float[] arrival, float[] dep, int trains) {
		int platform = 1, result = 1;
		int a = 1, d = 0;
		while (a < trains) {
			if (dep[d] >= arrival[a]) {
				platform++;
				a++;
				if (platform > result) {
					result = platform;
				}
			}

			else {
				platform--;
				d++;
			}
		}
		return result;
	}
}
