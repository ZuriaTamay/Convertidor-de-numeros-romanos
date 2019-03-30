/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor_num_romanos;

import javax.swing.JOptionPane;

/**
 *
 * @author zues-
 */
public class Convertidor_Num_Romanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   String LR; 
      int Z;
      do {
             LR = JOptionPane.showInputDialog("Introduce un número que se encuentre entre 1 y 1000: ");
             Z = Integer.parseInt(LR);
      } while (Z < 1 || Z > 1000);
      JOptionPane.showMessageDialog(null, Z + " en numeros romanos -> " + convertirNumerosRomanos(Z));
  }
    
  public static String convertirNumerosRomanos(int numero) {
      int e, Mil, Centenas, Decenas, Unidades;
      String NumRomano  = "";
      
     //obtenemos en cada una de las cifra del número
      Mil = numero / 1000;
      Centenas = numero / 100 % 10;
      Decenas = numero / 10 % 10;
      Unidades = numero % 10;

     //Apartado para mil
      for (e = 1; e <= Mil; e++) {
             NumRomano = NumRomano  + "M";
      }

     //Apartado para centenas
      if (Centenas == 9) {
          NumRomano  = NumRomano + "CM";
      } else if (Centenas >= 5) {
                     NumRomano  = NumRomano  + "D";
                     for (e = 6; e <= Centenas; e++) {
                            NumRomano  = NumRomano + "C";
                     }
      } else if (Centenas == 4) {
                      NumRomano  = NumRomano + "CD";
      } else {
                  for (e = 1; e <= Centenas; e++) {
                         NumRomano =NumRomano  + "C";
                  }
      }

     //Apartado para decenas
      if (Decenas == 9) {
           NumRomano = NumRomano + "XC";
      } else if (Decenas >= 5) {
                      NumRomano = NumRomano + "L";
                      for (e = 6; e <= Decenas; e++) {
                            NumRomano = NumRomano + "X";
                      }
      } else if (Decenas == 4) {
                      NumRomano = NumRomano + "XL";
      } else {
                    for (e = 1; e <= Decenas; e++) {
                           NumRomano  = NumRomano  + "X";
                    }
      }

     //Apartado para unidades
      if (Unidades == 9) {
           NumRomano  = NumRomano  + "IX";
      } else if (Unidades >= 5) {
                      NumRomano  = NumRomano  + "V";
                      for (e = 6; e <= Unidades; e++) {
                             NumRomano  = NumRomano  + "I";
                      }
      } else if (Unidades == 4) {
                      NumRomano  = NumRomano  + "IV";
      } else {
                  for (e= 1; e <= Unidades; e++) {
                         NumRomano  = NumRomano  + "I";
                  }
      }
      return NumRomano;
    }
    
}
