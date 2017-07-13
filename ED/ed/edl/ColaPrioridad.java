package ed.edl;

public class ColaPrioridad<T extends Comparable<T>>
{
    private NodoDE<T> frente,fin;
    public ColaPrioridad(){
        frente = fin = null;
    }
    public void encolar(T dato){
        if(vacia()){
            frente = fin = new NodoDE<T>(dato);
        }
        else{
            NodoDE<T> nuevo = new NodoDE<T>(dato), act;
            if(frente.getDato().compareTo(dato) > 0){
                nuevo.setSig(frente);
                frente.setAnt(nuevo);
                frente = nuevo;
            }
            else{
                boolean insertado = false;
                act = frente.getSig();
                while(act != null && !insertado){
                   
                    if(act.getDato().compareTo(dato) > 0){
                        insertado = true;
                        nuevo.setAnt(act.getAnt());
                        act.getAnt().setSig(nuevo);
                        nuevo.setSig(act);
                        act.setAnt(nuevo);
                    }
                    else act = act.getSig();
                }
                
                if(!insertado){
                    nuevo.setAnt(fin);
                    fin.setSig(nuevo);
                    fin = nuevo;
                }
                
            }
        }
    }
    
    public T decolar(){
         T res = null;
         if(!vacia()){
             res = frente.getDato();
             if(frente == fin) frente = fin = null;
             else{
                 frente = frente.getSig();
             }
         }
         return res;
    }
    
    
    public boolean vacia(){
        return frente == null;
    }
}
