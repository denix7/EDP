package EDL;

public class NodoABB
{
    int datoRaiz;
    NodoABB izquierda;
    NodoABB derecha;
    public NodoABB(int dato)
    {
        datoRaiz=dato;
        izquierda=null;
        derecha=null;
    }
    public int getDato(){
        return datoRaiz;
    }
    public NodoABB getIzq(){
        return izquierda;
    }
    public NodoABB getDer(){
        return derecha;
    }
    public void setIzq(NodoABB izq){
        izquierda=izq;
    }
    public void setDer(NodoABB der){
        derecha=der;
    }
    public boolean esHoja(){
        return (izquierda==null&&derecha==null);
    }
}
