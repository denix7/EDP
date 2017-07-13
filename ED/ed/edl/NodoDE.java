package ed.edl;


public class NodoDE<T>
{
    private T dato;
    private NodoDE<T> sig, ant;
    public NodoDE(){
        sig = ant = null;
        dato = null;
    }
    public NodoDE(T dato){
        this.dato = dato;
        sig = ant = null;        
    }
    public boolean vacio(){
        return dato == null;
    }
    public T getDato(){
        return dato;
    }
    public NodoDE<T> getAnt(){
        return ant;
    }
    public NodoDE<T> getSig(){
        return sig;
    }
    public void setDato(T dato){
        this.dato = dato;
    }
    public void setSig(NodoDE<T> sig){
        this.sig = sig;
    }
    public void setAnt(NodoDE<T> ant){
        this.ant = ant;
    }
}