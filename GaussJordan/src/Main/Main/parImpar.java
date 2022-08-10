package Main;

public class parImpar {
	public static void main(String [] str) {
		String datos = "3,5,6,1,1,6,8,0,3,58,1";
		
		
		//verificarCadena(datos);
		mostrarNumeros(datos);
	}
	public static boolean verificarCadena(String[] numeros) {
		for(int k = 0; k < numeros.length; k ++) {
			for(int i = 0; i < numeros[k].length(); i++) {
				if(!Character.isDigit(numeros[k].charAt(i)) && numeros[k].charAt(i) != ',' && numeros[k].charAt(i) != '-') {
					return false;
				}
			}
		}
		return true;
	}
	public static void mostrarNumeros(String datos) {
		String [] numeros = datos.split(",");
		if(!verificarCadena(numeros)) {
			System.out.println("Cadena inválida");
			return;
		}
		String resultado = "";
		int sumaPar = 0, sumaImpar = 0;
		for(int i = 0; i < numeros.length; i++) {
			try {
				if(Integer.parseInt(numeros[i]) % 2 == 0) {
					resultado += "El número " + numeros[i] + " par";
					sumaPar += Integer.parseInt(numeros[i]);
				}
				else {
					resultado += "El número " + numeros[i] + " impar";
					sumaImpar += Integer.parseInt(numeros[i]);
				}
				resultado += "\n";
			}
			catch(Exception e) {
				System.out.println("Cadena inválida");
				return;
			}
		}
		System.out.println(resultado);
		System.out.println("La suma de los números pares es " + sumaPar);
		System.out.println("La suma de los números impares es " + sumaImpar + "\n");
		if(sumaPar > sumaImpar) System.out.println("La suma de los números pares es mayor a la de los impares");
		else if(sumaImpar > sumaPar) System.out.println("La suma de los números impares es mayor a la de los pares");
		else System.out.println("La suma de los números pares es igual a la de los impares");
	}
}
