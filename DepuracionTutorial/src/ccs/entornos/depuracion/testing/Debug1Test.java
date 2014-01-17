package ccs.entornos.depuracion.testing;
public class Debug1Test {
    
    public static void main(String[] args) {
        System.out.println("Starting...");
        
        for (int i=0; i<1000000; i++) {
            innerLoop(i);
        }

        System.out.println("Finished.");
    }

    public static void innerLoop(int i){
        for (int j = 0; j < 10000; j++) {
            System.out.println("i=" + i + ", j=" + j);
            delay();
        }
    }
    
    //Adapta la velocidad a la de tu ordenador
    public static void delay(){
        for (int k = 0; k < 1000; k++)
            ; //estamento vacio
    }
}
