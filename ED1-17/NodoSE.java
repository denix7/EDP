
/**
 * Write a description of class NodoSE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NodoSE<T>
{
    private T dato;
    private NodoSE<T> siguiente;
    private int prioridad;
    public NodoSE(T x){
        dato=x;
        siguiente=null;
        prioridad=0;
    }
    public NodoSE(T x, int pri){
        dato=x;
        siguiente=null;
        prioridad=pri;
    }
    public T getDato(){
        return dato;
    }
    public NodoSE<T> getSiguiente(){
        return siguiente;
    }
    public int getPrioridad(){
        return prioridad;
    }
    public void setDato(T x){
        dato=x;
    }
    public void setSiguiente(NodoSE<T> y){
        siguiente=y;
    }
    public void setPrioridad(int Pri){
        Pri=prioridad;
    }
}
