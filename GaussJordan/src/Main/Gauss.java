package Main;
public class Gauss {
	public static void main(String [] str) {
		double [][] matrix = {
				{3.0,2.0,1.0,1.0},
				{5.0,3.0,4.0,2.0},
				{1.0,1.0,-1.0,1.0}
		};
		solve(matrix);
	}
	public static void solve(double [][] matrix) {
		matrix = cloneMatrix(matrix);
		double k,multi;
		print(matrix);
		for(int i = 0; i < matrix.length; i++) {
			k = matrix[i][i];
			if(round(k,3) != 1) {
				for(int j = i; j < matrix[i].length; j++) {
					matrix[i][j] /= k;
				}
				print(matrix);
			}
			for(int x = i + 1; x < matrix.length; x++) {
				multi = matrix[x][i];
				if(multi != 0) {
					for(int j = i; j < matrix[x].length; j++) {
						matrix[x][j] -= multi * matrix[i][j];
					}
					print(matrix);
				}
			}
		}
		double[] solucion = new double [matrix.length];
		String solution = "Sustitución hacia atrás",signo;
		String[] literales = {"x","y","z","w","r"};
		for(int x = matrix.length - 1; x >= 0; x--) {
			solucion[x] = matrix[x][matrix.length];
			solution += "\n" + literales[x] + " = " + round(solucion[x],3);
			for(int j = x + 1; j < matrix.length; j++) {
				solucion[x] -= matrix[x][j] * solucion[j];
				signo = " - ";
				if(matrix[x][j] < 0) signo = " + ";
				solution += signo + abs(round(matrix[x][j],3)) + "(" + round(solucion[j],3) + ")";
			}
			if(x < matrix.length - 1) solution += " = " + round(solucion[x],3);
		}
		System.out.println(solution + "\n");
		for(int i = 0; i < solucion.length; i ++) {
			System.out.println(literales[i] + " = " + round(solucion[i],3));
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
	public static double abs(double a) {
		return Math.abs(a);
	}
}
