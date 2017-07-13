package EjerciciosElementos;


/**
 * Write a description of class ExamenContraseniaSegura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExamenContraseniaSegura
{
    public boolean esContrasenaSegura(String contrasena)
    {
        if(contrasena.length()>=15)
            return true;
        else
            if(contrasena.length()<3)
                return false;
            else
                return esContrasenaSegura(contrasena, 0, 0); //sobrecarga, delegamos responsabilidad a otro metodo
            
    }
    private boolean esContrasenaSegura(String contrasena, int pos, int cont)
    {
        if(pos<contrasena.length())
        {   
            char c = contrasena.charAt(pos);
            if(!esNumero(c) && !esLetra(c)) //si no es numero y no es letra, es caracter especial
                return esContrasenaSegura(contrasena, pos+1, cont+1); //seguimos analizando la siguiente posicion y contamos el caracter especial
            else
                return esContrasenaSegura(contrasena, pos+1, cont); //seguimos analizando la siguiente posicion pero no contamos porque no existe char especial
        }
        else
            if(cont>=3)
                return true;
            else
                return false;
    }
    
    private boolean esNumero(char c)
    {
        if(c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8' || c=='9' || c=='0')
            return true;
            else return false;
    }
    
    private boolean esLetra(char c)
    {
        if(c=='a' || c=='b' || c=='c' || c=='d' || c=='e' || c=='f' || c=='g' || c=='h' || c=='i' || c=='j' || c=='k' || c=='l' || c=='m' || 
           c=='n' || c=='o' || c=='p' || c=='q' || c=='r' || c=='s' || c=='t' || c=='u' || c=='v' || c=='w' || c=='x' || c=='y' || c=='z')
            return true;
            else 
            return false;
    }
}
