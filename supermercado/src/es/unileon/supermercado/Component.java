package es.unileon.supermercado;

public abstract class Component {
	
	
	/*
	 * metodos para supermercado  y se implementan tambien en almacen
	 */
	public abstract boolean  anyadir(Producto producto);
	public abstract Producto buscar(String producto);
	
	/*
	 * metodos para almacen
	 */
	public abstract boolean existe(Producto producto);
	public abstract void    cambiar(int i, int j);
	public abstract void    ordenar();
	

	
	/*
	 * metodos para producto
	 */
	public abstract String  obtenerNombre();
	public abstract double  obtenerPrecio();
	public abstract int     obtenerCantidad();
	public abstract boolean esIgualA(Producto otro);
	public abstract boolean esIgualA(String nombre);
	public abstract boolean esMenor (String otro);
	public abstract boolean esMayor (String otro);
	public abstract boolean esMenor (Producto otro);
	public abstract boolean esMayor (Producto otro);

}
