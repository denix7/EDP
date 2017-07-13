package EDL;
public class Pilas<T>
{
    private NodoSE<T> inicio;
    private NodoSE<T> actual;
    public Pilas()
    {
         inicio=null;
    }
    public void push(T x){//insertar al final
       NodoSE<T> nuevo=new NodoSE(x);
       if(empty()){
           inicio=nuevo;
       }else{
           NodoSE<T> actual=inicio;
           while(actual.getSiguiente()!=null){
               actual=actual.getSiguiente();
           }
           actual.setSiguiente(nuevo);
       }
    }
    public boolean empty(){
        return inicio==null;
    }
     public T pop(){//elimina el dato de la cima de la pilay lo muestra
       NodoSE<T> actual=inicio;
       NodoSE<T> antes=inicio;
       if(empty()){
          // inicio=nuevo;
          return null;
       }else{
           int largo=longitudLista()-1;
           if(longitudLista()==1){
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
    public int longitudLista(){
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
    public void mostrarPila(){
       if(!empty()){
           NodoSE<T> actual=inicio;
           while(actual!=null){
               T res=actual.getDato();
               System.out.println(res);
               actual=actual.getSiguiente();
           } 
      }else{
        System.out.println("La Pila esta vacia");
      }
    }
    public T peek(){//muestra la cima
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
    public void search(T x){
     NodoSE<T> actual=inicio;
     if(empty()){
         System.out.println("No se encuentran datos en la Lista");
     }else {
         int pos=0;
         boolean bandera=false;
         while(actual!=null){
             if(actual.getDato()==x){
              System.out.println("El dato "+x+" se encuentra en la posicion "+pos);
              actual=actual.getSiguiente();
              bandera=true;
              pos++;
             }else{
              actual=actual.getSiguiente();
              pos++;
             }
         }
         if(bandera==false){
           System.out.println("El dato "+x+" no se encuentra en la Lista");    
         }
     } 
    }
}
