package es.unileon.supermercado;



/*
 * incluiye todos los metodos 
 */

public abstract class Component {
	
	/*
	 * metodos para supermercado  y se implementan tambien en almacen
	 */
	public abstract boolean  anyadir(Leaf compuesto);
	public abstract Leaf buscar(String product);
	
	/*
	 * metodos para almacen
	 */
	public abstract boolean existe(Leaf producto);
	public abstract void    cambiar(int i, int j);
	public abstract void    ordenar();
	

	
	/*
	 * metodos para producto
	 */
	public abstract String  obtenerNombre();
	public abstract double  obtenerPrecio();
	public abstract int     obtenerCantidad();
	public abstract boolean esIgualA(Leaf otro);
	public abstract boolean esIgualA(String nombre);
	public abstract boolean esMenor (String otro);
	public abstract boolean esMayor (String otro);
	public abstract boolean esMenor (Leaf otro);
	public abstract boolean esMayor (Leaf otro);


}
