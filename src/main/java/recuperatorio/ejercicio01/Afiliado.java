package recuperatorio.ejercicio01;


import java.util.ArrayList;

public class Afiliado {

	protected float porcentaje;

	protected ArrayList<PrestacionMedica> prestacionesMedicas;
	protected ArrayList<PrestacionOdontologica> prestacionOdontologicas;

	public Afiliado(float porcentaje, ArrayList<PrestacionMedica> prestacionesMedicas, ArrayList<PrestacionOdontologica> prestacionOdontologicas) {
		this.porcentaje = porcentaje;
		this.prestacionesMedicas = prestacionesMedicas;
		this.prestacionOdontologicas = prestacionOdontologicas;
	}

	public double facturar() {
		return 0.0;
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	public ArrayList<PrestacionMedica> getPrestacionesMedicas() {
		return prestacionesMedicas;
	}

	public void setPrestacionesMedicas(ArrayList<PrestacionMedica> prestacionesMedicas) {
		this.prestacionesMedicas = prestacionesMedicas;
	}

	public ArrayList<PrestacionOdontologica> getPrestacionOdontologicas() {
		return prestacionOdontologicas;
	}

	public void setPrestacionOdontologicas(ArrayList<PrestacionOdontologica> prestacionOdontologicas) {
		this.prestacionOdontologicas = prestacionOdontologicas;
	}
}
