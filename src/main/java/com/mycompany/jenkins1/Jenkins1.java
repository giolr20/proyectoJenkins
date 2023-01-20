
package com.mycompany.jenkins1;

import javax.swing.JOptionPane;

public class Jenkins1 {

    public static void main(String args[]) {
    String diaa =JOptionPane.showInputDialog("Introduce un dia");
    dia_laboral(diaa);
    boolean dia_l = dia_laboral(diaa);
    if (dia_l == true) {
        System.out.println("El dia es laboral");
    } else {
        System.out.println("El dia es no laboral");
    }
}   
     
   
    public static boolean dia_laboral(String dia) {
       
        switch(dia){
            case "Lunes":
                return true;
            case "Martes":
                return true;
            case "Miercoles":
                return true;
            case "Jueves":
                 return true;
            case "Viernes":
                 return true;
            case "Sábado":
                 return false;
            case "Domingo":
              return false;
            default:
              return false;
        }             
    }
}