package paqueteuno;

import paqueteuno.subpaquete.ClaseB;
//import paquetados.ClaseUno;

public class Importa2 {

	public static void main(String[] args) {
        ClaseUno cUno = new ClaseUno();
        System.out.println(cUno.toString());
        
        paqueteuno.subpaquete.ClaseA cA = new paqueteuno.subpaquete.ClaseA();
        System.out.println(cA.toString());

        ClaseB cB = new ClaseB();
        System.out.println(cB.toString());
        
        ClaseUno cUnoNuevo = new ClaseUno();
        System.out.println(cUnoNuevo.toString());

        
	}

}
