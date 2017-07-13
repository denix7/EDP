package ed.edl;


/**
 */
public class NodoSE<T>
{
    private T dato;
    private NodoSE<T> suc;
    public NodoSE(){
        suc = null;
        dato = null;
    }
    public NodoSE(T dato){
        this.dato = dato;
        suc = new NodoSE<T>();        
    }
    public boolean vacio(){
        return dato == null;
    }
    public T getDato(){
        return dato;
    }
    public NodoSE<T> getSuc(){
        return suc;
    }
    public void setDato(T dato){
        this.dato = dato;
    }
    public void setSuc(NodoSE<T> suc){
        this.suc = suc;
    }
}
