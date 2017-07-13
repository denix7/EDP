import ed.edl.ColaPrioridad;

public class CadenaReducidaOrdenada
{
    public String getCadenaReducida(String cad){
        String red = "";
        char c; int cnt;
        Par p = null;
        ColaPrioridad<Par> cola = new ColaPrioridad<Par>();
        for(int i = 0; i <= cad.length()-1; i++){
            c = cad.charAt(i);
            if(p == null){
                p = new Par(c);
            }else if(p.getC() == c) p.incr();
            else{
                cola.encolar(p);
                p = new Par(c);
            }
        }
        cola.encolar(p);
        red = decolar(cola);
        return red;
    }
    
    private String decolar(ColaPrioridad<Par> cola){
        String res = "";
        while(!cola.vacia()){
            res = res  + cola.decolar();
        }
        return res;
    }
}
