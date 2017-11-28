package es.unileon.supermercado;

public class PruebaSupermercado {

    public static void main(String args[]){
    	
    	
	Supermercado supermercado;
	supermercado = new Supermercado("Galenas--");
	
	supermercado.anyadir(new Leaf("libreta", 3.5, 10));
	supermercado.anyadir(new Leaf("lapiz", 1.0, 100));
	supermercado.anyadir(new Leaf("papel", 2, 50));
	supermercado.anyadir(new Leaf("goma", 0.5, 60));
	supermercado.anyadir(new Leaf("carpeta", 1.5, 200));
	supermercado.anyadir(new Leaf("calendario", 1.8, 40));
	supermercado.anyadir(new Leaf("rotulador", 0.4, 150));
	supermercado.anyadir(new Leaf("tiza", 0.1, 90));
	supermercado.anyadir(new Leaf("borrador", 2.0, 30));
	supermercado.anyadir(new Leaf("dvd", 0.10, 500));
	supermercado.anyadir(new Leaf("toner", 100.0, 10));
	System.out.print(supermercado);
    }

}
