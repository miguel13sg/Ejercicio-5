import java.util.*;

public class Controlador {
    private Vista vista;
    private List<Procesos> listaProcesos;

    public Controlador(){
        this.vista = new Vista();
        this.listaProcesos = new ArrayList<>();
    }
    public void iniciarSistema()
    {
        int opcion = 0;
        do{
            vista.mostrarMenu();
            opcion = vista.pedirOpcion();
            procesarOpcion(opcion);
        }
        while(opcion != 3);
        vista.mostrarFinal();
        vista.cerrar();
        
    }
    private void procesarOpcion(int opcion)
    {
        switch(opcion){
            case 1: agregarProceso(); break;
            case 2: ejecutarProcesos(); break;
            case 3: break;
            default: vista.mostrarError("Opción Inválida");
        }
    }
    private void agregarProceso(){
        String tipo = vista.pedirTipoProceso();
        String PID = vista.pedirPID();
        String nombre = vista.pedirNombre();
        String accion = vista.pedirAccion();
        
        if(tipo.equals("CPU"))
        {
            Procesos proceso = new CPU(PID, nombre, accion);
            listaProcesos.add(proceso);

        }
        else if(tipo.equals("Daemons"))
        {
            Procesos proceso = new Daemons(PID, nombre, accion);
            listaProcesos.add(proceso);
        }
        else if(tipo.equals("Entrada y Salida"))
        {
            Procesos proceso = new EntradaSalida(PID, nombre, accion);
            listaProcesos.add(proceso);
        }
        else{
            vista.mostrarError("Opción Inválida");
        }
    }
    private void ejecutarProcesos()
    {
        for(Procesos proceso : listaProcesos)
        {
            String resultado = proceso.ejecutar();
            vista.mostrarResultado(resultado);
        }
    }
}
