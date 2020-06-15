package recuperatorio.ejercicio02;

public class BusquedaProductoException extends Exception{
    public BusquedaProductoException(){
        System.out.println("El producto buscado no existe.");
    }
}
