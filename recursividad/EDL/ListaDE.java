package EDL;


public class ListaDE<T> {
    private NodoDE<T> inicioDato;
    public ListaDE(){
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
       }else{
           while(actual.getSiguiente()!=null){   
               actual=actual.getSiguiente();
           }
           actual.setSiguiente(nuevoDato);
           nuevoDato.setAnterior(actual);
       }
    }
    public void insertarInicio(T x){
       NodoDE<T> nuevoDato=new NodoDE<T>(x);
       NodoDE<T> actual=inicioDato;
       if(vacia()){
           inicioDato=nuevoDato;
       }else{
           inicioDato=nuevoDato;
           nuevoDato.setSiguiente(actual);
           nuevoDato.setAnterior(null);
       }
    }
    public void mostrarLista(){
       if(!vacia()){
           NodoDE<T> actual=inicioDato;
           while(actual!=null){
               T res=actual.getDato();
               System.out.println(res);
               actual=actual.getSiguiente();
           } 
      }else{
        System.out.println("La lista esta vacia");
      }
    }
    public int longitudLista(){
        int longitud=1;
        if(vacia()){
            return 0;
        }else{
                NodoDE<T> actual=inicioDato;
                while(actual.getSiguiente()!=null){
                    longitud++;
                    actual=actual.getSiguiente();
                }
                return longitud;
        }
    }
    public void buscarDato(T x){
     NodoDE<T> actual=inicioDato;
     if(vacia()){
         System.out.println("No se encuentran datos en la Lista");
     }else {
         int pos=0;
         while(actual.getSiguiente()!=null){
             if(actual.getDato()==x){
              System.out.println("El dato "+x+" se encuentra en la posicion "+pos);
              actual=actual.getSiguiente();
              pos++;
             }else{
              actual=actual.getSiguiente();
              pos++;
             }
         }
         if(pos==0){
           System.out.println("El dato "+x+" no se encuentra en la Lista");    
         }
     } 
    }
    public void eliminarDato(T x){
         NodoDE<T> actual=inicioDato;
         NodoDE<T> antes=null;
         NodoDE<T> auxiliar=null;
         int pos=0;
         if(vacia()){
         System.out.println("No se encuentran datos en la Lista");
        }else{
                actual=inicioDato;
                while(actual.getSiguiente()!=null){
                    if(actual.getDato()==x){
                        if(pos==0){
                         antes=inicioDato;
                         antes=antes.getSiguiente();
                         inicioDato=antes;
                         antes.setAnterior(null);
                         pos=pos+2;
                        }else{
                         actual=actual.getSiguiente();
                         antes.setSiguiente(actual);
                         actual.setAnterior(antes);
                         pos++;
                        }
                        break;
                    }else{
                        if(pos==0){
                        actual=actual.getSiguiente();
                        antes=inicioDato;
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
    public void reemplazar(int pos,T x){//sustituir un dato
     NodoDE<T> actual=inicioDato;
     if(pos>=longitudLista()){
           System.out.println("La posicion no existe");
     }else{
           while(pos!=0){
                 actual=actual.getSiguiente(); 
                 pos--;
           }
           actual.setDato(x);
     }
    }
     public void eliminarDatoPos(int posicion){
        NodoDE<T> actual=inicioDato;
        NodoDE<T> antes=inicioDato;
        if(posicion>=longitudLista()){
         System.out.println("No exite la posicion: "+posicion+" en la lista"); 
        }else{
            actual=inicioDato;
            if(posicion==0){
                 antes=inicioDato;
                 antes=antes.getSiguiente();
                 inicioDato=antes;
                 antes.setAnterior(null);
            }else{
                posicion=posicion-1;
              while(posicion!=0){
                 actual=actual.getSiguiente(); 
                 antes=antes.getSiguiente(); 
                 posicion--;
              }
              actual=actual.getSiguiente();//estamos en el dato
              antes.setSiguiente(actual.getSiguiente());//establecemos el siguiente
              actual=actual.getSiguiente();
              actual.setAnterior(antes);
            }
        }
    }
    public void insertaEnLaPos(int posicion,T x){
        NodoDE<T> nuevo=new NodoDE(x);
        NodoDE<T> actual=inicioDato;
        NodoDE<T> antes=inicioDato;
        if(vacia()){
           inicioDato=nuevo;
        }else{
           posicion=posicion-1;
            while(posicion!=0){
                 actual=actual.getSiguiente();
                 antes=antes.getSiguiente(); 
                 posicion--;
           }
           NodoDE<T> auxiliar=actual.getSiguiente();
           NodoDE<T> auxiliar1=actual.getAnterior();
           actual.setSiguiente(nuevo);//estamos en el dato
           nuevo.setSiguiente(auxiliar);
           nuevo.setAnterior(auxiliar1);
           //antes.setAnterior(nuevo);
             
        }
    }
}

