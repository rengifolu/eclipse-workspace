package es.unileon.supermercado;

/**
 * Clase que representa un almacen de productos de capacidad
 * limitada.
 *
 * @author PRG
 * @version 1.0
 */



public abstract class Almacen extends Component{
	
	/**
	 * Matriz de productos que contiene el almacen
	 */
	private Producto productos[];
	/**
	 * Capacidad del almacen en tipos de productos distintos
	 */
	final int MAXIMO_PROD = 10;
	/**
	 * Numero de tipos de productos almacenados en cada momento
	 * en el almacen (o primera posicion libre de la matriz de
	 * productos)
	 */
	private int siguiente;

	/**
	 * Constructor de la clase que inicializa sus atributos
	 */
	Almacen(){
		this.productos = new Producto[MAXIMO_PROD];
		this.siguiente = 0;
	}

	/**
	 * Metodo que sirve para aniadir un producto al almacen,
	 * siempre que no este repetido y haya sitio.
	 *
	 * @param producto el producto que se desea aniadir
	 * @return verdadero si el producto ya sido aniadido con exito
	 * y falso en caso contrario
	 */
	public boolean anyadir(Producto producto){
		boolean repetido,exito;

		exito = false;
		repetido = existe(producto);
		if ( repetido ){
			System.out.println
			("Error: el producto " + producto.obtenerNombre() + 
					" ya se encuentra en el almacen.");
		}else if ( siguiente == MAXIMO_PROD ){
			System.out.println
			("Error: almacen de productos lleno. El producto " +
					producto.obtenerNombre() + " no se ha introducido.");
		}else{
			productos[siguiente++] = new Producto(producto);
			exito = true;
		}
		return exito;
	}

	/**
	 * Comprueba si un producto se encuentra ya en el almacen.
	 *
	 * @param producto el producto buscado
	 * @return verdadero si el producto ya se encuentra en el almacen
	 * y falso en caso contrario
	 */
	public  boolean existe(Producto producto){
		int i;
		boolean exito;

		exito = false;
		i = 0;
		while ( (!exito) && (i < siguiente ) )
			if ( producto.esIgualA(productos[i]) )
				exito = true;
			else
				i++;
		return exito;
	}

	/**
	 * Utiliza el algoritmo de la busqueda binaria sobre la
	 * coleccion ordenada de los productos.
	 *
	 * @param nombre nombre del producto que se desea localizar
	 * @return el producto buscado si se encuentra en el almacen
	 * o nulo en caso contrario
	 */
	public Producto buscar(String nombre){
		int limiteInferior, limiteSuperior, mitad;
		Producto encontrado;

		limiteInferior = 0;
		limiteSuperior = productos.length - 1;
		encontrado = null;

		ordenar();
		while ( (limiteInferior <= limiteSuperior) && (encontrado == null) ){
			mitad = (limiteInferior + limiteSuperior) / 2 ;
			if ( productos[mitad].esMayor(nombre) ){
				limiteSuperior = mitad - 1;
			} else if ( productos[mitad].esMenor(nombre) ) {
				limiteInferior = mitad + 1;
			} else
				encontrado = productos[mitad];
		}
		if ( encontrado == null ){
			System.out.println
			("Error: el producto " + nombre +
					" no se encuentra en el almacen.");
		}else{
			System.out.print("Producto encontrado: ");
			System.out.print(encontrado);
		}
		return encontrado;
	}

	/**
	 * Intercambia la posicion de dos productos dentro 
	 * de la matriz.
	 *
	 * @param i posicion del primer producto
	 * @param j posicion del segundo producto
	 */
	public void cambiar(int i, int j){
		Producto aux;

		aux = productos[i];
		productos[i] = productos[j];
		productos[j] = aux;
	}

	/**
	 * Utiliza el algoritmo de la burbuja bidireccional para 
	 * ordenar los productos del almacen de manera ascente en orden
	 * alfabetico por su nombre.
	 */
	public void ordenar(){
		int limiteSuperior, limiteInferior;
		boolean fin, cambiado;

		limiteSuperior = productos.length;
		limiteInferior = -1;
		fin = false;

		while ( (limiteInferior < limiteSuperior) && !fin ) {
			limiteInferior++;
			limiteSuperior--;
			cambiado = false;
			for (int j = limiteInferior; j < limiteSuperior; j++){
				if ( productos[j].esMayor(productos[j + 1]) ) {
					cambiar(j,j+1);
					cambiado = true;
				}
			}
			if (!cambiado){
				fin = true;
			}else{
				cambiado = false;
				for (int j = limiteSuperior; --j >= limiteInferior; ) {
					if ( productos[j].esMayor(productos[j + 1]) ) {
						cambiar(j,j+1);
						cambiado = true;
					}
				}
				if (!cambiado) {
					fin = true;
				}
			}
		}
	}

	/**
	 * Devuelve una cadena de caracteres con los productos del almacen ordenados.
	 */
	public String toString(){
		StringBuffer salida = new StringBuffer();
		ordenar();
		salida.append("---------");
		salida.append("PRODUCTOS");
		salida.append("---------\n");
		for (int i=0; i < siguiente; i++){
			salida.append(productos[i].toString()+"\n");
		}
		return salida.toString();
	}

}
