package recuperatorio.ejercicio01;

import java.util.ArrayList;

public class AfiliadoJoven extends Afiliado{
    private String universidad;
    private String carrera;

    public AfiliadoJoven(float porcentaje, ArrayList<PrestacionMedica> prestacionesMedicas, ArrayList<PrestacionOdontologica> prestacionOdontologicas, String universidad, String carrera) {
        super(porcentaje, prestacionesMedicas, prestacionOdontologicas);
        this.universidad = universidad;
        this.carrera = carrera;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
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
                total += prestacionMedica.getPractica().getCostoPractica() * 0.20 + 150.0;
            }
            for ( PrestacionOdontologica prestacionOdontologica : this.getPrestacionOdontologicas()) {
                total += prestacionOdontologica.getPractica().getCostoPractica() * 0.8;
            }
            return total;
        }
    }
}
