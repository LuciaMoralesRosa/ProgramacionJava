	import java.util.Scanner;
public class SignoDelZodiaco {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
          System.out.println("Mes de nacimiento: ");
          int mes = entrada.nextInt();
          System.out.println("Dia de nacimiento: ");
          int dia = entrada.nextInt();
          
          if (mes == 3 && dia >= 21 && dia <= 31 || mes == 4 && dia <= 20 && dia > 0)
              System.out.println("Su signo es Aries.");
          else
              if (mes == 4 && dia >= 21 && dia <= 31 || mes == 5 && dia <= 20 && dia > 0)
              System.out.println("Su signo es Tauro.");
          else
              if (mes == 5 && dia >= 21 && dia <= 31 || mes == 6 && dia <= 20 && dia > 0)
              System.out.println("Su signo es Geminis.");
          else
              if (mes == 6 && dia >= 21 && dia <= 31 || mes == 7 && dia <= 20 && dia > 0)
              System.out.println("Su signo es Cancer.");
          else
              if (mes == 7 && dia >= 21 && dia <= 31 || mes == 8 && dia <= 21 && dia > 0)
              System.out.println("Su signo es Leo.");
          else
              if (mes == 8 && dia >= 22 && dia <= 31 || mes == 9 && dia <= 22 && dia > 0)
              System.out.println("Su signo es Virgo.");
          else
              if (mes == 9 && dia >= 23 && dia <= 31 || mes == 10 && dia <= 22 && dia > 0)
              System.out.println("Su signo es Libra.");
          else
              if (mes == 10 && dia >= 23 && dia <= 31 || mes == 11 && dia <= 22 && dia > 0)
              System.out.println("Su signo es Escorpio.");
          else
              if (mes == 11 && dia >= 23 && dia <= 31 || mes == 12 && dia <= 20 && dia > 0)
              System.out.println("Su signo es Sagitario.");
          else
              if (mes == 12 && dia >= 21 && dia <= 31 || mes == 1 && dia <= 19 && dia > 0)
              System.out.println("Su signo es Capricornio.");
          else
              if (mes == 1 && dia >= 20 && dia <= 31 || mes == 2 && dia <= 18 && dia > 0)
              System.out.println("Su signo es Acuario.");
      }
      
  
}
