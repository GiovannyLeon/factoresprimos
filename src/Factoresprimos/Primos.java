package Factoresprimos;
import java.util.Scanner;                                               //Usamos la libreria de Scanner

public class Primos {

	public static void main(String[] args) {
        int factor;
        Scanner primos = new Scanner(System.in);                       //En esta linea vamos a llamar a "primos" variable que entra mediante el scanner
			System.out.println("Numero que desea descomponer");        //Imprimimos un mensaje para que la persona ingrese el numero
			int numero = primos.nextInt();                             //la variable que entra se registra como un entero "Numero"

			for (factor=2; factor<=numero; factor++) {                 //factor empieza en 2 en cada while mientras sea divisible en 2
			    while (numero%factor==0) {
			        System.out.println(numero + " | " + factor);       //Se imprime cada resultado que este dentro del ciclo
			        numero/=factor;
			    }
			}
		}

    }