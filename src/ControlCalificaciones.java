import java.util.Scanner;

public class ControlCalificaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;
        int aprobados = 0, reprobados = 0;

        // Ingreso de notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        // Cálculo del promedio
        double promedio = suma / notas.length;

        // Conteo de aprobados y reprobados
        for (double n : notas) {
            if (n >= 60) aprobados++;
            else reprobados++;
        }

        System.out.println("\nPromedio del grupo: " + promedio);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
    }
}
