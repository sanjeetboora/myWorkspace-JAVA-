import java.util.Comparator;

public class GenericLinkedList_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// GenericLinkedList<T> ll = new GenericLinkedList<>();
		// GenericLinkedList<T> l2 = new GenericLinkedList<>();
		// ll.addLast(10);
		// System.out.println(ll);
		// ll.addLast(70);
		// System.out.println(ll);
		// ll.addLast(50);
		// System.out.println(ll);
		// ll.addLast(30);
		// System.out.println(ll);
		Integer[] arr = { 4, 56, 2, 67, 38, 2 };
		Integer[] arr2 = { 4, 56, 2, 67, 38, 2 };
		bubbleSort(arr);
		display(arr);
		Car[] cars=new Car[5];
		cars[0]=new Car(10, 100);
		cars[1]=new Car(100, 100);
		cars[2]=new Car(50000, 100);
		cars[3]=new Car(80, 100);
		cars[4]=new Car(120, 100);
		
		bubbleSort(cars,CarSctor<cars>);
		display(cars);	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		int counter = 1;
		while (counter < arr.length) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			counter++;
		}

	}

	public static <T> void bubbleSort(T[] arr, Comparator<T> ctor) {
		int counter = 1;
		while (counter < arr.length) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (ctor.compare(arr[i], arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			counter++;
		}

	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {

			System.out.print(val + " ");
		}
	}

	public static class Car implements Comparable<Car> {
		private int speed;
		private int price;

		public Car(int price, int speed) {
			this.price = price;
			this.speed = speed;
		}

		@Override
		public int compareTo(Car o) {
			// TODO Auto-generated method stub
			return this.price - o.price;
		}

	}

	private static class CarSctor implements Comparator<Car>{
		@Override
		public int compare(Car o1, Car o2) {
			// TODO Auto-generated method stub
			return o1.speed - o2.speed;
		}
		
	}
}