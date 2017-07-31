
package likedcola;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author gricel
 */
public class LIKEDCOLA {

    
    public static void main(String[] args) {
        
        
     
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
        
        
       while(true)
    { 
        if(cola.peek()==null)
            break;
                System.out.println(cola.poll());
     
       }
       
       
       
       
    }
    
    
    
}
      
