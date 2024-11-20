package acuarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Recorridos {
     ArrayList<String> zonas;
     ArrayList<String> codigos;
     ArrayList<Integer> duraciones;
     ArrayList<Double> longitudes;
     ArrayList<Integer> maxVisitantes;
     ArrayList<Integer> numEspecies;
     Scanner scanner;
    
    public Recorridos() {
        this.zonas = new ArrayList<String>();
        this.codigos = new ArrayList<String>();
        this.duraciones = new ArrayList<Integer>();
        this.longitudes = new ArrayList<Double>();
        this.maxVisitantes = new ArrayList<Integer>();
        this.numEspecies = new ArrayList<Integer>();
        this.scanner = new Scanner(System.in);
        
        // Agregar algunos recorridos predeterminados
        agregarRecorrido("R001", "Tropical agua dulce, Toca-Toca", 60, 2.5, 30, 10);
        agregarRecorrido("R002", "Tropical Marino", 90, 4.0, 20, 15);
        agregarRecorrido("R003", "Fondos Rocosos", 45, 1.5, 15, 5);
    }
    
    public void agregarRecorrido(String codigo, String zona, int duracion, double longitud, int maxVisitantes, int numEspecies) {
        codigos.add(codigo);
        zonas.add(zona);
        duraciones.add(duracion);
        longitudes.add(longitud);
        this.maxVisitantes.add(maxVisitantes);
        this.numEspecies.add(numEspecies);
    }
    
public void agregarRecorridos() {
    System.out.println("Ingrese la cantidad de recorridos que desea agregar:");
    int n = scanner.nextInt();
    scanner.nextLine(); // Consumir el salto de línea

    for (int i = 0; i < n; i++) {
        System.out.println("Recorrido " + (i+1) + ":");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Zona: ");
        String zona = scanner.nextLine();
        System.out.print("¿El recorrido pasa por diferentes zonas? (s/n)");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Por favor indique cuáles: ");
            String zonasAdicionales = scanner.nextLine();
            zona += ", " + zonasAdicionales;
        }
        System.out.print("Duración (minutos): ");
        int duracion = scanner.nextInt();
        System.out.print("Longitud (metros): ");
        double longitud = scanner.nextDouble();
        System.out.print("Máximo número de visitantes autorizado: ");
        int maxVisitantes = scanner.nextInt();
        System.out.print("Número de distintas especies que visita: ");
        int numEspecies = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        agregarRecorrido(codigo, zona, duracion, longitud, maxVisitantes, numEspecies);
        System.out.println("Recorrido agregado exitosamente.\n");
    }
}

public void actualizarRecorrido(String codigo) {
    int indice = codigos.indexOf(codigo);
    if (indice == -1) {
        System.out.println("El recorrido con el código '" + codigo + "' no existe.\n");
        return;
    }
    
    System.out.println("Ingrese los nuevos valores para el recorrido " + codigo + ":");
    System.out.print("Zona (" + zonas.get(indice) + "): ");
    String zona = scanner.nextLine();
    if (!zona.isEmpty()) {
        zonas.set(indice, zona);
    }
    
    System.out.print("Duración (" + duraciones.get(indice) + " minutos): ");
    String duracionStr = scanner.nextLine();
    if (!duracionStr.isEmpty()) {
        int duracion = Integer.parseInt(duracionStr);
        duraciones.set(indice, duracion);
    }
    
    System.out.print("Longitud (" + longitudes.get(indice) + " metros): ");
    String longitudStr = scanner.nextLine();
    if (!longitudStr.isEmpty()) {
        double longitud = Double.parseDouble(longitudStr);
        longitudes.set(indice, longitud);
    }
    
    System.out.print("Máximo número de visitantes autorizado (" + maxVisitantes.get(indice) + "): ");
    String maxVisitantesStr = scanner.nextLine();
    if (!maxVisitantesStr.isEmpty()) {
        int maxVisitantes = Integer.parseInt(maxVisitantesStr);
        this.maxVisitantes.set(indice, maxVisitantes);
    }
    
    System.out.print("Número de distintas especies que visita (" + numEspecies.get(indice) + "): ");
    String numEspeciesStr = scanner.nextLine();
    if (!numEspeciesStr.isEmpty()) {
        int numEspecies = Integer.parseInt(numEspeciesStr);
        this.numEspecies.set(indice, numEspecies);
    }
    
    System.out.println("Recorrido actualizado exitosamente.\n");
}
    
    public void eliminarRecorrido() {
    if (codigos.size() == 0) {
        System.out.println("No hay recorridos registrados.\n");
        return;
    }
    
    System.out.print("Ingrese el código del recorrido que desea eliminar: ");
    String codigo = scanner.nextLine();
    
    int indice = codigos.indexOf(codigo);
    if (indice == -1) {
        System.out.println("El recorrido con el código '" + codigo + "' no existe.\n");
        return;
    }
    
    codigos.remove(indice);
    zonas.remove(indice);
    duraciones.remove(indice);
    longitudes.remove(indice);
    maxVisitantes.remove(indice);
    numEspecies.remove(indice);
    
    System.out.println("Recorrido eliminado exitosamente.\n");
}
    public void mostrarRecorridos() {
        if (codigos.size() == 0) {
            System.out.println("No hay recorridos registrados.\n");
            return;
        }
        
        System.out.println("Recorridos registrados:");
        for (int i = 0; i < codigos.size(); i++) {
            System.out.println("Código: " + codigos.get(i));
            System.out.println("Zona: " + zonas.get(i));
            System.out.println("Duración: " + duraciones.get(i) + "minutos");
            System.out.println("Longitud: " + longitudes.get(i) + "metros");
            System.out.println("Máximo número de visitantes autorizado: " + maxVisitantes.get(i));
            System.out.println("Número de distintas especies que visita: " + numEspecies.get(i));
            System.out.println();
           }
         }
    public void mostrarMenu(String Usuario, String Contrasena) {
    if((Usuario.equals("Administrador") && Contrasena.equals("1229")) || (Usuario.equals("Trabajador") && Contrasena.equals("1234"))){
        
    
    int opcion = 0;
    while (opcion != 5) {
        System.out.println("Menú de opciones:");
        System.out.println("1. Agregar un recorrido");
        System.out.println("2. Eliminar un recorrido");
        System.out.println("3. Actualizar un recorrido");
        System.out.println("4. Mostrar los recorridos");
        System.out.println("5. Salir");
        System.out.print("Ingrese el número de la opción que desea ejecutar: ");
        opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                if (Usuario.equals("Administrador") && Contrasena.equals("1229")){
                  agregarRecorridos();
                }
                else{
               System.out.println("No tienes los permisos para acceder a esta opcion");
                }
                break;
            case 2:
                if (Usuario.equals("Administrador") && Contrasena.equals("1229")){
                   eliminarRecorrido();
                }
                else{
                  System.out.println("No tienes los permisos para acceder a esta opcion");
                }
                break;
            case 3:
                System.out.print("Ingrese el código del recorrido que desea actualizar: ");
                String codigo = scanner.nextLine();
                actualizarRecorrido(codigo);
                break;
            case 4:
                mostrarRecorridos();
                break;
            case 5:
                System.out.println("Saliendo del menú.");
                break;
            default:
                System.out.println("Opción inválida. Por favor ingrese un número del 1 al 5.\n");
                break;
        }
    }
}
    else{
        mostrarRecorridos();
    }
}
}