package EjerciciosElementos;


/**
 * Write a description of class Direccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Direccion
{
    private int x,y,cantA;
    
    public void Dreccion()
    {
        x=-1;
        y=-1;
        cantA=0;
    }
    public void Direccion(int nx, int ny, int nc)
    {
        x=nx;
        y=ny;
        cantA=nc;
    }
    public int cantMax()
    {
        return cantA;
    }
}
