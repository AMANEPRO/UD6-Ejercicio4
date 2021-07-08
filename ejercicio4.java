package UD6;

import javax.swing.JOptionPane;

public class ejercicio4 {

    public static void main(String[] args) {
        String numerobeta=JOptionPane.showInputDialog("Por favor, introduce un numero");
        int numero= Integer.parseInt(numerobeta);
    	System.out.println(resultadobeta(numero));
    }

    public static int resultadobeta(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}


