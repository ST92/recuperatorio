package recuperatorio.ejercicio01;

import java.time.LocalDate;

public class PrestacionMedica extends Prestacion {

    public PrestacionMedica(Practica practica, LocalDate fecha, boolean preAprobada, Afiliado afiliado) {
        super(practica, fecha, preAprobada, afiliado);
    }
}
