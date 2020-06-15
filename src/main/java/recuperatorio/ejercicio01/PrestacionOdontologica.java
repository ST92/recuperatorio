package recuperatorio.ejercicio01;

import java.time.LocalDate;

public class PrestacionOdontologica extends Prestacion{

    public PrestacionOdontologica(Practica practica, LocalDate fecha, boolean preAprobada, Afiliado afiliado) {
        super(practica, fecha, preAprobada, afiliado);
    }
}
