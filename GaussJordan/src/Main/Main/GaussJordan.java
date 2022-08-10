package Main;

import java.util.Scanner;

public class GaussJordan {
	public static void main(String [] str) {
		Scanner sc = new Scanner(System.in);
		/*
		double [][] matrix = {
				{3.0,2.0,1.0,1.0},
				{5.0,3.0,4.0,2.0},
				{1.0,1.0,-1.0,1.0}
		};*/
		/*f0: 2,4,6
		f1: 3,5,7
		*/
		
		System.out.print("Tamaño del sistema: ");
		int tamano = sc.nextInt();
		String [][] entrada = new String [tamano][tamano + 1];
		double [][] matrix = new double [tamano][tamano + 1];
		String [] nums;
		System.out.println("Ingrese los valores separados por comas: ");
		for(int i = 0; i < tamano; i++) {
			System.out.print("f" + i + ": "); 
			entrada[i] = sc.next().split(",");
		}
		for(int i = 0; i < entrada.length; i++) {
			for(int j = 0; j < entrada[i].length; j++) {
				matrix[i][j] = Double.valueOf(entrada[i][j]);
			}
		}
		System.out.println();
		solve(matrix);
	}
	public static void solve(double [][] matrix) {
		matrix = cloneMatrix(matrix);
		double k = 0;
		double multi;
		print(matrix);
		//System.out.println();
		for(int i = 0; i < matrix.length; i++) {
			k = matrix[i][i];
			if(k != 1) {
				for(int j = i; j < matrix[i].length; j++) {
					matrix[i][j] /= k;
				}
				print(matrix);
			}
			for(int x = 0; x < matrix.length; x++) {
				if(x != i) {
					multi = matrix[x][i];
					if(multi != 0) {
						for(int j = i; j < matrix[x].length; j++) {
							matrix[x][j] -= multi * matrix[i][j];
						}
						print(matrix);
					}
				}
			}
		}
		String[] literales = {"x","y","z","w","r"};
		for(int i = 0; i < matrix.length; i ++) {
			System.out.println(literales[i] + " = " + round(matrix[i][matrix[i].length - 1],3));
		}
	}
	public static double [][] cloneMatrix(double [][] matrix){
		double [][] newMatrix = new double [matrix.length][matrix[0].length];
		for(int i = 0; i < newMatrix.length; i ++) {
			for(int j = 0; j < newMatrix[i].length; j++) {
				newMatrix[i][j] = matrix[i][j];
			}
		}
		return newMatrix;
	}
	public static void print(double [][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			String format = "%-10s";
			for(int j = 0; j < matrix[i].length; j++) {
				if(j == matrix[i].length - 1) {
					System.out.print("     |     ");
				}
				if(j == matrix[i].length - 2) {
					format = "%-6s";
				}
				
				System.out.printf(format,round(matrix[i][j],3));
			}
			System.out.println();
		}
		System.out.println();
	}
	public static double round(double valor,int decimales) {
		return frac(Math.round(valor*potencia(10,decimales)),potencia(10,decimales));
	}
	public static double potencia(double base,double exponente) {
		return Math.pow(base,exponente);
	}
	public static double frac(double a,double b) {
		return a/b;
	}
}
