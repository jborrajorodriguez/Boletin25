package boletin.pkg25;

import javax.swing.JOptionPane;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Funciones {
    static int numeros[]=new int[6];
    static int numerosG[]=new int[6];
    
    /**
     * Metodo estatico que devuelve un string con la combinacion ganadora.
     * @return un String con la combinacion ganadora
     */
    public static String ganador(){
       String ganador="";
        for (int i = 0; i < numerosG.length; i++) {
            numerosG[i]=(int) (Math.random()*50 + 1);
            ganador=ganador+" "+String.valueOf(numerosG[i]);
           
        }return "Número gandador : "+ganador;
    }
    /**
     * Metodo estatico que añade los numeros seleccionados por el cliente al array.
     * @param pos lugar que ocupa en el array.
     * @param num valor
     */
    public static void numerosCliente(int pos,int num){
        
            if (pos>5) {JOptionPane.showMessageDialog(null,"Ya tienes mas de 6 numeros");
            
        }else
            numeros[pos]=num;
            
        }
    /**
     * Metodo estatico que compara dos arrays.
     * @return Muestra el mensaje de los numeros iguales.
     */
    
    public static String comparar(){
        String iguales=" ";
        for (int i = 0; i<numeros.length; i++) {
            for (int j = 0;j<numerosG.length; j++) {
                if (numeros[i]==numerosG[j]) {
                    int num=numeros[i];
                    iguales=iguales+" "+String.valueOf(num);
                    
                }
                    
                    
                }
            }return "Los números que coinciden con el premio son :"+iguales;
            
        }
    }
        
    


