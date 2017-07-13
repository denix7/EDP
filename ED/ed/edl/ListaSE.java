package ed.edl;


/**
 * Write a description of class ListaSE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaSE<T>
{
    private NodoSE<T> ini;
    private int size;
    
    public ListaSE(){
        ini = new NodoSE<T>();
        size = 0;
    }
    
    public boolean vacia(){
        return ini.vacio();
    }
    
    public void add(T dato){
        if(vacia()){
            ini = new NodoSE<T>(dato);
            size++;
        }else{
            NodoSE<T> act = ini;
            while(!act.getSuc().vacio()){
                act = act.getSuc();
            }
            size++;
            act.setSuc(new NodoSE<T>(dato));
        }
    }
       
    public T get(int pos){
        T res = null;
        if(pos < size){
            NodoSE<T> act = ini;
            while(pos != 0){
                act = act.getSuc();
                pos--;
            }
            res = act.getDato();
        }
        return res;
    }
    
    public void set(T dato, int pos){
        if(pos < size){
            NodoSE<T> act = ini;
            while(pos != 0){
                act = act.getSuc();
                pos--;
            }
            act.setDato(dato);
        }
    }
        
    public T remove(int pos){
        T res = null;
        if(pos < size){
            if(pos == 0){
                res = ini.getDato();
                if(ini.getSuc().vacio()){
                    ini = new NodoSE<T>();
                }else ini = ini.getSuc();
            }else{
               NodoSE<T> act = ini;
               while(pos != 1){
                  act = act.getSuc();
                  pos--;
               }
               if(!act.getSuc().vacio()){
                  res = act.getSuc().getDato();
                  act.setSuc(act.getSuc().getSuc());
               }
            }
            size--;
        }
        return res;
    }
    
    public int longitud(){
        int l = 0;
        if(!vacia()){
            NodoSE<T> act = ini;
            while(!act.vacio()){
                l++;
                act = act.getSuc();
            }
        }
        return l;
    }
    
    public String toString(){
        String s = "";
        NodoSE<T> act = ini;
        while(!act.vacio()){
           if(s.isEmpty()) s += act.getDato();
           else s += "#" + act.getDato();
           act = act.getSuc();
        }
        s = "["+s.replaceAll("#", ", ")+"]";
        return s;
    }
    
    public ListaSE<T> clone(){
        ListaSE<T> lista = new ListaSE<T>();
        NodoSE<T> act = ini;
        while(!act.vacio()){
           lista.add(act.getDato());
           act = act.getSuc();
        }
        lista.size = this.size;
        return lista;
    }
    /*Metodo Recursivo
    public int longitud(){
        int l = 0;
        if(!vacia()){
            l = longitud(ini);
        }
        return l;
    }
    
    private int longitud(NodoSE<T> act){
        int l;
        if(act.vacio()){ l = 0;}
        else{
            l = 1 + longitud(act.getSuc());
        }
        return l;
    }*/
    
    public int size(){
        return size;
    }
}
