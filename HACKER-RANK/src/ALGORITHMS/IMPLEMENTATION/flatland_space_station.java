package ALGORITHMS.IMPLEMENTATION;

import java.util.Arrays;
import java.util.Scanner;

public class flatland_space_station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] spacestations = new int[m];
		for (int i = 0; i < m; i++) {
			spacestations[i] = sc.nextInt();
		}
		System.out.println(maxNearestStation(n, spacestations));
	}

	public static int maxNearestStation(int stations, int[] spaceStations) {
		int sTotal = spaceStations.length;
		if (stations == sTotal) { // all stations are space stations
			return 0;
		}

		Arrays.sort(spaceStations);

		/* Difference for initial and final space stations */
		int maxDistance = Math.max(spaceStations[0], (stations - 1) - spaceStations[sTotal - 1]);

		/*
		 * Maximum difference for all the stations & space stations in between
		 * initial and final stations
		 */
		for (int c = 1; c < sTotal; c++) {
			int currentDist = (spaceStations[c] - spaceStations[c - 1]) / 2;
			if (currentDist > maxDistance) {
				maxDistance = currentDist;
			}
		}

		return maxDistance;
	}

}
