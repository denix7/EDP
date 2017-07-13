package EjerciciosElementos;


/**
 * Write a description of class luckyNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class luckyNumber
{
    public boolean esLuckyNumber(int n){
        boolean res=false;
        if(n==0)
            res = true;
        else
        {   
            int dig=n%10;
            if(!(dig==7 || dig==4))
                res = false;
            else
                res = esLuckyNumber(n/10);
        }   
        return res;
    }
}
