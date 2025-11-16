import java.util.Scanner;

public class AgendaTelefonica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nombres = {"Ana", "Luis", "Pedro", "Sofía", "María"};
        String[] telefonos = {"111", "222", "333", "444", "555"};

        // Mostrar agenda
        System.out.println("Agenda completa:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - " + telefonos[i]);
        }

        // Buscar teléfono
        System.out.print("\nIngrese nombre a buscar: ");
        String buscado = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(buscado)) {
                System.out.println("Teléfono: " + telefonos[i]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) System.out.println("No encontrado.");

        // Actualizar teléfono
        System.out.print("\nIngrese nombre a actualizar: ");
        String nombreAct = sc.nextLine();

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreAct)) {
                System.out.print("Nuevo teléfono: ");
                telefonos[i] = sc.nextLine();
                break;
            }
        }

        // Mostrar agenda final
        System.out.println("\nAgenda actualizada:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - " + telefonos[i]);
        }
    }
}

