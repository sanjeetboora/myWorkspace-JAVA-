import java.util.ArrayList;

public class Heap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("A", 100, 12);
		Student s2 = new Student("B", 1500, 1);
		Student s3 = new Student("C", 700, 6);
		Student s4 = new Student("D", 200, 11);
		Student s5 = new Student("E", 1300, 2);
		Student s6 = new Student("F", 600, 7);
		Student s7 = new Student("G", 300, 10);
		Student s8 = new Student("H", 800, 5);
		Student s9 = new Student("I", 1200, 3);
		Student s10 = new Student("J", 400, 9);
		Student s11 = new Student("K", 900, 4);
		Student s12 = new Student("L", 500, 8);

		Heap<Student> heap = new Heap<>(false);
		heap.add(s1);
		heap.add(s2);
		heap.add(s3);
		heap.add(s4);
		heap.add(s5);
		heap.add(s6);
		heap.add(s7);
		heap.add(s8);
		heap.add(s9);
		heap.add(s10);
		heap.add(s11);
		heap.add(s12);
		heap.display();
		while (!heap.isEmpty()) {
			Student st = heap.remove();
			System.out.println(st);
		}
	}

	private static class Student implements Comparable<Student> {
		String name = "";
		int marks = 0;
		int rank = 0;

		public Student(String name, int marks, int rank) {
			this.name = name;
			this.marks = marks;
			this.rank = rank;

		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.rank - o.rank;
		}

		@Override
		public String toString() {
			String rv = "";
			rv += this.marks;
			return rv;
		}

	}

//	public static ArrayList<Integer> mergesortedALs(ArrayList<ArrayList<Integer>> AL) {
//		Heap<mover> rv = new Heap<mover>(false);
//		ArrayList<mover> one = new ArrayList<mover>();
//		for (int list = 0; list < AL.size(); list++) {
//			mover content = new mover(list, 0, AL.get(list).get(0));
//			rv.add(content);
//		}
//		if()
//
//		return rv;
//	}

	private static class mover implements Comparable<mover> {
		int data;
		int list_no;
		int index;

		public mover(int list_no, int index, int data) {
			this.data = data;
			this.list_no = list_no;
			this.index = index;
		}

		@Override
		public int compareTo(mover o) {
			// TODO Auto-generated method stub
			return this.data - o.data;
		}

	}
}
