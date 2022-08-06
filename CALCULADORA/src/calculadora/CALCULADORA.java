/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author josia
 */
public class CALCULADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        int numero1;
        int numero2;
        double x=0;
        double i = 0;
        int j = 0;
        int y = 0;
        int q = 0;
        int w = 0;
        //variables cadena separada por comas de promedio
        String cadena="";
        String numero="";
        float sumapromedio=0;
        float promedio=0;
        float contadornumeros=0;
        //
        //variables cadena separada por comas de varianza 
        float sumadatos=0;
        float totaldatos=0;
        float varianzatotal=0;
        float contadornumeros2=0;
        //
        //variables para la operacion seno
        double ndatos=0;
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
                            while(opcion!=4){
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
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("ha seleccionado la opcion Seno");
                                        System.out.println("ingrese el valor para x: ");
                                        ncorridas=leer.nextDouble();
                                        System.out.println("ingrese el valor para i: ");
                                        ndatos=leer.nextDouble();
                                        x*=Math.PI/180;
                                        double n1=0;
                                        double sumatoriaSeno=0;
                                        double factorial=0;
                                            if(n1==0){
                                            n1=1;
                                            }else{
                                            factorial=n1*factorial*(n1-1);
                                            }
                                        for(n1=0;n1<=ndatos;n1++){
                                            sumatoriaSeno+=(Math.pow(-1, n1)*Math.pow(x,2*n1+1)/factorial*(2*n1+1));
                                        }
                                        
                                        System.out.println("sen("+x+") ="+sumatoriaSeno);
                                        System.out.print("presione enter para continuar... ");
                                        botonenter=enter.nextLine();
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    case 2:
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("ha seleccionado la opcion Coseno");
                                        System.out.println("ingrese el valor para x: ");
                                        x=leer.nextDouble();
                                        System.out.println("ingrese el valor para i: ");
                                        i=leer.nextDouble();
                                        x*=Math.PI/180;
                                        double n2=0;
                                        double sumatoriaCoseno=0;
                                        double factorial2=0;
                                        for(n2=0;n2<=ndatos;n2++){
                                            if(n2==0){
                                            n2=1;
                                            }else{
                                            factorial2=n2*factorial2*(n2-1);
                                            }
                                            sumatoriaCoseno += (Math.pow(-1,n2) * Math.pow(x,2 * n2)/factorial2*(2 * n2));
                                        }
                                        System.out.println("cos("+x+") ="+sumatoriaCoseno);
                                        System.out.print("presione enter para continuar... ");
                                        botonenter=enter.nextLine();
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    case 3:
                                        System.out.println("----------------------------------------------------------");
                                        System.out.println("ha seleccionado la opcion Tangente");
                                        System.out.println("ingrese el valor para x: ");
                                        x=leer.nextInt();
                                        System.out.println("ingrese el valor para i: ");
                                        i=leer.nextInt();
                                        double sumatoriatangente=0;
                                        x*=Math.PI/180;
                                        double sumatoriaSeno1=0;
                                        double factorialsen=0;
                                        for(n1=0;n1<=ndatos;n1++){
                                            if(n1==0){
                                            n1=1;
                                            }else{
                                            factorialsen=n1*factorialsen*(n1-1);
                                            }
                                            sumatoriaSeno1+=(Math.pow(-1, n1)*Math.pow(x,2*n1+1)/factorialsen*(2*n1+1));
                                        }
                                        double factorialcos=0;
                                        double sumatoriaCoseno1=0;
                                        for(n2=0;n2<=ndatos;n2++){
                                            if(n2==0){
                                            n2=1;
                                            }else{
                                            factorialcos=n2*factorialcos*(n2-1);
                                            }
                                            sumatoriaCoseno1 += (Math.pow(-1,n2) * Math.pow(x,2 * n2)/factorialcos*(2 * n2));
                                        }
                                        sumatoriatangente=sumatoriaSeno1/sumatoriaCoseno1;
                                        System.out.println("tan"+x+") ="+sumatoriatangente);
                                        System.out.print("presione enter para continuar... ");
                                        botonenter=enter.nextLine();
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    case 4:
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
                                       System.out.println("----------------------------------------------------------");
                                       System.out.println("ha seleccionado la opcion media");
                                       System.out.println("ingrese una lista de numeros separadas por comas");
                                       cadena=operaciones.nextLine();
                                       String numerosseparados[]=cadena.split(",");
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
                                       System.out.println("----------------------------------------------------------");
                                       System.out.println("ha seleccionado la opcion varianza");
                                       System.out.println("ingrese una lista de numeros separadas por comas");
                                       cadena=operaciones.nextLine();
                                       String numerosseparados2[]=cadena.split(",");
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
                                            int numeroconvertido=Integer.parseInt(numero);
                                            sumadatos= (float) Math.pow(numeroconvertido-promedio,2);
                                            totaldatos=totaldatos+sumadatos;
                                            sumadatos=0;
                                       }
                                       varianzatotal=totaldatos/contadornumeros2;
                                       System.out.println("Varianza ("+cadena+ ") = "+varianzatotal);
                                       System.out.println("----------------------------------------------------------");
                                        break;
                                    case 3:
                                       System.out.println("----------------------------------------------------------");
                                       System.out.println("ha seleccionado la opcion desviacion estandar");
                                       System.out.println("ingrese una lista de numeros separadas por comas");
                                       cadena=operaciones.nextLine();
                                       String numerosseparados3[]=cadena.split(",");
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
                                            int numeroconvertido=Integer.parseInt(numero);
                                            sumadatos= (float) Math.pow(numeroconvertido-promedio,2);
                                            totaldatos=totaldatos+sumadatos;
                                            sumadatos=0;
                                       }
                                      varianzatotal=totaldatos/contadornumeros2;
                                      desvestandar=Math.sqrt(varianzatotal);
                                        System.out.println("desviacion estandar ("+cadena+ ") = "+desvestandar); 
                                        System.out.println("----------------------------------------------------------");
                                        break;
                                    case 4:
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
                                System.out.println("__________________________________________________________");
				System.out.println("Gracias por Utilizar la aplicacion -calculadora-");
                                System.out.println("__________________________________________________________");
                                System.exit(0);
			break;
                        default:
                                System.out.println("__________________________________________________________");
				System.out.println("Seleccione una opcion valida");
                                System.out.println("__________________________________________________________");
                        break;
		}
    }while(opcion!=5||opcion!=4);
        }      
}
