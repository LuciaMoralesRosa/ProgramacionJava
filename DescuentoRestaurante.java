	import java.util.Scanner;
public class DescuentoRestaurante {
	/* PROBLEMA DE INTERNET
	 * Un restaurant ofrece un descuento del 10% para consumos de hasta 100.00 € y un 
	 * descuento del 20% para consumos mayores. Para ambos casos se aplica un impuesto del
	 * 19%. Determinar el descuento, el impuesto y el importe a pagar.
	 */

	    
	    public static void main(String[] args) {
	      Scanner dato = new Scanner (System.in);
	     
	      double precio;
	      double desc1;
	      double desc2;
	      double imp=0;
	      double impues;
	      double preciofinal=0;
	      
	      System.out.println("Ingrese el consumo a pagar: ");
	      precio = dato.nextDouble();
	      
	      if(precio<=100){
	          desc1 = precio * 0.1;
	          imp = precio-desc1;
	          impues = imp * 0.19;
	          System.out.println("el descuento es: "+desc1);
	          System.out.println("el impuesto es: "+impues);
	          preciofinal= imp+impues;
	          System.out.println("el importe a pagar es: "+ preciofinal);
	      }
	          if(precio>100){
	              desc2 = precio * 0.2;
	              imp = precio-desc2;
	              impues = imp * 0.19;
	              System.out.println("el descuento es: "+desc2);
	              System.out.println("el impuesto es: "+impues);
	              preciofinal= imp+impues;
		          System.out.println("el importe a pagar es: "+ preciofinal);
		  
	          }
	       
	      
	      
	      
	    }
	    
}
