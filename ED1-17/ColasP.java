public class ColasP<T>{
    private NodoSE<T> inicio;
    private NodoSE<T> actual;
    public ColasP(){
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
        }
        else{
            NodoSE<T> actual=inicio;
            while(actual.getSiguiente()!=null){
                longitud++;
                actual=actual.getSiguiente();
            }
            return longitud;
        }
    }
    public T removeLast(){
        NodoSE<T> actual=inicio;
        NodoSE<T> antes=inicio;
        if(empty()){
            return null;
        }else{
            int largo=size()-1;
            if(size()==1){
                T res=actual.getDato();
                inicio = null;
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
                System.out.println(res+" prioridad: "+actual.getPrioridad());
                actual=actual.getSiguiente();
            }
        }else{
            System.out.println("La pila esta vacia");
        }
    }
    public void insertarInicioConPrioridad(T x, int prioridad){
        NodoSE<T> nuevo=new NodoSE(x,prioridad);
        if(empty()){
            inicio=nuevo;
        }else{
            NodoSE<T> actual=inicio;
            int prioridadAc=0;
            while(actual.getSiguiente()!=null){
                prioridadAc=actual.getPrioridad();
                if(prioridadAc==prioridad){
                    break;
                }
                if(prioridadAc>prioridad){
                    break;
                }
                actual=actual.getSiguiente();
            }
            if(prioridadAc==prioridad){
                NodoSE<T> auxiliar=actual.getSiguiente();
                actual.setSiguiente(nuevo);
                nuevo.setSiguiente(auxiliar);
            }
            if(actual.getPrioridad()>prioridad){
                NodoSE<T> auxiliar=actual.getSiguiente();
                actual.setSiguiente(nuevo);
                nuevo.setSiguiente(auxiliar);
            }
        }
    }
    public void cambiarPrioridadPrioridad(int prioridadActual,int nuevaPrioridad, T dato){
        boolean bandera=false;
        NodoSE<T> actual=inicio;
        int prioridadAc=0;
        int nada=0;
        while(bandera==false){
            prioridadAc=actual.getPrioridad();
            if(prioridadAc==prioridadActual && actual.getDato()==dato){
                bandera = true;
                break;
            }
            if(actual.getSiguiente()==null){
                bandera=true;
                nada=1;
            }
            actual=actual.getSiguiente();
        }
        if(nada==1){
            System.out.println("Dato no encontrado en la prioridad: "+ prioridadActual);
            System.out.println("No se pudo cambiar de prioridad");
        }else{
         actual.setPrioridad(nuevaPrioridad);
        }
    }
}