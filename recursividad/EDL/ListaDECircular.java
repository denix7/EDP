package EDL;

public class ListaDECircular<T>
{
    private NodoDE<T> inicioDato;
    private NodoDE<T> actual;
    public ListaDECircular()
    {
        inicioDato=null;
    }
    private boolean vacia(){
        return inicioDato==null;
    }
    public void insertarFinal(T x){
       NodoDE<T> nuevoDato=new NodoDE<T>(x);
       NodoDE<T> actual=inicioDato;
       if(vacia()){
           inicioDato=nuevoDato;
           nuevoDato.setSiguiente(inicioDato);
           nuevoDato.setAnterior(inicioDato);
       }else{
           NodoDE<T> ini=inicioDato;
           while(actual.getSiguiente()!=inicioDato){   
               actual=actual.getSiguiente();
           }
           actual.setSiguiente(nuevoDato);
           nuevoDato.setAnterior(actual);
           ini.setAnterior(nuevoDato);
           nuevoDato.setSiguiente(ini);
       }
    }
    public void mostrarLista(){
       if(!vacia()){
           NodoDE<T> actual=inicioDato;
           while(actual.getSiguiente()!=inicioDato){
               T res=actual.getDato();
               System.out.println(res);
               actual=actual.getSiguiente();
           } 
           T res=actual.getDato();
           System.out.println(res);
      }else{
        System.out.println("La lista esta vacia");
      }
    }
}
