package sanketsingh;


	import java.util.Scanner;



	public class ninja {

		int real;
		int imaginary;

		public ninja(int real, int imaginary) {
			this.real = real;
			this.imaginary = imaginary;
		}

		//ninja c2 = new ninja(real, imaginary);

		public void plus(ninja c2) {
			this.real += c2.real;
			this.imaginary += c2.imaginary;
		}

		public void print() {
			System.out.println(this.real + " + " + "i" + this.imaginary);
		}

		public void multiply(ninja c2) {
			int a = (this.real * c2.real) - (this.imaginary * c2.imaginary);
			int i = (this.real * c2.imaginary) + (this.imaginary * c2.real);
			this.real = a;
			this.imaginary = i;

		}
		 public static void main(String[] args) {
				Scanner s = new Scanner(System.in);

				int real1 = s.nextInt();
				int imaginary1 = s.nextInt();

				int real2 = s.nextInt();
				int imaginary2 = s.nextInt();

				ninja c1 = new ninja(real1, imaginary1);
				ninja c2 = new ninja(real2, imaginary2);

				int choice = s.nextInt();
				 
				if(choice == 1) {
					// Add
					c1.plus(c2);
					c1.print();
				}
				else if(choice == 2) {
					// Multiply
					c1.multiply(c2);
					c1.print();
				}
				else {
					return;
				}
			}
		 

		

	}


