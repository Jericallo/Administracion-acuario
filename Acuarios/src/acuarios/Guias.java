package acuarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Guias {
    private ArrayList<String> nombres;
    private ArrayList<String> direcciones;
    private ArrayList<String> telefonos;
    private ArrayList<String[]> recorridos;
    private ArrayList<String> fechasComienzo;
    private Scanner scanner;

    public Guias() {
        nombres = new ArrayList<>();
        direcciones = new ArrayList<>();
        telefonos = new ArrayList<>();
        recorridos = new ArrayList<>();
        fechasComienzo = new ArrayList<>();
        scanner = new Scanner(System.in);

        // Agregar algunos guías predeterminados
        agregarGuia("Angel", "Calle 1 #123", "555-1234", new String[] {"R001", "R002"}, "2021-01-01");
        agregarGuia("Jose", "Calle 2 #456", "555-5678", new String[] {"R001"}, "2021-02-01");
    }

    public void agregarGuia(String nombre, String direccion, String telefono, String[] recorridos, String fechaComienzo) {
        nombres.add(nombre);
        direcciones.add(direccion);
        telefonos.add(telefono);
        this.recorridos.add(recorridos);
        fechasComienzo.add(fechaComienzo);
    }

    public void agregarGuias() {
        System.out.println("Ingrese la cantidad de guías que desea agregar:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < n; i++) {
            System.out.println("Guía " + (i+1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Recorrido o Recorridos (separar por comas si son mas de 1): ");
            String[] recorridos = scanner.nextLine().split(",");
            System.out.print("Fecha de comienzo (YYYY-MM-DD): ");
            String fechaComienzo = scanner.nextLine();

            agregarGuia(nombre, direccion, telefono, recorridos, fechaComienzo);
            System.out.println("Guía agregado exitosamente.\n");
        }
    }

    public void eliminarGuia() {
        if (nombres.size() == 0) {
            System.out.println("No hay guías registrados.\n");
            return;
        }

        System.out.print("Ingrese el nombre del guía que desea eliminar: ");
        String nombre = scanner.nextLine();

        int indice = nombres.indexOf(nombre);
        if (indice == -1) {
            System.out.println("El guía con el nombre '" + nombre + "' no existe.\n");
            return;
        }

        nombres.remove(indice);
        direcciones.remove(indice);
        telefonos.remove(indice);
        recorridos.remove(indice);
        fechasComienzo.remove(indice);

        System.out.println("Guía eliminado exitosamente.\n");
    }

 public void actualizarGuia() {
    if (nombres.size() == 0) {
        System.out.println("No hay guías registrados.\n");
        return;
    }

    System.out.print("Ingrese el nombre del guía que desea actualizar: ");
    String nombre = scanner.nextLine();

    int indice = nombres.indexOf(nombre);
    if (indice == -1) {
        System.out.println("El guía con el nombre '" + nombre + "' no existe.\n");
        return;
    }

    System.out.println("Ingrese los nuevos datos del guía:");
    System.out.print("Nombre: ");
    nombres.set(indice, scanner.nextLine());
    System.out.print("Dirección: ");
    direcciones.set(indice, scanner.nextLine());
    System.out.print("Teléfono: ");
    telefonos.set(indice, scanner.nextLine());
    System.out.print("Recorrido o Recorridos (separar por comas si son mas de 1): ");
    recorridos.set(indice, scanner.nextLine().split(","));
    System.out.print("Fecha de comienzo (YYYY-MM-DD): ");
    fechasComienzo.set(indice, scanner.nextLine());

    System.out.println("Guía actualizado exitosamente.\n");
}

public void mostrarGuia(int indice) {
    System.out.println("Nombre: " + nombres.get(indice));
    System.out.println("Dirección: " + direcciones.get(indice));
    System.out.println("Teléfono: " + telefonos.get(indice));
    System.out.print("Recorridos: ");
    for (String recorrido : recorridos.get(indice)) {
        System.out.print(recorrido + " ");
    }
    System.out.println();
    System.out.println("Fecha de comienzo: " + fechasComienzo.get(indice));
}

public void mostrarGuias() {
    if (nombres.size() == 0) {
        System.out.println("No hay guías registrados.\n");
        return;
    }

    System.out.println("Lista de guías registrados:");
    for (int i = 0; i < nombres.size(); i++) {
        System.out.println("Guía " + (i+1) + ":");
        mostrarGuia(i);
        System.out.println();
    }
}


public void mostrarMenu(String Usuario, String Contrasena) {
   if((Usuario.equals("Administrador") && Contrasena.equals("1229")) || (Usuario.equals("Trabajador") && Contrasena.equals("1234"))){
    while (true) {
        System.out.println("===== Menú =====");
        System.out.println("1. Agregar guía");
        System.out.println("2. Eliminar guía");
        System.out.println("3. Actualizar guía");
        System.out.println("4. Mostrar guías");
        System.out.println("5. Salir");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
         if (Usuario.equals("Administrador") && Contrasena.equals("1229")){ 
             agregarGuias();
         }
         else{
           System.out.println("No tienes los permisos para acceder a esta opcion");
  
         }
                break;
            case 2:
                if (Usuario.equals("Administrador") && Contrasena.equals("1229")){
                  eliminarGuia();
                }
                else{
                    System.out.println("No tienes los permisos para acceder a esta opcion");
                }
                break;
            case 3:
                actualizarGuia();
                break;
            case 4:
                mostrarGuias();
                break;
            case 5:
                System.out.println("Hasta luego!");
                return;
            default:
                System.out.println("Opción inválida. Intente de nuevo.\n");
                break;
        }
    }
}
}
}