package es.unileon.supermercado;

/**
 * Clase que representa un supermercado caracterizado por un
 * nombre y que incluye un almacén de productos.
 *
 * @author PRG
 * @version 1.0
 */

public  class Supermercado extends Component{
	

	/**
	 * Nombre del supermercado
	 */ 
	private String nombre;
	/**
	 * Almacen de productos
	 */
	private Almacen almacen;

	/**
	 * Constructor del supermercado a partir del nombre del mismo.
	 */
	Supermercado(String nombre){
		this.nombre = nombre;
		this.almacen = new Almacen();
	}

	/**
	 * Método que sirve para intentar aniadir un nuevo producto
	 * al almacen. Esto sera posible siempre y cuando el producto
	 * no se encuentre ya en el almacen, y el almacen siga
	 * disponiendo de sitio para su almacenaje.
	 *
	 * @param producto producto que se desea aniadir al almacen
	 * @return verdadero si ha sido posible aniadir el producto
	 * y falso en caso contrario
	 */
	public boolean anyadir(Producto producto){
		return almacen.anyadir(producto);
	}

	/**
	 * Trata de localizar un producto en el almacen a partir de
	 * su nombre.
	 *
	 * @param producto nombre del producto que se desea localizar
	 * @return el producto, en caso de encontrarlo, o null en caso
	 * contrario.
	 */
	public Producto buscar(String producto){
		return almacen.buscar(producto);
	}

	/**
	 * Devuelve una cadena de caracteres con toda la información relativa al 
	 * supermercado.
	 *
	 */
	public String toString(){
		return "--Supermercado " + nombre + "--\n" + this.almacen.toString();
	}

	@Override
	public boolean existe(Producto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void cambiar(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double obtenerPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int obtenerCantidad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean esIgualA(Producto otro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esIgualA(String nombre) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esMenor(String otro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esMayor(String otro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esMenor(Producto otro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esMayor(Producto otro) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	

}
