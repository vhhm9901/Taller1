import java.util.Scanner;

public class ControlTemperaturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] temp = new double[7];
        double suma = 0;

        // Registro de temperaturas
        for (int i = 0; i < temp.length; i++) {
            System.out.print("Temperatura día " + (i + 1) + ": ");
            temp[i] = sc.nextDouble();
            suma += temp[i];
        }

        double promedio = suma / temp.length;

        // Mostrar temperaturas y días superiores al promedio
        System.out.println("\nTemperaturas registradas:");
        for (double t : temp) System.out.println(t);

        System.out.println("\nPromedio: " + promedio);
        System.out.println("Días con temperatura superior al promedio:");

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > promedio) {
                System.out.println("Día " + (i + 1) + ": " + temp[i]);
            }
        }
    }
}
