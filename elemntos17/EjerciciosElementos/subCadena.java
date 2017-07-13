package EjerciciosElementos;


/**
 * Write a description of class subCadena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class subCadena
{
    public String subCad(String texto, int posini, int posfin)
    {
        
        if(posini<=posfin)
        {
            char c = texto.charAt(posini);
            return c+subCad(texto, posini+1, posfin);
        }
        else
            return "";
    }
}
