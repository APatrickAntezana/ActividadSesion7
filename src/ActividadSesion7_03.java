import java.util.Scanner;

public class ActividadSesion7_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Bucle do-while para ingresar números hasta que se ingrese un número negativo
        do {
            System.out.print("Ingrese un número (negativo para terminar): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                if (numero > mayor) {
                    mayor = numero;  // Actualizar el mayor si el número es mayor que el actual
                }
                if (numero < menor) {
                    menor = numero;  // Actualizar el menor si el número es menor que el actual
                }
            }
        } while (numero >= 0);  // El bucle continúa hasta que se ingrese un número negativo

        if (mayor != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            // Mostrar el número mayor y menor
            System.out.println("El número mayor ingresado es: " + mayor);
            System.out.println("El número menor ingresado es: " + menor);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
        scanner.close();
    }
}
