package recuperatorio.ejercicio01;

import java.util.ArrayList;

public class AfiliadoPlus extends Afiliado{
    private long cuitEmpleador;

    public AfiliadoPlus(float porcentaje, ArrayList<PrestacionMedica> prestacionesMedicas, ArrayList<PrestacionOdontologica> prestacionOdontologicas, long cuitEmpleador) {
        super(porcentaje, prestacionesMedicas, prestacionOdontologicas);
        this.cuitEmpleador = cuitEmpleador;
    }

    public long getCuitEmpleador() {
        return cuitEmpleador;
    }

    public void setCuitEmpleador(long cuitEmpleador) {
        this.cuitEmpleador = cuitEmpleador;
    }

    /*
    En las prestaciones por medicas, los afiliados del plan joven pagan el 20% de la prestación
    y $150 fijos y los afiliados del plan plus pagan el 25%  de la prestacion.
    En las prestaciones odontologicas el afiliado por plan jove paga el 80% de la prestacion y el
    afiliado plan plus paga el 50% de la prestación.
     */

    @Override
    public double facturar() {
        if((this.getPrestacionesMedicas().isEmpty() && this.getPrestacionOdontologicas().isEmpty())
        || (this.getPrestacionesMedicas() == null && this.getPrestacionOdontologicas() == null)){
            return super.facturar();
        }
        else {
            double total = 0.0;
            for ( PrestacionMedica prestacionMedica : this.getPrestacionesMedicas()) {
                total += prestacionMedica.getPractica().getCostoPractica() * 0.25;
            }
            for ( PrestacionOdontologica prestacionOdontologica : this.getPrestacionOdontologicas()) {
                total += prestacionOdontologica.getPractica().getCostoPractica() * 0.5;
            }
           return total;
        }
    }
}
