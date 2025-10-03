public class Daemons extends Procesos{
    public Daemons(String PID, String name, String accion)
    {
        super(PID, name, accion);
    }
    @Override
    public String ejecutar()
    {
        return "Ejecutando proceso de Daemons: " + name + " [PID: " + PID + "] - " + accion + "...";
    }
}