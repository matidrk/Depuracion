package ccs.entornos.depuracion.testing;

public class PruebaOrdenacion {

	public static void main(String[] args) {
		OrdenacionLenta lenta = new OrdenacionLenta();
		int[] mat={5,10,1,2,8,56,34,67,234,6,57,14};
		lenta.ordenar(mat);

	}

}
