import java.util.Scanner;

public class Vista {
    private Scanner scanner;
    
    public Vista() {
        this.scanner = new Scanner(System.in);
    }    
    public void mostrarMenu() {
        System.out.println("\n=== SISTEMA DE PROCESOS ===");
        System.out.println("1. Añadir proceso");
        System.out.println("2. Ejecutar procesos");
        System.out.println("3. Salir");
        System.out.print("Seleccione opción: ");
    }
    
    public void mostrarFinal() {
        System.out.println("¡Gracias por usar el sistema!");
    }
    
    public void mostrarError(String mensaje) {
        System.out.println("ERROR: " + mensaje);
    }
    
    public void mostrarResultado(String resultado) {
        System.out.println("-> " + resultado);
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public int pedirOpcion() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine(); // Limpiar buffer
        }
    }
    
    public String pedirTipoProceso() {
        System.out.println("\n--- TIPOS DE PROCESOS ---");
        System.out.println("1. CPU");
        System.out.println("2. Daemons"); 
        System.out.println("3. Entrada y Salida");
        System.out.print("Seleccione tipo: ");
        
        int tipo = pedirOpcion();
        switch(tipo) {
            case 1: return "CPU";
            case 2: return "Daemons";
            case 3: return "Entrada y Salida";
            default: 
                mostrarError("Tipo inválido");
                return pedirTipoProceso(); // Recursión hasta que sea válido
        }
    }    
    public String pedirPID() {
        System.out.print("Ingrese PID: ");
        return scanner.nextLine();
    }
    public String pedirNombre() {
        System.out.print("Ingrese nombre del proceso: ");
        return scanner.nextLine();
    }    
    public String pedirAccion() {
        System.out.print("Ingrese acción del proceso: ");
        return scanner.nextLine();
    }
    public void cerrar() {
        scanner.close();
        System.out.println("Recursos liberados.");
    }
}