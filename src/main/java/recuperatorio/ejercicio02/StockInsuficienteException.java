package recuperatorio.ejercicio02;

public class StockInsuficienteException extends Exception{
    public StockInsuficienteException() {
        System.out.println("No hay stock suficiente del producto seleccionado.");
    }
}
