package recuperatorio.ejercicio02;

public class MaximoProductosAlcanzadoException extends Exception{
    public MaximoProductosAlcanzadoException() {
        System.out.println("Ya ha alcanzado el máximo de productos permitido.");
    }
}
