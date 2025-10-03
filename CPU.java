public class CPU extends Procesos{
    public CPU(String PID, String name, String accion)
    {
        super(PID, name, accion);
    }
    @Override
    public String ejecutar()
    {
        return "Ejecutando proceso de CPU " + name + " [PID: " + PID + "] - " + accion + "...";
    }
}