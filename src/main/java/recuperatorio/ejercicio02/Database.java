package recuperatorio.ejercicio02;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Database {
	
	private static List<Producto> _PRODUCTOS;
	public static void loadProductos() {
		Random r = new Random();
		for(int i=0;i<10;i++) {
			_PRODUCTOS.add(new Producto(i+1, "PRODUCTO "+i, 3, r.nextDouble()*100));
		}
	}
	
	public static Producto buscarProducto(Integer id) throws DatabaseException{
		for(Producto p : _PRODUCTOS) {
			if(p.getId().equals(id)) return p;
		}
		return null;
	}

	public List<Producto> productosMontoMayor(Double montoMinimo,Double montoMaximo){
		return _PRODUCTOS.stream().filter(producto -> producto.getPrecio()>montoMinimo)
				.filter(producto -> producto.getPrecio()<montoMaximo)
				.sorted((p1, p2)->p1.getPrecio().compareTo(p2.getPrecio()))
				.collect(Collectors.toList());
	}

	public Double precioMedio(){
		return _PRODUCTOS.stream()
				.mapToDouble(Producto::getPrecio)
				.average()
				.getAsDouble();
	}
	
}
