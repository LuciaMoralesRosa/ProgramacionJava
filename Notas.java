import java.util.Scanner;
public class Notas {
	    public static void main(String[] args) {
	                Scanner entrada = new Scanner(System.in);
	                    System.out.println("Ingrese su nota: ");
	                int nota = entrada.nextInt();
	                    if (nota >= 5)
	                        System.out.println("Aprobado");
	                    else 
	                        System.out.println("Suspendido");
	       
	    }
	    
	}
