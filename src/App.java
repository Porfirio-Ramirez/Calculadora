import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // declarar variables.
        double numero1;
        double numero2;
        double resultado;
        int opcion;

        // mensaje de bienvenida.
        System.out.println("==========================");
        System.out.println("Calculadora");
        System.out.println("==========================");

        // menu de operaciones.
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. cerrar");
            opcion = entrada.nextInt();
            System.out.println("==========================");

            // Operaciones segun la opcion seleccionada.
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero");
                    numero1 = entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = entrada.nextDouble();
                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero");
                    numero1 = entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = entrada.nextDouble();
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero");
                    numero1 = entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = entrada.nextDouble();
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero");
                    numero1 = entrada.nextDouble();
                    System.out.println("Ingrese el segundo numero");
                    numero2 = entrada.nextDouble();

                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("No se puede dividir entre 0");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar tu calculadora de confianza.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (opcion != 5);
        entrada.close();
    }
}
