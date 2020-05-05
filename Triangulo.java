import java.util.Scanner;

public class Triangulo {
	  public static void main(String[] args) {
		  Scanner base = new Scanner(System.in);
		  Scanner altura = new Scanner(System.in);
		  double b;
		  double a;
	      System.out.println("¿Cuál es la base en metros? ");
	      b = base.nextInt();
	      System.out.println("¿Cuál es la altura en metros? ");
	      a = altura.nextInt();
	      System.out.print( "El area del triangulo es: " + (a*b)/2 + " metros");
	  }
	  }     
