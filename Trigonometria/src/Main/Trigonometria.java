package Main;
import java.util.Scanner;

class Trigonometria {
	Scanner sc;
	public Trigonometria() {
		sc = new Scanner(System.in);
	}
	double sen(double x,int i) {
		x *= frac(Math.PI,180);
		double sumatoria = 0;
		for(int n = 0; n <= i ; n ++) {
			sumatoria += frac(Math.pow(-1,n) * Math.pow(x,2 * n + 1),fact(2 * n + 1));
		}
		return sumatoria;
	}
	public String sen() {
		System.out.println("SENO");
		System.out.print("Ingrese el valor para x: ");
		double x = Double.valueOf(sc.next());
		System.out.print("Ingrese el valor para i: ");
		int i = sc.nextInt();
		return " -> sen(" + x + ") = " + sen(x,i) + "\n";
	}
	double cos(double x,int i) {
		x *= frac(Math.PI,180);
		double sumatoria = 0;
		for(int n = 0; n <= i; n ++) {
			sumatoria += frac(Math.pow(-1,n) * Math.pow(x,2 * n),fact(2 * n));
		}
		return sumatoria;
	}
	public String cos() {
		System.out.println("COSENO");
		System.out.print("Ingrese el valor para x: ");
		double x = Double.valueOf(sc.next());
		System.out.print("Ingrese el valor para i: ");
		int i = sc.nextInt();
		return " -> cos(" + x + ") = " + cos(x,i) + "\n";
	}
	double tan(double x,int i) {
		return frac(sen(x,i),cos(x,i)); 
	}
	public String tan() {
		System.out.println("TANGENTE");
		System.out.print("Ingrese el valor para x: ");
		double x = Double.valueOf(sc.next());
		System.out.print("Ingrese el valor para i: ");
		int i = sc.nextInt();
		return " -> tan(" + x + ") = " + tan(x,i) + "\n";
	}
	double fact(int n) {
		if(n == 0) return 1;
		return n * fact(n - 1);
	}
	double frac(double a,double b) {
		return a / b;
	}
}