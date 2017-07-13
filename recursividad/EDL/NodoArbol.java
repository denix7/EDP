package EDL;

public class NodoArbol
{
    NodoArbol nodoIzq;
    NodoArbol nodoDer;
    int datos;
    public NodoArbol(int datosNodo)
    {
       datos=datosNodo;
       nodoIzq=nodoDer=null;
    }
    public void insertar(int valorInsertar){
        if(valorInsertar<datos){
            if(nodoIzq==null){
                nodoIzq=new NodoArbol(valorInsertar);
            }else{
                nodoIzq.insertar(valorInsertar);
            }
        } else{
            if(nodoDer==null){
                nodoDer=new NodoArbol(valorInsertar);
            }else{
                nodoDer.insertar(valorInsertar);
            }
        }
    }
    public boolean vacio(){
        return datos== 0;
    }

}
