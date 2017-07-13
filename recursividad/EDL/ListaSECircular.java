package EDL;

public class ListaSECircular<T>
{
    private NodoSE<T> inicio;
    private NodoSE<T> actual;
    public ListaSECircular()
    {
        inicio=null;
    }
    public void insertarFinal(T x){
       NodoSE<T> nuevo=new NodoSE(x);
       if(vacia()){
           inicio=nuevo;
           nuevo.setSiguiente(inicio);
       }else{
           NodoSE<T> actual=inicio;
           NodoSE<T> ini=inicio;
           while(actual.getSiguiente()!=inicio){
               actual=actual.getSiguiente();
           }
           actual.setSiguiente(nuevo);
           nuevo.setSiguiente(ini);
       }
    }
    public boolean vacia(){
        return inicio==null;
    }
    public void mostrarLista(){
       if(!vacia()){
        NodoSE<T> actual=inicio;
        while(actual.getSiguiente()!=inicio){
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
    public int longitudLista(){
        int longitud=1;
        if(vacia()){
            return 0;
        }else{
                NodoSE<T> actual=inicio;
                while(actual.getSiguiente()!=inicio){
                    longitud++;
                    actual=actual.getSiguiente();
                }
                return longitud;
        }
    }
    public void reemplazar(int pos,T x){//sustituir un dato
     NodoSE<T> actual=inicio;
     //NodoSE<T> ini=inicio;
     if(pos>=longitudLista()){
           System.out.println("La posicion no existe");
     }else{
           NodoSE<T> auxiliar=inicio.getSiguiente();
           while(pos!=0){
                 actual=actual.getSiguiente(); 
                 pos--;
           }
           actual.setDato(x);
     }
    }
    public void eliminarDatoPos(int posicion){
        NodoSE<T> actual=inicio;
        NodoSE<T> antes=inicio;
        if(posicion>=longitudLista()){
         System.out.println("No exite la posicion: "+posicion+" en la lista"); 
        }else{
            actual=inicio;
            if(posicion==0){
                 antes=inicio;
                 antes=antes.getSiguiente();
                 inicio=antes;
            }else{
                posicion=posicion-1;
              while(posicion!=0){
                 actual=actual.getSiguiente(); 
                 antes=antes.getSiguiente(); 
                 posicion--;
              }
              actual=actual.getSiguiente(); 
               NodoSE<T> auxiliar=actual.getSiguiente();
               antes.setSiguiente(auxiliar);
            }
        }
    }
}
