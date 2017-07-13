package EjerciciosElementos;


/**
 * Write a description of class Nido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nido
{
    private char tipo;
    private int cantHab;
    private boolean visitado;
    
    public char getTipo()
    {
        return tipo;
    }
    public boolean visitado()
    {
        return visitado;
    }
    public void visitar()
    {
        visitado=true;
    }
    public int getHab()
    {
        return cantHab;
    }
    public boolean esVacio()
    {
        return tipo=='*';
    }
}
