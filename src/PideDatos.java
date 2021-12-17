import java.util.Scanner;

public class PideDatos {
    static Scanner scanner = new Scanner(System.in);

    // Crea un método que pida al usuario un entero
    static int pideEntero() {
        System.out.println("Introduce un número");
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }

    // Crea un método que pida al usuario un entero positivo (mayor que cero)
    static int pidePositivo() {
        System.out.println("Introduce un entero positivo");
        int p = pideEntero();
        while (p < 1) {
            System.out.println("Error, el número debe ser mayor que cero");
            p = pideEntero();
        }
        return p;
    }

    static double pideDecimal() {
        System.out.println("Introduce un número con decimales");
        double n = scanner.nextDouble();
        scanner.nextLine();
        return n;
    }

    // Crea un método qu pida un array de double
    static double[] pideNumeros() {
        int size = pidePositivo();
        double[] numeros = new double[size];
        // size = 3, numeros ={0, 0, 0}
        for (int i = 0; i < numeros.length; i++) {
            // 1ª iter, i=0; n=3, numeros={3, 0, 0}
            // 2ª iter, i=1; n=5, numeros={3, 5, 0}
            // 3ª iter, i=2; n=1, numeros={3, 5, 1}
            numeros[i] = pideDecimal();
        }
        return numeros;
    }

    static double mayor(double n1, double n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    static double devuelveUltimo(double[] numeros) {
        // numeros = {1, 2, 3, 4, 5}, size=5, devuelve numeros[size-1]
        // numeros = {1, 2, 3}, size=3, devuleve numeros[size-1]
        return numeros[numeros.length - 1];

    }

    static double devuelvePrimero(double[] numeros) {
        // numeros = {1, 2, 3, 4, 5}, size=5, devuelve numeros[size-1]
        // numeros = {1, 2, 3}, size=3, devuleve numeros[size-1]
        return numeros[0];

    }

    public static void main(String[] args) {
        // Pide un array
        // Muestra en pantalla el mayor de entre el primero y el último número del array

        // array = {2,3 ,4,5,7} -> 2 y 7 -> 7
        // array = {20,3 ,4,5,7} -> 20 y 7 -> 20

        double[] numeros = pideNumeros();

        double primero = devuelvePrimero(numeros);
        double ultimo = devuelveUltimo(numeros);
        double mayor = mayor(primero, ultimo);
        System.out.println("El máximo es " + mayor);
    }
}
