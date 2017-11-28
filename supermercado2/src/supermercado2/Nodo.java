package supermercado2;




public abstract class Nodo {
	
	public static final  int STOREHOUSE = 1;
	public static final  int DIVISION = 2;
	
	protected String nombre ;
	protected int type;        // no gusta 
	protected int lvl;         // si gusta para guardar nivel de nodo
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public static int getStorehouse() {
		return STOREHOUSE;
	}
	public static int getDivision() {
		return DIVISION;
	}
	
	public abstract String getInfo();

}
