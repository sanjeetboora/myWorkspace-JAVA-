import java.util.*;
class Interval {
		int start;
		int end;
	 
		public Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
	 
	class MyComparator implements Comparator<Interval> {
		public int compare(Interval a, Interval b) {
			return b.start - a. start;
		}
	}
public class rough {
	
	 
	 
		static int max(int a, int b) {
			return (a>b)?a:b;
		}
	 
		static int min(int a, int b) {
			return (a<b)?a:b;
		}
	 
		static void mergeOverlappingIntervals(Interval[] arr) {
	 
			int n = arr.length;
	 
			Arrays.sort(arr,new MyComparator());
	 
			int index = 0;
			for(int i=0;i<n;i++) {
				if(index != 0 && arr[i].end >= arr[index-1].start) {
					while(index != 0 && arr[i].end >= arr[index-1].start) {
						arr[index-1].start =  min(arr[index-1].start,arr[i].start);
						arr[index-1].end = max(arr[index-1].end,arr[i].end);
						index--;
					}
				}
				else
					arr[index] = arr[i];
				index++;
			}
	 
			for(int i=0;i<index;i++)
				System.out.print("[" + arr[i].start + ", " + arr[i].end + "], ");
			System.out.println();		
	 
		}
	 
		static void printArray(Interval[] arr) {
			for(int i=0;i<arr.length;i++)
				System.out.print("[" + arr[i].start + ", " + arr[i].end + "], ");
			System.out.println();
		}
	 
		public static void main(String[] args) {
			Interval[] arr = {new Interval(1,3),new Interval(2,4),new Interval(5,7), new Interval(6,8)};
	 
			printArray(arr);
	 
			mergeOverlappingIntervals(arr);
		}
	}
