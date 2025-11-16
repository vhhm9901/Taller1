import java.util.Scanner;

public class RegistroProductos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] productos = {"Pan", "Leche", "Huevos", "Arroz", "Café", "Azúcar"};

        // Mostrar lista
        System.out.println("Productos disponibles:");
        for (String p : productos) System.out.println("- " + p);

        // Buscar producto
        System.out.print("\nIngrese el producto a buscar: ");
        String buscado = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equalsIgnoreCase(buscado)) {
                encontrado = true;
                break;
            }
        }

        System.out.println(encontrado ? "Disponible." : "No disponible.");

        // Eliminar producto
        System.out.print("\nIngrese el producto a eliminar: ");
        String eliminar = sc.nextLine();

        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equalsIgnoreCase(eliminar)) {
                productos[i] = "Agotado";
                break;
            }
        }

        // Mostrar lista final
        System.out.println("\nLista actualizada:");
        for (String p : productos) System.out.println("- " + p);
    }
}

