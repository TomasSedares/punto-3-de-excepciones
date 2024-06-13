import java.util.Scanner;

public class Main {
    static Scanner scan;
    public static void main(String[] args) {

        scan = new Scanner(System.in);

        Prueba prueba = new Prueba();

        System.out.printf("Ingrese el indice del cual quieres ver el numero: ");
        int indice = scan.nextInt();

        prueba.mostrarNum(indice);

        try
        {
            System.out.println();
        }
        catch(IndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
    }
}