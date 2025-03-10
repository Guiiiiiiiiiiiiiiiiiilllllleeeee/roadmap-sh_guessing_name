import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
    do{
      System.out.println("Welcome to the Number Guessing Game!");
      System.out.println("I'm thinking of a number between 1 and 100.");
      System.out.println("select difficulty\n1. easy(10 chances\n2. medium (5 chances)\n 3. hard (3 chances)\n0. salir del juego");
      int opcion=lectura("I'm thinking of a number between 1 and 100.",0,3);
        if(opcion==0)
            break;
        int numero = (int) (Math.random() * 100) + 1;
      if(opcion==1)
          opcion=10;
      if(opcion==2)
          opcion=5;
      if(opcion==1)
          opcion=3;
        for (int i = 0; i < opcion; i++) {
            System.out.println("intentos restantes: "+(opcion-i));
            int num_introducido=lectura("introduce un numero",1,100);
            if(num_introducido==numero){
                System.out.println("acertaste");
                break;
            } else if (num_introducido<numero) {
                System.out.println("el numero introducido es menor que el mio");
            }else{
                System.out.println("el numero introducido es mayor que el mio");
            }
        }

    }while(true);

    }
    public static int lectura(String text,int min,int max) {
        Scanner leer=new Scanner(System.in);
        int valor=0;
        do {
            valor=0;
            System.out.println(text);
            try {
                valor=0;
                valor=leer.nextInt();
                leer.nextLine();
                if(valor>max||valor<min)System.out.println("El valor introducido está fuera de rango, el rango va de "+min+" a "+max +" incluidos");
            }catch(InputMismatchException ex) {
                System.out.println("el valor introducido no es un numero");
                leer.nextLine();
                valor=max+1;

            }
        }while(valor>max||valor<min);
        return valor;
    }
    
}
