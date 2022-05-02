/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashnode;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Shelly Pam
 */
public class HashNode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Hashtable<Integer, String> h = new Hashtable<>();    
            String cod = JOptionPane.showInputDialog("Ingrese linea de codigo");
             
      	
	StringTokenizer tokens=new StringTokenizer(cod);
	while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }
   /* StringTokenizer st = new StringTokenizer(" int suma = 0;","=;",true);*/
   

   // }
      
    
    h.put(00,"int");
    h.put(04, "suma");
    h.put(07, "=");
    h.put(011, "0");
    h.put(012, ";");
    h.put(10, "suma");
    h.put(15, "=");
    h.put(17, "54");
    h.put(110, "+");
    h.put(112, "20");
    h.put(114, ";");
    
    System.out.println(h);
    
    
    Enumeration enumeration = h.elements();
while (enumeration.hasMoreElements()) {
  System.out.println(""+"hashtable valores: " + enumeration.nextElement());
}
    
    Enumeration llaves = h.keys();
while (llaves.hasMoreElements()) {
  System.out.println(""+"hashtable llaves: " + llaves.nextElement());
}
System.out.println("Claves: " +h.keys());

    }
    
}
