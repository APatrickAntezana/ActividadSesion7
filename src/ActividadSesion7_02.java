import java.util.Scanner;

public class ActividadSesion7_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int pares = 0;
        int impares = 0;

        // Bucle do-while para ingresar números hasta que se ingrese 0
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    pares++;  // Si es par, incrementar el contador de pares
                } else {
                    impares++;  // Si es impar, incrementar el contador de impares
                }
            }
        } while (numero != 0);  // El bucle continúa hasta que el número sea 0

        // Mostrar los resultados
        System.out.println("Cantidad de números pares ingresados: " + pares);
        System.out.println("Cantidad de números impares ingresados: " + impares);

        scanner.close();
    }
}
