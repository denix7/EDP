package ed.ednl;
import ed.edl.ListaSE;

/**
 */
public class ArbolBB<T extends Comparable<T>>
{
    private T raiz;
    private ArbolBB<T> izq;
    private ArbolBB<T> der;
    public ArbolBB(){
        raiz = null;
        izq = der = null;
    }
    
    public ArbolBB(T dato){
        raiz = dato;
        izq = new ArbolBB<T>();
        der = new ArbolBB<T>();
    }
    
    public boolean insertar(T dato){
        boolean ans = false;
        if(vacio()){
           raiz = dato;           
           izq = new ArbolBB<T>();
           der = new ArbolBB<T>();
           ans = true;
        }else{
            if(raiz.compareTo(dato) > 0)
                ans = izq.insertar(dato);
            else ans = der.insertar(dato);
        }
        return ans;
    }
    
    public boolean esHoja(){
        return izq.vacio() && der.vacio();
    }
    
    public ListaSE<T> podarHojas(){
        ListaSE<T> hojas = new ListaSE<T>();
        if(!vacio()){
            if(this.esHoja()){
                hojas.add(raiz); 
                raiz = null;
            }else{
                podarHojas(hojas, this);
            }
        }
        return hojas;
    }
    
    private void podarHojas(ListaSE<T> hojas, ArbolBB<T> arbol){
        if(!arbol.izq.vacio() && arbol.getIzq().esHoja()){
            hojas.add(arbol.izq.raiz);
            arbol.setIzq(new ArbolBB<T>());
        }else if(!arbol.izq.vacio()) podarHojas(hojas, arbol.izq);
        
        if(!arbol.der.vacio() && arbol.der.esHoja()){
            hojas.add(arbol.der.raiz);
            arbol.setDer(new ArbolBB<T>());
        }else if(!arbol.der.vacio()) podarHojas(hojas, arbol.der);
    }
    
    public boolean vacio(){
        return raiz == null;
    }
    
    public ArbolBB<T> getDer(){ return der;}
    
    public ArbolBB<T> getIzq(){ return izq;}
    
    public void setDer(ArbolBB<T> der){
        this.der = der;
    }
    
    public void setIzq(ArbolBB<T> izq){
        this.izq = izq;
    }
}
