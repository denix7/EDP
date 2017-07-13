package EjerciciosElementos;


/**
 * Write a description of class P79 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P79BuscaNido
{
    private Nido[][] plano;
    private int m,n;
    
    public Direccion buscar()
    {
        return buscar(0,0);
    }
    private Direccion buscar(int x, int y)
    {
        Direccion dir = new Direccion(); //direccion por defecto
        if(x<m) //sera que es valida?
        {    
            if(y<n) //sera que es valida?
            {
                if(plano[x][y].esVacio())
                {
                    /*Direccion dirPar=new Direccion(x,y,buscarCantA(x,y));
                    if(dir.cantMax()<dirPar.cantMax())
                        dir = dirPar;
                    */   
                   dir = new Direccion(x, y, buscarCantA(x,y));
                   Dreccion dirParcial;
                   dirParcial = buscar(x,y+1);
                    if(dir.cantMax()<dirParcial.cantMax())
                        dir=dirParcial;
                   
                }
                else dir = buscar(x,y+1);
            }
            else dir = buscar(x+1, 0);
        }
        return dir;
    }
    
    private int buscarCantA(int x, int y)
    {
        int cantidad = 0;
        if(valida(x,y))
         {
             if(Plano[x][y].getTipo() != 'v' &&
            !Plano[x][y].visitado())
            {
                plano[x][y].visitar();
                cantidad = plano[x][y].getHab()+
                            buscarCant(x-1, y)+
                            buscarCant(x, y+1)+
                            buscarCant(x+1, y)+
                            buscarCant(x, y-1);
            }
        }
        return cantidad;
    }
}