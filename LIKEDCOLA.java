/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package likedcola;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Pc
 */
public class LIKEDCOLA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
     
     
     //Creamos la Cola Indicando el tipo de dato
        Queue <Integer> cola=new LinkedList();
        //Insertamos datos
            cola.offer(3);
            cola.add(14);
            cola.offer(12);
            cola.add(7);
            cola.offer(10);
        //Impresion de la Cola llena con los datos*/
        System.out.println("Cola llena: " + cola);
        //Estructura repetitiva para desencolar
       //while(cola.poll()!=null){//Desencolamos y el valor se compara con null
           // System.out.println(cola.peek());//Muestra el nuevo Frente
        //}//
        /*Muestra null debido a que la cola ya esta vacia*/
        
       while(true)
    { 
        if(cola.peek()==null)
            break;
                System.out.println(cola.poll());
     
       }
       
       
       // System.out.println(cola.peek());     
       
    }
    
    
    
}
      
