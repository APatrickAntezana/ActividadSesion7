import java.util.Scanner;

public class ActividadSesion7_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double suma = 0;
        double numero;

        // Bucle do-while para ingresar números hasta que se ingrese un número negativo
        do {
            System.out.print("Ingrese un número (negativo para terminar): ");
            numero = scanner.nextDouble();

            if (numero >= 0) {
                suma += numero;  // Sumar el número ingresado
                contador++;      // Incrementar el contador de números ingresados
            }
        } while (numero >= 0);  // Condición: el bucle continúa mientras el número sea positivo o cero

        if (contador > 0) {
            double promedio = suma / contador;  // Calcular el promedio
            System.out.println("El promedio de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
        scanner.close();
    }
}
