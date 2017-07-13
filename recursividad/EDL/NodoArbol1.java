package EDL;

public class NodoArbol1<T>
{
    NodoArbol1<T> nodoIzq;
    NodoArbol1<T> nodoDer;
    T datos;
    public NodoArbol1()
    {
       this.datos=null;
       this.nodoIzq=this.nodoDer=null;
    }
    public NodoArbol1(T datosNodo)
    {
       datos=datosNodo;
       nodoIzq=nodoDer=null;
    }
    public void insertar(T valorInsertar){
        if(valorInsertar.equals(datos)){
            if(nodoIzq==null){
                nodoIzq=new NodoArbol1(valorInsertar);
            }else{
                nodoIzq.insertar(valorInsertar);
            }
        } else{
            if(nodoDer==null){
                nodoDer=new NodoArbol1(valorInsertar);
            }else{
                nodoDer.insertar(valorInsertar);
            }
        }
    }
    public boolean vacio(){
        return datos==null;
    }

} 

