public class EntradaSalida extends Procesos{
    public EntradaSalida(String name, String accion, String PID)
    {
        super(PID, name, accion);
    }
    @Override
    public String ejecutar()
    {
        return "Ejecutando proceso de Entradas y Salidas: " + name + " [PID: " + PID + "] - " + accion + "...";
    }
}