package recuperatorio.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private Integer id;
	private List<Pedido> pedidos;
	private Integer maxHabilitado;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void crearPedido(Integer nroPedido) {
		if(this.pedidos==null)this.pedidos = new ArrayList<Pedido>();
		this.pedidos.add(new Pedido(nroPedido));
	}
	
	public void agregarProducto(Integer nroPedido, Integer idProducto,Integer cantidad) throws BusquedaProductoException, DatabaseException, StockInsuficienteException, MaximoProductosAlcanzadoException {

		Producto p = Database.buscarProducto(idProducto);
		if(p == null){
			throw new BusquedaProductoException();
		}
		// verificar si el stock existente alcanza para agregarlo al pedido
		// verificar si el cliente cumple la condicion pedida para agregar el producto
		if(p.getStock() >= cantidad){
			if(this.productosDisponibles() >= cantidad){
				Pedido pedido = this.buscarPorNro(nroPedido);
				pedido.addDetalle(p, cantidad);
			} else {
				throw new MaximoProductosAlcanzadoException();
			}
		} else {
			throw new StockInsuficienteException();
		}

	}
	
	public Pedido buscarPorNro(Integer nroPedido) {
		for(Pedido p : this.pedidos) {
			if(p.getNroPedido().equals(nroPedido)) return p;
		}
		return null;
	}
	
	public List<Producto> productosMontoMayor(Double monto){}
	
	public Double compraPromedio(){}

	public Integer getMaxHabilitado() {
		return maxHabilitado;
	}

	public void setMaxHabilitado(Integer maxHabilitado) {
		this.maxHabilitado = maxHabilitado;
	}

	public int productosDisponibles(){
		int cantidadProductosDisponibles = 0;
		int cantidadProductosPedidos = 0;

		for(Pedido pedido: pedidos){
			for(PedidoDetalle pedidoDetalle : pedido.getDetalles()){
				cantidadProductosPedidos += pedidoDetalle.getCantidad();
			}
		}

		cantidadProductosDisponibles = this.maxHabilitado - cantidadProductosPedidos;

		return cantidadProductosDisponibles;
	}
}
