package ccs.entornos.depuracion.testing;
import java.util.Random;

public class Matrices {
	
	public static int contarMenores(int mat[], int umbral){
		int cont = 1;
		for(int i = 0; i<mat.length;i++){
			if(mat[i]<umbral){
				cont++;
			}
		}
		return cont;
	}
	public static void main(String[]args){
		int mat[] = new int[100];
		Random rnd = new Random();
		
		for(int i = 0;i<mat.length;i++){
			mat[i]=rnd.nextInt(100);
		}
		int cont = contarMenores(mat, 10);
		System.out.println("Valores por debajo de 10: " + cont);
	}
}
