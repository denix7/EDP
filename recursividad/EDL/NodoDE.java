package EDL;


public class NodoDE<T> {
    private T dato;
    private NodoDE<T> siguiente;
    private NodoDE<T> anterior;
    
    public NodoDE(T x){
        dato=x;
        siguiente=null;
        anterior=null;
    }
    public T getDato(){
        return dato;
    }
    public NodoDE<T> getSiguiente(){
        return siguiente;//Obtiene el siguiente Dato
    }
     public NodoDE<T> getAnterior(){
        return anterior;//Obtiene el anterior Dato
    }
    public void setDato(T x){
        dato=x;
    }
    public void setSiguiente(NodoDE<T> y){
        siguiente=y;//Establece el siguiente DATO
    }
    public void setAnterior(NodoDE<T> x){
        anterior=x;//Establece el anterior DATO
    }
}
