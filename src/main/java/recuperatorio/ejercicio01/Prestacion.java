package recuperatorio.ejercicio01;

import java.time.LocalDate;

public class Prestacion {
    protected Practica practica;
    private LocalDate fecha;
    private boolean preAprobada;
    private Afiliado afiliado;

    public Prestacion(Practica practica, LocalDate fecha, boolean preAprobada, Afiliado afiliado) {
        this.practica = practica;
        this.fecha = fecha;
        this.preAprobada = preAprobada;
        this.afiliado = afiliado;
    }

    public Practica getPractica() {
        return practica;
    }

    public void setPractica(Practica practica) {
        this.practica = practica;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isPreAprobada() {
        return preAprobada;
    }

    public void setPreAprobada(boolean preAprobada) {
        this.preAprobada = preAprobada;
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }
}
