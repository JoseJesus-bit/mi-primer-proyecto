import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        
        Scanner sc = new Scanner(System.in);
        float num1, num2;

         while (true) {
            try {
                System.out.print("Ingresa un primer numero ");
                num1 = sc.nextFloat();

                if (num1 < 0) {
                    System.out.println("Error: no se permite numeros negativos");
                } else {
                    break; // sale del ciclo si es válido
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: debes ingresar un numero ");
                sc.nextLine(); // limpia el buffer
            }
        }

        while (true) {
            try {
                System.out.print("Ingresa un segundo numero ");
                num2 = sc.nextFloat();

                if (num2 < 0) {
                    System.out.println("Error: no se permite numeros negativos");
                } else {
                    break; // sale del ciclo si es válido
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: debes ingresar un numero ");
                sc.nextLine(); // limpia el buffer
            }
        }

        System.out.println("La suma es = " + (num1+num2));
        System.out.println("La resta es = " + (num1 - num2));
        System.out.println("La multiplicación es = " + (num1 * num2));
        System.out.println("La división es = " + (num1 / num2));
    }
}
