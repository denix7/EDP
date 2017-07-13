package EDL;

public class ABB
{
    private NodoArbol1 raiz;
    public ABB()
    {
        this.raiz=null;
    }
    public void insertarNodo(int valorInsertar){
        if(this.raiz==null){
            raiz=new NodoArbol1(valorInsertar);
        }else{
            raiz.insertar(valorInsertar);
        }
    }
    public void recorridoPreorden(){
        ayudantePreorden(raiz);
    }
    private void ayudantePreorden(NodoArbol1 nodo){
        if(nodo == null)
        return;
        System.out.printf("%d ",nodo.datos);
        ayudantePreorden(nodo.nodoIzq);
        ayudantePreorden(nodo.nodoDer);
    }
    public void recorridoInorden(){
        ayudanteInorden(raiz);
    }
    private void ayudanteInorden(NodoArbol1 nodo){
        if(nodo == null)
        return;
        
         ayudanteInorden(nodo.nodoIzq);
         System.out.printf("%d ",nodo.datos);
         ayudanteInorden(nodo.nodoDer);
    }   
    public void recorridoPostorden(){
        ayudantePostorden(raiz);
    }
    private void ayudantePostorden(NodoArbol1 nodo){
        if(nodo == null)
        return;
        
        ayudantePostorden(nodo.nodoIzq);
        ayudantePostorden(nodo.nodoDer);
        System.out.printf("%d ",nodo.datos);
    }    
}
