
public class Pueblo
{
    private String nombre;
    private int tiempo;
    public Pueblo(String nombre, int tiempo){
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    public String nombre(){
        return nombre;
    }
    public int tiempo(){
        return tiempo;
    }
    @Override
    public boolean equals(Object o){
        boolean ans = false;
        if(o instanceof Pueblo){
            Pueblo otro = (Pueblo)o;
            if(this.nombre.equals(otro.nombre))
                ans = true;
        }
        return ans;
    }
    public String toString(){
        return nombre;
    }
}
