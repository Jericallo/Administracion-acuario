package acuarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Vigilantes {
    ArrayList<String> nombres;
    ArrayList<String> direcciones;
    ArrayList<String> telefonos;
    ArrayList<String> fechasIngreso;
    ArrayList<ArrayList<String>> especiesACargo;
    ArrayList<ArrayList<String>> fechasACargo;
    Scanner scanner;
    
    public Vigilantes() {
        this.nombres = new ArrayList<String>();
        this.direcciones = new ArrayList<String>();
        this.telefonos = new ArrayList<String>();
        this.fechasIngreso = new ArrayList<String>();
        this.especiesACargo = new ArrayList<ArrayList<String>>();
        this.fechasACargo = new ArrayList<ArrayList<String>>();
        this.scanner = new Scanner(System.in);
        
        // Agregar algunos vigilantes predeterminados
        agregarVigilante("Carlos", "Calle 123", "1234567", "01/01/2021", new String[] {"Tiburones", "Peces payaso", "Estrellas de mar"}, new String[] {"01/01/2020", "01/05/2020", "01/05/2021"});
        agregarVigilante("Juanito", "Calle 456", "7654321", "01/02/2023", new String[] {"Pulpos", "Cangrejos", "Tortugas"}, new String[] {"01/02/2020", "01/03/2020", "01/05/2021"});
    }
    
    public void agregarVigilante(String nombre, String direccion, String telefono, String fechaIngreso, String[] especies, String[] fechas) {
        nombres.add(nombre);
        direcciones.add(direccion);
        telefonos.add(telefono);
        fechasIngreso.add(fechaIngreso);
        ArrayList<String> especiesList = new ArrayList<String>();
        ArrayList<String> fechasList = new ArrayList<String>();
        for (int i = 0; i < especies.length; i++) {
            especiesList.add(especies[i]);
            fechasList.add(fechas[i]);
        }
        especiesACargo.add(especiesList);
        fechasACargo.add(fechasList);
    }
    
    public void agregarVigilante() {
        System.out.println("Ingrese los datos del vigilante:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Fecha de ingreso (dd/mm/aaaa): ");
        String fechaIngreso = scanner.nextLine();
        System.out.print("Número de especies a cargo: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        String[] especies = new String[n];
        String[] fechas = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Especie " + (i+1) + ":");
            System.out.print("Nombre: ");
            especies[i] = scanner.nextLine();
            System.out.print("Fecha en que se hizo cargo (dd/mm/aaaa): ");
            fechas[i] = scanner.nextLine();
        }
        
        agregarVigilante(nombre, direccion, telefono, fechaIngreso, especies, fechas);
        System.out.println("Vigilante agregado exitosamente.\n");
    }
public void mostrarVigilantes() {
    for (int i = 0; i < nombres.size(); i++) {
        System.out.println("Vigilante " + (i+1) + ":");
        System.out.println("Nombre: " + nombres.get(i));
        System.out.println("Dirección: " + direcciones.get(i));
        System.out.println("Teléfono: " + telefonos.get(i));
        System.out.println("Fecha de ingreso: " + fechasIngreso.get(i));
        System.out.println("Especies a cargo: ");
        ArrayList<String> especiesList = especiesACargo.get(i);
        ArrayList<String> fechasList = fechasACargo.get(i);
        for (int j = 0; j < especiesList.size(); j++) {
            System.out.println("- " + especiesList.get(j) + " (desde " + fechasList.get(j) + ")");
        }
        System.out.println();
    }
}

public void actualizarVigilante(String nombre) {
    int indice = nombres.indexOf(nombre);
    if (indice == -1) {
        System.out.println("No se encontró el vigilante.");
    } else {
        System.out.println("Ingrese los nuevos datos del vigilante:");
        System.out.print("Nombre (" + nombres.get(indice) + "): ");
        String nuevoNombre = scanner.nextLine();
        if (!nuevoNombre.isEmpty()) {
            nombres.set(indice, nuevoNombre);
        }
        System.out.print("Dirección (" + direcciones.get(indice) + "): ");
        String nuevaDireccion = scanner.nextLine();
        if (!nuevaDireccion.isEmpty()) {
            direcciones.set(indice, nuevaDireccion);
        }
        System.out.print("Teléfono (" + telefonos.get(indice) + "): ");
        String nuevoTelefono = scanner.nextLine();
        if (!nuevoTelefono.isEmpty()) {
            telefonos.set(indice, nuevoTelefono);
        }
        System.out.print("Fecha de ingreso (" + fechasIngreso.get(indice) + "): ");
        String nuevaFechaIngreso = scanner.nextLine();
        if (!nuevaFechaIngreso.isEmpty()) {
            fechasIngreso.set(indice, nuevaFechaIngreso);
        }
        ArrayList<String> especiesList = especiesACargo.get(indice);
        ArrayList<String> fechasList = fechasACargo.get(indice);
        for (int i = 0; i < especiesList.size(); i++) {
            System.out.print("Especie " + (i+1) + " (" + especiesList.get(i) + "): ");
            String nuevaEspecie = scanner.nextLine();
            if (!nuevaEspecie.isEmpty()) {
                especiesList.set(i, nuevaEspecie);
            }
            System.out.print("Fecha en que se hizo cargo (dd/mm/aaaa) (" + fechasList.get(i) + "): ");
            String nuevaFecha = scanner.nextLine();
            if (!nuevaFecha.isEmpty()) {
                fechasList.set(i, nuevaFecha);
            }
        }
        System.out.println("Vigilante actualizado exitosamente.\n");
    }
}

public void buscarVigilante(String nombre) {
    int indice = nombres.indexOf(nombre);
    if (indice == -1) {
        System.out.println("No se encontró el vigilante.");
    } else {
        System.out.println("Vigilante " + (indice+1) + ":");
        System.out.println("Nombre: " + nombres.get(indice));
        System.out.println("Dirección: " + direcciones.get(indice));
        System.out.println("Teléfono: " + telefonos.get(indice));
        System.out.println("Fecha de ingreso: " + fechasIngreso.get(indice));
        System.out.println("Especies a cargo: ");
        ArrayList<String> especiesList = especiesACargo.get(indice);
        ArrayList<String> fechasList = fechasACargo.get(indice);
        for (int j = 0; j < especiesList.size(); j++) {
            System.out.println("- " + especiesList.get(j) + " (desde " + fechasList.get(j) + ")");
        }
        System.out.println();
    }
}
public void eliminarVigilante(String nombre) {
    int indice = nombres.indexOf(nombre);
    if (indice == -1) {
        System.out.println("No se encontró el vigilante.");
    } else {
        nombres.remove(indice);
        direcciones.remove(indice);
        telefonos.remove(indice);
        fechasIngreso.remove(indice);
        especiesACargo.remove(indice);
        fechasACargo.remove(indice);
        System.out.println("Vigilante eliminado exitosamente.\n");
    }
}
public void mostrarMenu(String Usuario, String Contrasena) {
        if((Usuario.equals("Administrador") && Contrasena.equals("1229")) || (Usuario.equals("Trabajador") && Contrasena.equals("1234"))){
            
    boolean salir = false;
    while (!salir) {
        System.out.println("---------- Menú ----------");
        System.out.println("1. Agregar vigilante");
        System.out.println("2. Mostrar vigilantes");
        System.out.println("3. Actualizar un Vigilante");
        System.out.println("4. Eliminar un Vigilante");
        System.out.println("5. Salir");
        System.out.print("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
    switch (opcion) {
        case 1:
        if (Usuario.equals("Administrador") && Contrasena.equals("1229")){
             agregarVigilante();
             }
        else{
            System.out.println("No tienes los permisos para acceder a esta opcion");
        }

            break;
        case 2:
        if (Usuario.equals("Administrador") && Contrasena.equals("1229")){
           mostrarVigilantes();
        }
        else{
            System.out.println("No tienes los permisos para acceder a esta opcion");
        }
            break;
        case 3:
            System.out.print("Ingrese el nombre del vigilante a actualizar: ");
            String nombreActualizar = scanner.nextLine();
            actualizarVigilante(nombreActualizar);
            break;
        case 4:
            System.out.print("Ingrese el nombre del vigilante a eliminar: ");
            String nombreEliminar = scanner.nextLine();
            eliminarVigilante(nombreEliminar);
            break;
        case 5:
            salir = true;
            break;
        default:
            System.out.println("Opción inválida. Intente de nuevo.");
            break;
        }
    }
}
}
}