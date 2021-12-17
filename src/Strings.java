public class Strings {
    public static void main(String[] args) {
        String mensaje = "1,23,45,6,7";
        // palabras = {"1", "23", "45", "6", "7"}
        String[] palabras = mensaje.split(",");
        int[] numeros = new int[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            // 1ª iter;i=0, palabra = "1", numeros = {1, 0, 0,0}
            // 2ª iter;i=1, palabra = "23", numeros = {1, 23, 0,0}
            numeros[i] = Integer.parseInt(palabra);
        }


    }
}
