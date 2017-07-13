package ed.edl;

public class Cola<T>
{
    private NodoSE<T> ini, fin;
    public Cola(){
        ini = fin = null;
    }
    
    public boolean encolar(T dato){
        boolean insertado = true;
        if(vacia()) ini = fin = new NodoSE<T>(dato);
        else{
            NodoSE<T> nuevo = new NodoSE<T>(dato);
            fin.setSuc(nuevo);
            fin = nuevo;
        }
        return insertado;
    }
    
    public T decolar(){
        T res = null;
        if(!vacia()){
            res = ini.getDato();
            if(ini == fin) ini = fin = null;
            else ini = ini.getSuc();
        }
        return res;
    }
    
    public boolean vacia(){
        return ini == null;
    }
}
