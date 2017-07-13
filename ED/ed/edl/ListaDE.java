package ed.edl;


public class ListaDE<T>
{
    private NodoDE<T> ini;//nodo de navegacion
    private int size;
    public ListaDE(){
        ini = null;
        size = 0;
    }
    
    public void insertar(T dato){
        if(vacia()) ini = new NodoDE<T>(dato);
        else{
            NodoDE<T> nuevo = new NodoDE<T>(dato);
            insertar(ini, nuevo);
        }
        size++;
    }
    
    private void insertar(NodoDE<T> act, NodoDE<T> nuevo){
        if(act.getSig() == null){
            act.setSig(nuevo);
            nuevo.setAnt(act);
        }else insertar(act.getSig(), nuevo);
    }    
    
    public void eliminar(int pos){
        if(pos < size && pos > -1){
            size--;            
            if(pos == 0){
                ini = ini.getSig();
                if(ini != null) ini.setAnt(null);
            }
            else{
                NodoDE<T> act = ini , sigAct, antAct;
                while(pos != 0){
                    act = act.getSig();
                    pos--;
                }
                sigAct = act.getSig();
                antAct = act.getAnt();
                antAct.setSig(sigAct);
                if(sigAct!=null) sigAct.setAnt(antAct);
            }
        }
    }
    
    public String toString(){
        String s = "";
        NodoDE<T> act = ini;
        while(act != null){
            s = s + act.getDato().toString() + " ";
            act = act.getSig();
        }
        s = "["+s.trim().replaceAll(" ", ", ")+"]";
        return s;
    }
    
    public boolean vacia(){
        return ini == null;
    }
}
