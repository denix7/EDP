package Recursividad;


/**
 * Write a description of class sumarMultiplo5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sumarMultiplo5
{
    public int sumarMultiplo5(int n)
    {
        if (n==1)
            return 5;
            
        else
            return sumarMultiplo5(n-1)+n*5;
    }
}
