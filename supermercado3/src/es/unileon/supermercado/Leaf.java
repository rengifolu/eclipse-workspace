package es.unileon.supermercado;

public class Leaf extends Component{
	
	/**
	 * nombre de hoja
	 */
	private String nombre;
	/**
	 * Precio unitario en euros
	 */
	private double precio;
	/**
	 * Numero de unidades disponibles
	 */
	private int cantidad;
	
	
	public Leaf(String nombre , double precio , int cantidad) {
		
		this.nombre     = nombre;
		this.precio   = precio;
		this.cantidad = cantidad;
	}
	
	/**
	 * Constructor de copia que crea un producto como replica
	 * del recibido como parametro
	 *
	 * @param otro producto a partir del cual se efectua la copia
	 */
	Leaf(Leaf otro){
		nombre = otro.obtenerNombre();
		precio = otro.obtenerPrecio();
		cantidad = otro.obtenerCantidad();
	}


	/**
	 * Devuelve el nombre del producto
	 *
	 * @return nombre del producto
	 */
	
	@Override
	public String obtenerNombre(){
		return nombre;
	}

	/**
	 * Devuelve el precio del producto en euros
	 *
	 * @return precio unitario en euros
	 */
	
	@Override
	public double obtenerPrecio(){
		return precio;
	}

	/**
	 * Devuelve la cantidad de unidades disponibles
	 *
	 * @return unidades disponibles
	 */
	@Override
	public int obtenerCantidad(){
		return cantidad;
	}

	/**
	 * Compara si el producto es igual al recibido como 
	 * parametro.
	 *
	 * @param otro producto con el que se compara el actual
	 * @return verdadero si los dos productos son iguales y
	 * falso en otro caso
	 */
	@Override
	public boolean esIgualA(Leaf otro){
		return nombre.equalsIgnoreCase(otro.obtenerNombre());
	}

	/**
	 * Compara si el producto tiene el mismo nombre que
	 * el recibido como parametro
	 *
	 * @param nombre nombre con el que se compara el nombre del actual
	 * @return verdadero si los dos nombres son iguales y
	 * falso en otro caso
	 */
	@Override
	public boolean esIgualA(String nombre){
		return nombre.equalsIgnoreCase(nombre);
	}

	/**
	 * Comprueba si el nombre del producto actual es menor 
	 * alfabeticamente que el recibido como parametro
	 *
	 * @param otro nombre con el que se compara el del producto actual
	 * @return verdadero si el nombre del producto actual es menor
	 * alfabeticamente que el recibido como parametro y falso en 
	 * caso contrario
	 */
	@Override
	public boolean esMenor (String otro){
		return nombre.toLowerCase().compareTo(otro.toLowerCase()) < 0;
	}

	/**
	 * Comprueba si el nombre del producto actual es mayor
	 * alfabeticamente que el recibido como parametro
	 *
	 * @param otro nombre con el que se compara el del producto actual
	 * @return verdadero si el nombre del producto actual es mayor
	 * alfabeticamente que el recibido como parametro y falso en 
	 * caso contrario
	 */
	public boolean esMayor (String otro){
		return nombre.toLowerCase().compareTo(otro.toLowerCase()) > 0;
	}

	/**
	 * Comprueba si nombre del producto actual es menor 
	 * alfabeticamente que el del producto recibido como parametro
	 *
	 * @param otro producto con el que se compara el producto actual
	 * @return verdadero si el nombre del producto actual es menor
	 * alfabeticamente que el de el producto recibido como parametro
	 * y falso en caso contrario
	 */
	
	@Override
	public boolean esMenor (Leaf otro){
		return nombre.toLowerCase().compareTo
				(otro.obtenerNombre().toLowerCase() ) < 0;
	}

	/**
	 * Comprueba si nombre del producto actual es mayor 
	 * alfabeticamente que el del producto recibido como parametro
	 *
	 * @param otro producto con el que se compara el producto actual
	 * @return verdadero si el nombre del producto actual es mayor
	 * alfabeticamente que el de el producto recibido como parametro
	 * y falso en caso contrario
	 */
	@Override
	public boolean esMayor (Leaf otro){
		return nombre.toLowerCase().compareTo
				(otro.obtenerNombre().toLowerCase() ) > 0;
	}

	/**
	 * Devuelve una cadena de caracteres con toda la informacion relativa al producto
	 */
	public String toString(){
		return "\t" + nombre + ":" + precio + ":" + cantidad;
	}

	
	
	/****************************************************************************************
	 * (non-Javadoc)                                                                        *
	 * @see es.unileon.supermercado.Componente#anyadir(es.unileon.supermercado.Componente)  *
	 ****************************************************************************************/
	
	@Override
	public boolean anyadir(Leaf compuesto) {
		// TODO Auto-generated method stub
		// return false;
		throw new UnsupportedOperationException("no soportado");
	}

	@Override
	public Leaf buscar(String product) {
		// TODO Auto-generated method stub
		// return null;
		throw new UnsupportedOperationException("no soportado");
	}

	@Override
	public boolean existe(Leaf producto) {
		// TODO Auto-generated method stub
		// return false;
		throw new UnsupportedOperationException("no soportado");
	}

	@Override
	public void cambiar(int i, int j) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("no soportado");
	}

	@Override
	public void ordenar() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("no soportado");
	}




}
