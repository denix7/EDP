package EDL;

public class Colas<T>
{
    private NodoSE<T> inicio;
    private NodoSE<T> actual;
    public Colas()
    {
        inicio=null;
    }
    public boolean empty(){
        return inicio==null;
    }
    public void insertarInicio(T x){
     NodoSE<T> nuevo=new NodoSE(x);
     if(empty()){
           inicio=nuevo;
     }else{
         nuevo.setSiguiente(inicio);
         inicio=nuevo;
     }
    }
    public int size(){
        int longitud=1;
        if(empty()){
            return 0;
        }else{
                NodoSE<T> actual=inicio;
                while(actual.getSiguiente()!=null){
                    longitud++;
                    actual=actual.getSiguiente();
                }
                return longitud;
        }
    }
     public T removeLast(){//elimina el dato de la cima de la pilay lo muestra
       NodoSE<T> actual=inicio;
       NodoSE<T> antes=inicio;
       if(empty()){
          // inicio=nuevo;
          return null;
       }else{
           int largo=size()-1;
           if(size()==1){
            T res=actual.getDato();
            inicio=null;
            return res;
           }else{
           while(largo!=1){
               actual=actual.getSiguiente();
               antes=antes.getSiguiente();
               largo--;
           }
           actual=actual.getSiguiente();
           T res=actual.getDato();
           antes.setSiguiente(null);
           return res;
        }
       }
    }
    public T peekLast(){//muestra la cima
       NodoSE<T> actual=inicio;
       NodoSE<T> antes=inicio;
       if(empty()){
          return null;
       }else{
           while(actual.getSiguiente()!=null){
               actual=actual.getSiguiente();
           }
           T res=actual.getDato();
           return res;
       }
    }
    public void mostrarCola(){
       if(!empty()){
           NodoSE<T> actual=inicio;
           while(actual!=null){
               T res=actual.getDato();
               System.out.println(res+"prioridad: "+actual.getPrioridad());
               actual=actual.getSiguiente();
           } 
      }else{
        System.out.println("La Pila esta vacia");
      }
    }
    public void insertarInicioConPrioridad(T x,int prioridad){
     NodoSE<T> nuevo=new NodoSE(x,prioridad);
     if(empty()){
           inicio=nuevo;
     }else{
           NodoSE<T> actual=inicio;
           NodoSE<T> antes=inicio;
           int prioridadAc=0;
           while(actual.getSiguiente()!=null ){
            prioridadAc=actual.getPrioridad();
            if(prioridadAc==prioridad){
                break;
            }
            if(prioridadAc>prioridad){
                break;
            }
            actual=actual.getSiguiente();
           }
           if( prioridadAc==prioridad){
                NodoSE<T> auxiliar=actual.getSiguiente();
               actual.setSiguiente(nuevo);
               nuevo.setSiguiente(auxiliar);
            }
            if( actual.getPrioridad()>prioridad){
                NodoSE<T> auxiliar=actual.getSiguiente();
               actual.setSiguiente(nuevo);
               nuevo.setSiguiente(auxiliar);
           }else{
            actual.setSiguiente(nuevo);
           }
     }
    }
    
}
