
package ejemplo.trigonometria;

import java.util.Scanner;

public class EjemploTrigonometria {

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        double x=0;
        double i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("TRIGONOMETRIA");
        System.out.println("1. seno");
        System.out.println("2. coseno");
        System.out.println("3. coseno");
        System.out.println("ingrese la opcion a realizar");
        switch(opcion){
            case 1:
                System.out.println("opcion seno");
                System.out.println("ingrese x");
                x=sc.nextDouble();
                System.out.println("ingrese i");
                i=sc.nextDouble();
                int ang=180;
                x *= frac(Math.PI,ang);
		double sumatoriasen = 0;
		for(double n = 0; n <= i ; n ++) {
			sumatoriasen += frac(Math.pow(-1,n) * Math.pow(x,2 * n + 1),fact(2 * n + 1));
		}
                System.out.println(sumatoriasen);
                break;
            case 2:
                System.out.println("opcion seno");
                System.out.println("ingrese x");
                x=sc.nextDouble();
                System.out.println("ingrese i");
                i=sc.nextDouble();
                int ang=180;
                x *= frac(Math.PI,180);
		double sumatoriacos = 0;
		for(int n = 0; n <= i; n ++) {
			sumatoriacos += frac(Math.pow(-1,n) * Math.pow(x,2 * n),fact(2 * n));
		}
                System.out.println(sumatoriacos);
                break;
            case 3:
                System.out.println("opcion tangente");
                System.out.println("ingrese x");
                x=sc.nextDouble();
                System.out.println("ingrese i");
                i=sc.nextDouble();
                ang=180;
                x *= frac(Math.PI,ang);
                sumatoriasen = 0;
		for(double n = 0; n <= i ; n ++) {
			sumatoriasen += frac(Math.pow(-1,n) * Math.pow(x,2 * n + 1),fact(2 * n + 1));
		}
                ang=180;
                x *= frac(Math.PI,180);
	        sumatoriacos = 0;
		for(int n = 0; n <= i; n ++) {
			sumatoriacos += frac(Math.pow(-1,n) * Math.pow(x,2 * n),fact(2 * n));
		}
                double sumatoriatangente=sumatoriasen/sumatoriacos;
                System.out.println(sumatoriatangente);
                break;
        }     
    }
    	double fact(int n) {
		if(n == 0) return 1;
		return n * fact(n - 1);
	}
	double frac(double a,double b) {
		return a / b;
	}

}
