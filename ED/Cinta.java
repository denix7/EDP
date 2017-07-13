
public class Cinta
{
    private int duracion, indiceUP;
    private String pistas;
    public Cinta(){
        pistas = "";
        duracion = indiceUP = 0;
    }
    
    public int getTiempoD(){
        return duracion;
    }
    
    public String getPistas(){
        return pistas;
    }
    
    public void setTiempoD(int nuevoD){
        duracion = nuevoD;
    }
    
    public void setPistas(String pistas){
        this.pistas = pistas;
    }
    
    public int getIndiceUP(){
        return indiceUP;
    }
    
    public void setIndiceUP(int indiceUP){
        this.indiceUP = indiceUP;
    }
    
    public String toString(){
        return pistas + "sum:"+duracion;
    }
    @Override
    public boolean equals(Object o){
        boolean equals = false;
        if(o instanceof Cinta){
            Cinta cin = (Cinta) o;//casting
            if(cin.getPistas().equals(this.pistas) &&
               cin.getTiempoD() == this.duracion){
                   equals = true;
             }
        }
        return equals;
    }
}
