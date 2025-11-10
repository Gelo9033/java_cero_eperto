package relaciones;

import java.util.Scanner;

public class PruebaAutomovil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Marca del automóvil: ");
        String marca = sc.nextLine();

        System.out.print("Modelo del automóvil: ");
        String modelo = sc.nextLine();

        // Tipo de motor (enum) -> mostrar opciones
        System.out.println("Seleccione Tipo de Motor:");
        TipoMotor[] motores = TipoMotor.values();
        for (int i = 0; i < motores.length; i++) {
            System.out.println(i + " -> " + motores[i].name());
        }
        TipoMotor tipoMotor = motores[leerEntero(sc, "Ingrese el número del tipo de motor: ", 0, motores.length - 1)];

        double cilindrada = leerDouble(sc, "Cilindrada del motor (por ejemplo 1.4): ");

        // Tanque
        double capacidadTanque = leerDouble(sc, "Capacidad del tanque en galones (por ejemplo 40): ");

        // Propietario
        System.out.print("Nombre del propietario: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido del propietario: ");
        String apellido = sc.nextLine();
        System.out.print("CI del propietario: ");
        String ci = sc.nextLine();

        // Tipo vehiculo (enum) -> mostrar opciones
        System.out.println("Seleccione Tipo de Vehículo:");
        TipoVehiculo[] tipos = TipoVehiculo.values();
        for (int i = 0; i < tipos.length; i++) {
            System.out.println(i + " -> " + tipos[i].name() +
                    " (llantas: " + tipos[i].getNumeroLlantas() +
                    ", presion esperada: " + tipos[i].getPresionNeumatica() + ")");
        }
        TipoVehiculo tipoVehiculo = tipos[leerEntero(sc, "Ingrese el número del tipo de vehículo: ", 0,
                tipos.length - 1)];

        // Solicitar datos de cada rueda según número de llantas del tipo
        int n = tipoVehiculo.getNumeroLlantas();
        Rueda[] ruedas = new Rueda[n];
        System.out.println("Ingrese datos de las " + n + " ruedas:");
        for (int i = 0; i < n; i++) {
            System.out.println("Rueda " + (i + 1) + ":");
            System.out.print("  Fabricante: ");
            String fab = sc.nextLine();
            System.out.print("  Marca: ");
            String mar = sc.nextLine();
            int ring = (int) leerDouble(sc, "  Ring (entero, por ejemplo 16): ");
            double ancho = leerDouble(sc, "  Ancho (por ejemplo 205.0): ");
            double presion = leerDouble(sc, "  Presion (ej. " + tipoVehiculo.getPresionNeumatica() + "): ");
            ruedas[i] = new Rueda(fab.equals("") ? "desconocido" : fab,
                    mar.equals("") ? "desconocido" : mar,
                    ring, ancho, presion);
        }

        // Crear objetos compuestos y el automóvil
        Motor motor = new Motor(cilindrada, tipoMotor);
        Tanque tanque = new Tanque(capacidadTanque);
        Persona propietario = new Persona(nombre, apellido, ci);

        Automovil auto = new Automovil(marca, modelo, motor, tanque, propietario, tipoVehiculo, ruedas);

        // Mostrar detalles y validar presiones (método devuelve mensaje)
        System.out.println("\nDetalles del automóvil:");
        System.out.println(auto.getDetalles());
        System.out.println("Validación de presiones: " + auto.validarPresiones());

        sc.close();
    }

    private static int leerEntero(Scanner sc, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine();
            try {
                int v = Integer.parseInt(line);
                if (v >= min && v <= max)
                    return v;
            } catch (NumberFormatException ignored) {
            }
            System.out.println("Entrada inválida. Intente nuevamente.");
        }
    }

    private static double leerDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Ingrese un número (ej. 32.5).");
            }
        }
    }
}