import java.util.*;
public class Cuadrado {
		public static void main(String[] args)
		{
			Scanner lado = new Scanner(System.in);
			  double l;
		      System.out.println("¿Cuál es el lado en metros? ");
		      l = lado.nextInt();
		      System.out.print( "El area del cuadrado es: " +l*l + " metros");
		      System.out.print( " y el perimetro del cuadrado es: "+ l*4 + " metros");
		}
	} 
