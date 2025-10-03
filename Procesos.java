public abstract class Procesos{
    protected String name;
    protected String PID;
    protected String accion;

    public Procesos(String PID, String name, String accion)
    {
        this.name = name;
        this.PID = PID;
        this.accion = accion;
    }    
    public abstract String ejecutar();

    public String getName()
    {
        return name;
    }
    public String getPID()
    {
        return PID;
    }
    public String getAccion()
    {
        return accion;
    }
}