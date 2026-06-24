import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("Calculadora");
        System.out.println("==========================");
        int opcion;
        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. cerrar");
            opcion = entrada.nextInt();
            System.out.println("==========================");
        } while (opcion != 5);
        entrada.close();
    }
}
