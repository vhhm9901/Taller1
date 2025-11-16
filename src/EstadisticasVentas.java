import java.util.Scanner;

public class EstadisticasVentas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] ventas = new double[7];
        double suma = 0;

        // Registro de ventas
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Venta del día " + (i + 1) + ": ");
            ventas[i] = sc.nextDouble();
            suma += ventas[i];
        }

        double promedio = suma / ventas.length;

        // Día mayor y menor venta
        double mayor = ventas[0], menor = ventas[0];
        int diaMayor = 1, diaMenor = 1;

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > mayor) {
                mayor = ventas[i];
                diaMayor = i + 1;
            }
            if (ventas[i] < menor) {
                menor = ventas[i];
                diaMenor = i + 1;
            }
        }

        // Resultados
        System.out.println("\nTotal ventas: " + suma);
        System.out.println("Promedio semanal: " + promedio);
        System.out.println("Mayor venta: Día " + diaMayor + " = " + mayor);
        System.out.println("Menor venta: Día " + diaMenor + " = " + menor);
    }
}
