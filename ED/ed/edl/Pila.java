package ed.edl;

public class Pila<T>
{
    private NodoSE<T> tope;
    public Pila(){
        tope = null;
    }
    
    public void push(T dato){
        if(vacio()) tope = new NodoSE<T>(dato);
        else{
            NodoSE<T> nuevo = new NodoSE<T>(dato);
            nuevo.setSuc(tope);
            tope = nuevo;
        }
    }
    
    public T pop(){
        T res = null;
        if(!vacio()){
            res = tope.getDato();
            if(!tope.getSuc().vacio()){
                tope = tope.getSuc();
            }else tope = null;
        }
        return res;
    }
    
    public T tope(){
        T res = null;
        if(tope!=null) res = tope.getDato();
        return res;
    }
    /*private Pila<T> base;
    private T tope;
    private int size;
    public Pila(){
        tope = null;
        base = null;
    }
    
    public Pila(T dato){
        tope = dato;
        base = null;
    }
    
    public T tope(){
        return tope;
    }
    
    public T push(T dato){
        T res = dato;
        if(vacio()) tope = dato;
        else{
            Pila<T> base = new Pila<T>(tope);
            base.base = this.base;
            tope = dato;
            this.base = base;
        }
        return res;
    }
    
    public T pop(){
        T res = null;
        if(!vacio()){
            res = tope;
            if(base != null){
                tope = base.tope;
                base = base.base;
            }else tope = null;
        }
        return res;
    }*/
    
    public boolean vacio(){
        return tope == null;
    }
    
    public String toString(){
        String res = "";
        
        return res;
    }
    
}
