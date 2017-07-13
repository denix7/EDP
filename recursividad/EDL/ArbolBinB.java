package EDL;

public class ArbolBinB<T extends Comparable<T>>
{
    T datosRaiz;
    ArbolBinB<T> nodoIzq;
    ArbolBinB<T> nodoDer;
    public ArbolBinB()
    {
        datosRaiz=null;
        nodoIzq=nodoDer=null;
    }
    public ArbolBinB(T datos)
    {
        datosRaiz=datos;
        nodoIzq=nodoDer=null;
    }
    public void insertar(T dato){
     if(vacio()){
        datosRaiz=dato;
        nodoIzq=new ArbolBinB<T>();
        nodoDer=new ArbolBinB<T>();
     }else{
         if(dato.compareTo(datosRaiz)>0){
            nodoIzq.insertar(dato);
         }else{
            nodoDer.insertar(dato);
         }
     }
    }
    public boolean vacio(){
        return datosRaiz == null;
    }
    public void recorridoPreorden(){
        //ayudantePreorden(datosRaiz);
    }
     private void ayudantePreorden(NodoArbol nodo){
        if(nodo == null)
        return;
        //System.out.printf("%d ",nodo.datosRaiz);
        ayudantePreorden(nodo.nodoIzq);
        ayudantePreorden(nodo.nodoDer);
    }
}
