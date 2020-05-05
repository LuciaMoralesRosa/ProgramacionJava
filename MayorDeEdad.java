import java.util.Scanner;
public class MayorDeEdad {
	
	    public static void main(String[] args) {
	      Scanner edad = new Scanner(System.in);
	      int n;
	      System.out.println("¿Cuál su edad? ");
	      n = edad.nextInt();
	      
	      if(n>=18){
	          System.out.println("Es mayor de edad");
	      }
	      else{
	          System.out.println("Es menor de edad");
	      }
	    }
	}
