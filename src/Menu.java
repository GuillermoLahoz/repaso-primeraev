import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    static int chooseOperation() {
        System.out.println("Qué quieres hacer:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Salir");
        int op = scanner.nextInt();
        scanner.nextLine();

        while (op != 1 && op != 2 && op != 3) {
            System.out.println("Error, opción inválida.");
            op = scanner.nextInt();
            scanner.nextLine();
        }

        return op;
    }

    static int pideEntero() {
        System.out.println("Introduce un número");
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }

    static int pideSuma(){
        int n1 = pideEntero();
        int n2 = pideEntero();
        int suma = n1 + n2;
        return suma;
    }

    static int pideResta(){
        int n1 = pideEntero();
        int n2 = pideEntero();
        int resta = n1 - n2;
        return resta;
    }

    public static void main(String[] args) {
        // Haz un menú que permita elegir de entre las siguientes operaciones
        // + - pide dos enteros y los suma
        // - - pide dos enteros y los resta
        // salir - se sale del programa
        int choice = chooseOperation();
        while (choice != 3) {
            if(choice == 1) {
                int suma = pideSuma();
                System.out.println("La suma es " + suma);
            } else if(choice == 2) {
                int resta = pideResta();
                System.out.println("La resta es " + resta);
            }
            choice = chooseOperation();
        }
    }
}
