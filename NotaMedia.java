import java.util.Scanner;
public class NotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner uno = new Scanner(System.in);
         System.out.println("Ingrese su nota de la 1ªev: ");
         double nota1 = uno.nextInt();
         System.out.println("Ingrese su nota de la 2ªev: ");
         double nota2 = uno.nextInt();
         System.out.println("Ingrese su nota de la 3ªev: ");
         double nota3 = uno.nextInt();
         System.out.println("Su nota media de las tres evaluaciones es: " + (nota1+nota2+nota3)/3);
	}

}
