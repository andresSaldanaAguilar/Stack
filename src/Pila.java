
import java.util.ArrayList;

/**
 *
 * @author ANDRES
 */
public class Pila {
    
    NodoPila cima;
    int tamanio;
    
    public Pila(){
        cima=null;
        tamanio=0;
    }
    
    //metodo para checar si la pila esta vacia
    public boolean estaVacia(){
        return cima==null;
    }
    
    //metodo push
    public void push(int dato){       
        NodoPila nuevo =new NodoPila(dato);
        nuevo.siguiente=cima;  //este nodo siempre apuntara a la cima, sea el mismo o el proximo a crear
        cima=nuevo;
        tamanio++;
    }
    
    public int pop(){
        int aux=cima.dato;
        cima=cima.siguiente;
        tamanio --;
        return aux;
    }
    
    public int top(){
        return cima.dato;
    }
    
    public int showSize(){
        return tamanio;
    }
    
    public void clear(){
        while(!estaVacia()){
            pop();
        }
    }
    
    public ArrayList show(){
        NodoPila aux=cima;
        ArrayList al=new ArrayList();
        while(aux!=null){
            System.out.println(""+aux.dato);
            al.add(aux.dato);
            aux=aux.siguiente;           
        }       
        return al;
    }
}
