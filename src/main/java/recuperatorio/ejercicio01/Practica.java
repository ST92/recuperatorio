package recuperatorio.ejercicio01;

public class Practica {
    private String descripcion;
    private long codigoNumerico;
    private float costoPractica;

    public Practica(String descripcion, long codigoNumerico, float costoPractica) {
        this.descripcion = descripcion;
        this.codigoNumerico = codigoNumerico;
        this.costoPractica = costoPractica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(long codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public float getCostoPractica() {
        return costoPractica;
    }

    public void setCostoPractica(float costoPractica) {
        this.costoPractica = costoPractica;
    }
}
