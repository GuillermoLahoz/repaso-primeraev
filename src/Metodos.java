public class Metodos {

    // Dado un número entero, calcular el sumatorio de cero al número y devolverlo
    public static int sumatorio(int n) {
        int suma = 0;
        // n = 3 ->
        for (int i = 0; i <= n; i++) {
            // 1ª i=0, n = 3
            // 2ª i=1, n = 3
            // 3ª i=2, n = 3
            // 4ª i=3, n = 3
            suma = suma + i;
        }

        return suma;
    }


    // Dados dos números enteros, devuelve el mayor de ellos
    static int mayor(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    // Dado un array de números con decimales, devuelve el último
    static double devuelveUltimo(double[] numeros) {
        // numeros = {1, 2, 3, 4, 5}, size=5, devuelve numeros[size-1]
        // numeros = {1, 2, 3}, size=3, devuleve numeros[size-1]
        return numeros[numeros.length - 1];

    }

    static double devuelvePenultimo(double[] numeros) {
        // numeros = {1, 2, 3, 4, 5}, size=5, devuelve numeros[size-1]
        // numeros = {1, 2, 3}, size=3, devuleve numeros[size-1]
        return numeros[numeros.length - 2];

    }

    static double devuelveSegundo(double[] numeros) {
        // i         {0, 1, 2, 3, 4}
        // numeros = {3, 2, 4, 5, 5}, size=5, devuelve numeros[size-1]
        // numeros = {3, 2, 4}, size=3, devuleve numeros[size-1]
        return numeros[1];
    }

    static double devuelvePrimero(double[] numeros) {
        // numeros = {1, 2, 3, 4, 5}, size=5, devuelve numeros[size-1]
        // numeros = {1, 2, 3}, size=3, devuleve numeros[size-1]
        return numeros[0];
    }

    // Dado un array de enteros, devuelve la suma
    static int suma(int[] numeros){
        int suma = 0;
        // i       = {0, 1, 2}
        // numeros = {3, 4, 5}
        for (int i = 0; i < numeros.length; i++) {
            // 1ª iteracion, i=0, numeros[0] = 3, suma = 0 + 3
            // 2ª iteracion, i=1, numeros[1] = 4, suma = 3 + 4
            // 3ª iteracion, i=2, numeros[2] = 4, suma = 7 + 5
            suma = suma + numeros[i];
        }
        return suma;
    }


}
