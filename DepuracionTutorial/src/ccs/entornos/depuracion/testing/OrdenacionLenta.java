package ccs.entornos.depuracion.testing;

public class OrdenacionLenta {
	public void ordenar(int[] numeros){
		int posicionInicial;
		for(posicionInicial=0;posicionInicial<numeros.length;posicionInicial++){
			int posMin = posicionInicial + 1;
			for(int i = posicionInicial + 1;i<numeros.length;i++){
				if(numeros[i]<numeros[posMin]){
					posMin = i;
				}
			}
			//intercambiar posMin con posicionInicial si posMin!=posicionInicial
			if(posicionInicial!=posMin){
				int aux = numeros[posicionInicial];
				numeros[posicionInicial]=numeros[posMin];
				numeros[posMin]=aux;
			}
		}
	}

}
