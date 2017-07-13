package ed.ednl;
import ed.edl.ListaSE;
import ed.edl.Cola;

/**
 * Write a description of class ArbolBin here.
 */
public class ArbolBin<T> 
{
    private T raiz;
    private ArbolBin<T> izq;
    private ArbolBin<T> der;
    public ArbolBin(){
        raiz = null;
        izq = der = null;
    }
    
    public ArbolBin(T dato){
        raiz = dato;
        izq = new ArbolBin<T>();
        der = new ArbolBin<T>();
    }
    
    public boolean vacio(){
        return raiz == null;        
    }
    
    public T getRaiz(){
        return raiz;
    }
    
    public ArbolBin<T> getDer(){
        return der;
    }
    
    public ArbolBin<T> getIzq(){
        return izq;
    }
    
    public boolean insertarPareja(T anterior, T nuevo){
        boolean insertado = false;
        Cola<ArbolBin<T>> cola = new Cola<ArbolBin<T>>();
        cola.encolar(this);
        ArbolBin<T> arbol;
        while(!cola.vacia() && !insertado){
            arbol = cola.decolar();
            if(!arbol.vacio() && arbol.getRaiz().equals(anterior)){
               if(arbol.izq.vacio()){
                   arbol.izq = new ArbolBin<T>(nuevo);
                   insertado = true;
               }else if(arbol.der.vacio()){
                   arbol.der = new ArbolBin<T>(nuevo);
                   insertado = true;
               }
            }
            else{ cola.encolar(arbol.izq); cola.encolar(arbol.der);}
        }     
        
        return insertado;
    }
    
    public ListaSE<ListaSE<T>> ramas(){
        ListaSE<ListaSE<T>> ramas = new ListaSE<ListaSE<T>>();
        buscarRamas(new ListaSE<T>(), ramas, this);
        //System.out.println(ramas);
        return ramas;
    }
    
    private void buscarRamas(ListaSE<T>rama, ListaSE<ListaSE<T>> ramas,
                            ArbolBin<T> arbol){ 
        rama.add(arbol.raiz);
        if(arbol.izq.vacio() && arbol.izq.vacio()){
           ramas.add(rama);           
        }else{            
           
            
           if(!arbol.izq.vacio())buscarRamas(rama.clone(), ramas, arbol.izq);
           if(!arbol.der.vacio())buscarRamas(rama.clone(), ramas, arbol.der);             
        }
    }
}
