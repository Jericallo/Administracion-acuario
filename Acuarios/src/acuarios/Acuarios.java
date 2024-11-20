/*
UNIVA
PROFESOR: IRVING EDGAR MENDOZA AYALA
EQUIPO 10
INTEGRANTES:
CARLOS ALBERTO PACHECO ACEVES 
SALVADOR AREVALO NAVARRO
JESUS ALEJANDRO MORALES SANCHEZ

SOFTWARE DE UN ACUARIO

*/

package acuarios;


import java.util.Scanner;

public class Acuarios {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        //Admin
        zona_oceanos zona3 = new zona_oceanos();
        Recorridos recorridos = new Recorridos();
        Guias guia = new Guias();
        Vigilantes vigilantes = new Vigilantes();

        //Trabajador

        int op;

        do {
            System.out.println("Cual eres. Elige en numeros");
            System.out.println("\n 1. Administrador");
            System.out.println("\n 2. Trabajdor");
            System.out.println("\n 3. Cliente ");
            System.out.println("\n 0. Salir");

            op = leer.nextInt();

            switch (op) {

case 1:
    System.out.println("Iniciar Seccion ");
    System.out.println("Nombre De Usuario ");
    leer.nextLine();
    String Usuario1 = leer.nextLine();

    System.out.println("Contraseña ");
    String Contrasena = leer.nextLine();

    if (Usuario1.equals("Administrador") && Contrasena.equals("1229")) {

        boolean salir = false;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Llenar habitats");
            System.out.println("2. Menú de recorridos");
            System.out.println("3. Menú de vigilantes");
            System.out.println("4. Menú de guías");
            System.out.println("0. Salir");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    zona3.llenarhabitats(Usuario1, Contrasena);
                    break;
                case 2:
                    recorridos.mostrarMenu(Usuario1, Contrasena);
                    break;
                case 3:
                    vigilantes.mostrarMenu(Usuario1, Contrasena);
                    break;
                case 4:
                    guia.mostrarMenu(Usuario1, Contrasena);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (!salir);

    } else {
        System.out.println("Error de datos favor de intentarlo mas tarde");
    }
    break;


case 2:
    System.out.println("Iniciar Sesión");
    System.out.println("Nombre De Usuario:");
    leer.nextLine();
    String Usuario2 = leer.nextLine();

    System.out.println("Contraseña:");
    String Contrasena2 = leer.nextLine();

    if (Usuario2.equals("Trabajador") && Contrasena2.equals("1234")) {
                boolean salir = false;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Llenar habitats");
            System.out.println("2. Menú de recorridos");
            System.out.println("3. Menú de vigilantes");
            System.out.println("4. Menú de guías");
            System.out.println("0. Salir");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    zona3.llenarhabitats(Usuario2, Contrasena2);
                    break;
                case 2:
                    recorridos.mostrarMenu(Usuario2, Contrasena2);
                    break;
                case 3:
                    vigilantes.mostrarMenu(Usuario2, Contrasena2);
                    break;
                case 4:
                    guia.mostrarMenu(Usuario2, Contrasena2);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (!salir);
    } else {
        System.out.println("Error de datos, por favor intente de nuevo más tarde.");
    }
    break;

                case 3:
                    System.out.println("Entraste como cliente");
                    String Usuario3 = "0";
                    String Contrasena3 = "0";
                    zona3.llenarhabitats(Usuario3, Contrasena3);
                    recorridos.mostrarMenu(Usuario3, Contrasena3);

                    break;

                case 0:
                    break;

                default:
                    System.out.println("No se puede");

            }

        } while (op != 0);

    }
}
