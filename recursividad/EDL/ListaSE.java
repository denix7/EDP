package EDL;


public class ListaSE<T>  {    
    private NodoSE<T> inicio;
    private NodoSE<T> actual;
    public ListaSE(){
        inicio=null;
    }
    public boolean vacia(){
        return inicio==null;
    }
    public void insertarInicio(T x){
     NodoSE<T> nuevo=new NodoSE(x);
     if(vacia()){
           inicio=nuevo;
     }else{
         nuevo.setSiguiente(inicio);
         inicio=nuevo;
     }
    }
    public void insertarFinal(T x){
       NodoSE<T> nuevo=new NodoSE(x);
       if(vacia()){
           inicio=nuevo;
       }else{
           NodoSE<T> actual=inicio;
           while(actual.getSiguiente()!=null){
               actual=actual.getSiguiente();
           }
           actual.setSiguiente(nuevo);
       }
    }
    public void mostrarLista(){
       if(!vacia()){
           NodoSE<T> actual=inicio;
           while(actual!=null){
               T res=actual.getDato();
               System.out.println(res);
               actual=actual.getSiguiente();
           } 
      }else{
        System.out.println("La lista esta vacia");
      }
    }
    public void buscarDato(T x){
     NodoSE<T> actual=inicio;
     if(vacia()){
         System.out.println("No se encuentran datos en la Lista");
     }else {
         int pos=0;
         boolean bandera=false;
         while(actual.getSiguiente()!=null){
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
    public int longitudLista(){
        int longitud=1;
        if(vacia()){
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
    public void eliminarDato(T x){
         NodoSE<T> actual=inicio;
         NodoSE<T> antes=null;
         int pos=0;
         if(vacia()){
         System.out.println("No se encuentran datos en la Lista");
        }else{
                actual=inicio;
                while(actual.getSiguiente()!=null){
                    if(actual.getDato()==x){
                        //pos++;
                        if(pos==0){
                         antes=inicio;
                         antes=antes.getSiguiente();
                         inicio=antes;
                         pos=pos+2;
                        }else{
                         actual=actual.getSiguiente();
                         antes.setSiguiente(actual);   
                         pos++;
                        }
                        break;
                    }else{
                        if(pos==0){
                        actual=actual.getSiguiente();
                        antes=inicio;
                        pos++;
                        }else{
                          actual=actual.getSiguiente();
                          antes=antes.getSiguiente();  
                        }
                    }
                }
        }
        if(pos==1){
           System.out.println("El dato "+x+" no se encuentra en la Lista");    
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
    public void reemplazar(int pos, T x){//sustituir un dato
     NodoSE<T> actual=inicio;
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
    public void insertaEnLaPos(int posicion,T x){
        NodoSE<T> nuevo=new NodoSE(x);
        NodoSE<T> actual=inicio;
        if(vacia()){
           inicio=nuevo;
        }else{
           posicion=posicion-1;
            while(posicion!=0){
                 actual=actual.getSiguiente(); 
                 posicion--;
           }
           NodoSE<T> auxiliar=actual.getSiguiente();
           actual.setSiguiente(nuevo);//estamos en el dato
           nuevo.setSiguiente(auxiliar);
        }
    }
}


