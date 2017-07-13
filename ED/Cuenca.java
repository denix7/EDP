import ed.ednl.ArbolBin;
import ed.edl.ListaSE;
public class Cuenca
{
    private ArbolBin<Pueblo> mapa;
    private String nombreCuenca;
    public Cuenca(String nombreCuenca){
          this.nombreCuenca = nombreCuenca;
          mapa = null;
    }
    public String nombreCuenca(){
        return nombreCuenca;
    }
    public void agregarPueblo(Pueblo p){
        mapa = new ArbolBin<Pueblo>(p);
    }
    public void agregarPueblo(Pueblo anterior, Pueblo nuevo){
        mapa.insertarPareja(anterior, nuevo);
    }
    ListaSE<Pueblo> res;
    public ListaSE<Pueblo> getPueblosAVisitar(int X){
        res = new ListaSE<Pueblo>();
        ListaSE<Pueblo> resPar = new ListaSE<Pueblo>();
        res = buscarLMPV(resPar, this.mapa, X);
        return res;
    }
    //LMPV ListaMaxima de pueblos que se puede visitar con un tiempo X
    private ListaSE<Pueblo> buscarLMPV(ListaSE<Pueblo>resPar,  ArbolBin<Pueblo> mapa, int X){
        ListaSE<Pueblo> res = new ListaSE<Pueblo>(), rp;
        if(!mapa.vacio()){
            if(mapa.getRaiz().tiempo() <= X){
                resPar.add(mapa.getRaiz());
                rp = buscarLMPV(resPar.clone(), mapa.getIzq(), X - mapa.getRaiz().tiempo());
                if(rp.size() > res.size()) res = rp;
                rp = buscarLMPV(resPar.clone(), mapa.getDer(), X - mapa.getRaiz().tiempo());
                if(rp.size() > res.size()) res = rp;
            }else{
                if(resPar.size() > res.size()) res = resPar;
            }
        }else res = resPar;
        return res;
    }
}
