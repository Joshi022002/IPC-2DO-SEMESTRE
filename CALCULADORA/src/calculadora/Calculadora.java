package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        int numero1;
        int numero2;
        int j = 0;
        int y = 0;
        int q = 0;
        int w = 0;
        //variables cadena separada por comas de promedio
        String cadena="";
        String numero="";
        double sumapromedio=0;
        double promedio=0;
        int contadornumeros=0;
        //
        //variables cadena separada por comas de varianza 
        double sumadatos=0;
        double totaldatos=0;
        double varianzatotal=0;
        double contadornumeros2=0;
        //
        //variables para la operacion seno
        int ndatos=0;
        double ncorridas=0;
        int partearriba=0;
        int parteabajo=0;
        int sumafact=0;
        int sumapartearriba=0;
        int sumaparteabajo=0;
        //
        //variables para la desviacion estandar
        double desvestandar=0;
        //
        //scanner enter
        String botonenter="";
        Scanner enter=new Scanner(System.in);
        //
        Scanner operaciones = new Scanner(System.in);
        int [][] matriz = new int [q][w];
        double resultado;
        do{
        opcion=0;
        System.out.println(" ___________________________________________________");
        System.out.println("|                        MENU                       |");
        System.out.println("|___________________________________________________|");
        System.out.println("|        OPCIONES         |    NUMERO DE OPCION     |");
        System.out.println("|___________________________________________________|");
        System.out.println("|       Aritmetica        |            1            |");
        System.out.println("|     trigonometria       |            2            |");
        System.out.println("|      estadistica        |            3            |");
        System.out.println("|        calculo          |            4            |");
        System.out.println("|         Salir           |            5            |");
        System.out.println("|___________________________________________________|");
        System.out.print("por favor ingrese el numero de la accion a realizar: ");
        Scanner leer=new Scanner(System.in); 
        opcion=leer.nextInt(); 
        switch(opcion) {
			case 1:
                            while(opcion!=5){
                                System.out.println("_____________________________________________________");
				System.out.println("|                       ARITMETICA                   |");
                                System.out.println("|____________________________________________________|");
                                System.out.println("|     NUMERO DE OPCION     |         OPCIONES        |");
                                System.out.println("|____________________________________________________|");
                                System.out.println("|____________________________________________________|");
                                System.out.println("|            1.            |           Suma          |");
                                System.out.println("|            2.            |           Resta         |");
                                System.out.println("|            3.            |       Multiplicacion    |");
                                System.out.println("|            4.            |          Division       |");
                                System.out.println("|            5.            |          Regresar       |");
                                System.out.println("|__________________________|_________________________|");
                                System.out.print("por favor ingrese el numero de la accion a realizar: ");
                                opcion=leer.nextInt();
                                switch(opcion) {
                                    case 1:
                                        //opcion suma
                                        System.out.println("----------------------------------------------------------");
                                        System.out.print("ingrese el primer sumando: ");
                                        numero1=leer.nextInt();
                                        System.out.print("ingrese el segundo sumando: ");
                                        numero2=leer.nextInt();
                                        resultado=numero1+numero2;
                                         System.out.println("el resultado de la suma es: "+resultado);
                                         System.out.println("para continuar presione la tecla e");
                                         System.out.println("----------------------------------------------------------");
                                        break;
                                    case 2:
                                        // opcion resta
                                        System.out.println("----------------------------------------------------------");
                                        System.out.print("ingrese el minuendo: ");
                                        numero1=leer.nextInt();
                                        System.out.print("ingrese el sustraendo: ");
                                        numero2=leer.nextInt();
                                        resultado=numero1-numero2;
                                        System.out.println("la diferencia es: "+resultado);
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    case 3:
                                        // opcion multiplicacion
                                        System.out.println("----------------------------------------------------------");
                                        System.out.print("ingrese el multiplicando: ");
                                        numero1=leer.nextInt();
                                        System.out.print("ingrese el multiplicador: ");
                                        numero2=leer.nextInt();
                                        resultado=numero1-numero2;
                                        System.out.println("el producto es: "+resultado);
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    case 4:
                                        //opcion division
                                        System.out.println("----------------------------------------------------------");
                                        System.out.print("ingrese el dividendo: ");
                                        numero1=leer.nextInt();
                                        System.out.print("ingrese el divisor: ");
                                        numero2=leer.nextInt();
                                        
                                        if(numero2==0){
                                            System.out.println("no se puede dividir dentro de cero");
                                        }else{
                                            resultado=numero1/numero2;
                                            System.out.print("el resultado de la suma es: "+resultado);
                                            System.out.println("----------------------------------------------------------");
                                        }
                                        
                                        break;
                                    case 5:
                                        //salir del menu aritmetica
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("has salido del menu ARITMETICA");
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    default:
                                        break;
                                
                                }
                            }
                            opcion = 0;
                        break;
			case 2:
                            // menu 2 trigonometria
                            while(opcion!=4){
                                double x=0;
                                double i = 0;
                                int fact=0;
                                int factres=0;
                                double angulo=0;
                                System.out.println("_____________________________________________________");
				System.out.println("|                    trigonometria                   |");
                                System.out.println("|____________________________________________________|");
                                System.out.println("|     NUMERO DE OPCION     |         OPCIONES        |");
                                System.out.println("|____________________________________________________|");
                                System.out.println("|___________________________________________________ |");
                                System.out.println("|            1.            |           seno          |");
                                System.out.println("|            2.            |          coseno         |");
                                System.out.println("|            3.            |         tangente        |");         
                                System.out.println("|            4.            |         Regresar        |");
                                System.out.println("|__________________________|_________________________|");
                                System.out.print("por favor ingrese el numero de la accion a realizar: ");
                                opcion=leer.nextInt();
                                switch(opcion){
                                    case 1:
                                        
                                        //opcion seno
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("ha seleccionado la opcion Seno");
                                        System.out.println("ingrese el valor para x: ");
                                        x = Double.valueOf(leer.next());
                                        angulo=x;
                                        System.out.println("ingrese el valor para i: ");
                                        i=leer.nextInt();
                                        x *= frac(Math.PI,180);
                                        double sumatoriasen=0;
                                        for(int n=0; n<=i;n++){
                                          sumatoriasen += frac(Math.pow(-1,n) * Math.pow(x,2 * n + 1),fact(2 * n + 1));
                                        }
                                        System.out.println("sen ("+angulo+") ="+sumatoriasen);
                                        System.out.print("presione enter para continuar... ");
                                        botonenter=enter.nextLine();
                                        x=0;
                                        i=0;
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    case 2:
                                        // opcion coseno
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("ha seleccionado la opcion Coseno");
                                        System.out.println("ingrese el valor para x: ");
                                        x = Double.valueOf(leer.next());
                                        angulo=x;
                                        System.out.println("ingrese el valor para i: ");
                                        i=leer.nextDouble();
                                        x *= frac(Math.PI,180);
                                        double sumatoriacos = 0;
                                        for(int n = 0; n <= i; n ++) {
                                        sumatoriacos += frac(Math.pow(-1,n) * Math.pow(x,2 * n),fact(2 * n));
                                        }
                                        System.out.println("cos ("+angulo+") ="+sumatoriacos);
                                        System.out.print("presione enter para continuar... ");
                                        botonenter=enter.nextLine();
                                        x=0;
                                        i=0;
                                        angulo=0;
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    case 3:
                                        //opcion tangente
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("ha seleccionado la opcion Tangente");
                                        System.out.println("ingrese el valor para x: ");
                                        x = Double.valueOf(leer.next());
                                        angulo=x;
                                        System.out.println("ingrese el valor para i: ");
                                        i=leer.nextInt();
                                        x *= frac(Math.PI,180);
                                        sumatoriasen=0;
                                        for(int n=0; n<=i;n++){
                                          sumatoriasen += frac(Math.pow(-1,n) * Math.pow(x,2 * n + 1),fact(2 * n + 1));
                                        }
                                        sumatoriacos = 0;
                                        for(int n = 0; n <= i; n ++) {
                                        sumatoriacos += frac(Math.pow(-1,n) * Math.pow(x,2 * n),fact(2 * n));
                                        }
                                        double sumatoriatan=0;
                                        sumatoriatan=frac(sumatoriasen, sumatoriacos);
                                        System.out.println("cos ("+angulo+") ="+sumatoriatan);
                                        System.out.println("");
                                        System.out.print("presione enter para continuar... ");
                                        botonenter=enter.nextLine();
                                        x=0;
                                        i=0;
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    case 4:
                                        //salir del menu aritmetica
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("has salido del menu TRIGONOMETRIA");
                                         System.out.println("----------------------------------------------------------");
                                        break;
                                    default:
                                        break;
                                }
                            }
                                opcion = 0;
			break;
                            
                        case 3:
                            while(opcion!=4){
                                System.out.println("_____________________________________________________");
				System.out.println("|                     Estadistica                    |");
                                System.out.println("|____________________________________________________|");
                                System.out.println("|     NUMERO DE OPCION     |         OPCIONES        |");
                                System.out.println("|____________________________________________________|");
                                System.out.println("|___________________________________________________ |");
                                System.out.println("|            1.            |         promedio        |");
                                System.out.println("|            2.            |         varianza        |");
                                System.out.println("|            3.            |    desviación estándar  |");         
                                System.out.println("|            4.            |         Regresar        |");
                                System.out.println("|__________________________|_________________________|");
                                System.out.print("por favor ingrese el numero de la accion a realizar: ");
                                opcion=leer.nextInt();
                                switch(opcion){
                                    case 1:
                                        // opcion promedio
                                       System.out.println("----------------------------------------------------------");
                                       System.out.println("ha seleccionado la opcion media");
                                       System.out.println("ingrese una lista de numeros separadas por comas");
                                       cadena=operaciones.nextLine();
                                       String numerosseparados[]=cadena.split(",");
                                       promedio = 0;
                                       sumapromedio = 0;
                                       contadornumeros = 0;
                                       for(int posicionnumero=0; posicionnumero<numerosseparados.length;posicionnumero++){
                                           numero=numerosseparados[posicionnumero]; 
                                           int numeroconvertido=Integer.parseInt(numero);
                                           sumapromedio=sumapromedio+numeroconvertido;
                                           contadornumeros=contadornumeros+1;
                                       }
                                       promedio=sumapromedio/contadornumeros;
                                        System.out.println("promedio ("+cadena+ ") = "+promedio);
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    case 2:
                                        //opcion varianza
                                       System.out.println("----------------------------------------------------------");
                                       System.out.println("ha seleccionado la opcion varianza");
                                       System.out.println("ingrese una lista de numeros separadas por comas");
                                       cadena=operaciones.nextLine();
                                       String numerosseparados2[]=cadena.split(",");
                                       promedio = 0;
                                       totaldatos = 0;
                                       sumapromedio = 0;
                                       contadornumeros = 0;
                                       contadornumeros2 = 0;
                                       for(int posicionnumero=0; posicionnumero<numerosseparados2.length;posicionnumero++){
                                           numero=numerosseparados2[posicionnumero]; 
                                           int numeroconvertido=Integer.parseInt(numero);
                                           sumapromedio=sumapromedio+numeroconvertido;
                                           contadornumeros=contadornumeros+1;
                                       }
                                       promedio=sumapromedio/contadornumeros;
                                       for(int posicionnumero2=0;posicionnumero2<numerosseparados2.length;posicionnumero2++){
                                            contadornumeros2=contadornumeros2+1;
                                            numero=numerosseparados2[posicionnumero2]; 
                                            double numeroconvertido = Double.valueOf(numero);
                                            sumadatos= Math.pow(numeroconvertido-promedio,2);
                                            totaldatos=totaldatos+sumadatos;
                                            sumadatos=0;
                                       }
                                       varianzatotal=totaldatos/(contadornumeros2 - 1);
                                       System.out.println("Varianza ("+cadena+ ") = "+varianzatotal);
                                       System.out.println("----------------------------------------------------------");
                                        break;
                                    case 3:
                                        //opcion desviacion estandar
                                       System.out.println("----------------------------------------------------------");
                                       System.out.println("ha seleccionado la opcion desviacion estandar");
                                       System.out.println("ingrese una lista de numeros separadas por comas");
                                       cadena=operaciones.nextLine();
                                       String numerosseparados3[]=cadena.split(",");
                                       promedio = 0;
                                       totaldatos = 0;
                                       sumapromedio = 0;
                                       contadornumeros = 0;
                                       contadornumeros2 = 0;
                                       for(int posicionnumero=0; posicionnumero<numerosseparados3.length;posicionnumero++){
                                           numero=numerosseparados3[posicionnumero]; 
                                           int numeroconvertido=Integer.parseInt(numero);
                                           sumapromedio=sumapromedio+numeroconvertido;
                                           contadornumeros=contadornumeros+1;
                                       }
                                       promedio=sumapromedio/contadornumeros;
                                       for(int posicionnumero2=0;posicionnumero2<numerosseparados3.length;posicionnumero2++){
                                            contadornumeros2=contadornumeros2+1;
                                            numero=numerosseparados3[posicionnumero2]; 
                                            double numeroconvertido = Double.valueOf(numero);
                                            sumadatos= Math.pow(numeroconvertido-promedio,2);
                                            totaldatos=totaldatos+sumadatos;
                                            sumadatos=0;
                                       }
                                       varianzatotal=totaldatos/(contadornumeros2 - 1);
                                      desvestandar=Math.sqrt(varianzatotal);
                                        System.out.println("desviacion estandar ("+cadena+ ") = "+desvestandar); 
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    case 4:
                                        //salir del menu estadistica
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("has salido del menu ESTADISTICA");
                                        break;
                                    default:
                                        break;
                                }
                            }
                                opcion = 0;
                  
                        break;
			case 4:
                            while(opcion!=2){
                                System.out.println("_____________________________________________________");
				System.out.println("|                       Calculo                      |");
                                System.out.println("|____________________________________________________|");
                                System.out.println("|     NUMERO DE OPCION     |         OPCIONES        |");
                                System.out.println("|____________________________________________________|");
                                System.out.println("|___________________________________________________ |");
                                System.out.println("|            1.            |    resolver sistemas    |");
                                System.out.println("|                          |      de ecuaciones      |");
                                System.out.println("|                          |       lineales de       |");         
                                System.out.println("|                          |         NXN con         |");
                                System.out.println("|                          |       Gauss Jordan      |");
                                System.out.println("|___________________________________________________ |");
                                System.out.println("|            2.            |         Regresar        |");
                                System.out.println("|__________________________|_________________________|");
                                System.out.print("por favor ingrese el numero de la accion a realizar: ");
                                opcion=leer.nextInt();
                                switch(opcion){
                                    case 1:
                                        //opcion gauss jordan
                                        System.out.print("ingrese el tamaño del sistema de ecuaciones lineales: ");
                                        q=leer.nextInt();
                                        w=leer.nextInt();
                                        System.out.println("debera ingresar una cadena de valores separadas por comas los coeficientes para cada ecuacion");
                                        for(int contadormatriz=0;contadormatriz<=q;contadormatriz++){
                                            System.out.print("f0 = ");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("__________________________________________________________");
                                        System.out.println("has salido del menu CALCULO");
                                        System.out.println("__________________________________________________________");
                                        break;
                                    default:
                                        break;
                                }
                            }
                                opcion = 0;
                        break;   
                        case 5:
                            //salir del programa calculadora
                                System.out.println("__________________________________________________________");
				System.out.println("Gracias por Utilizar la aplicacion -calculadora-");
                                System.out.println("__________________________________________________________");
                                System.exit(0);
			break;
                        default:
                                //ingreso una opcion invalida
                                System.out.println("__________________________________________________________");
				System.out.println("Seleccione una opcion valida");
                                System.out.println("__________________________________________________________");
                        break;
		}
    }while(opcion!=5||opcion!=4);
        } 
    //clases para funcion trigonometrica

    public static int fact(int n) {
        if(n == 0) return 1;
        return n * fact(n - 1); 
    }
        
    public static double frac(double a,double b) {
		return a / b;
	}
        }