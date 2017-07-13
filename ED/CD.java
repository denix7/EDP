import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayList; 
/*
5
5 3 1 3 4
10 4 9 8 4 2
20 4 10 5 7 4
90 8 10 23 1 2 3 4 5 7
45 8 4 10 44 43 12 9 8 2
   */
public class CD
{
    public static void main(String[]arg){
        new CD().leer();
    }
    
    public void leer(){
        Scanner in = new Scanner(System.in);
        int T,t,i,n,j;
        int[]ts;
        T = in.nextInt();
        for(i = 1; i <= T; i++){
            t = in.nextInt();
            n = in.nextInt();
            ts = new int[n];
            for(j = 0; j <= n-1; j++){
                ts[j] =  in.nextInt();
            }
            System.out.println(getContenidoCinta(t, n, ts));
        }
    }
    
    //ts = timpos de duracion de las pistas
    public String getContenidoCinta(int t, int n, int[]ts){
        String con = "";
        Cinta optima = null, c, nuevaC;
        int iup,j;
        Stack<Cinta> pila = new Stack<Cinta>();
        pila.push(new Cinta());
        while(!pila.isEmpty()){
            c = pila.pop();
            iup = c.getIndiceUP();
            if(optima == null) optima = c;
            else if(optima.getTiempoD() < c.getTiempoD())
                optima = c;
            else if(optima.getTiempoD() == c.getTiempoD()){
                if(optima.getPistas().length() < c.getPistas().length()){
                    optima = c;
                }
            }
            for(j = iup; j <= n-1; j++){
                if(c.getTiempoD() + ts[j] <= t){
                    nuevaC = new Cinta();
                    nuevaC.setTiempoD(c.getTiempoD() + ts[j]);
                    nuevaC.setPistas(c.getPistas() + ts[j] + " ");
                    nuevaC.setIndiceUP(j+1);
                    pila.push(nuevaC);
                }
            }
        }
        
        con = optima.toString();
        
        return con;
    }
    
    /**Metodo de  que verifica si un elemento esta en la lista*/
    public void test(){
        ArrayList<Cinta> lista = new ArrayList<Cinta>();
        Cinta c = new Cinta();
        lista.add(c);
        c = new Cinta();
        if(!lista.contains(c)){
            lista.add(c);
        }
        System.out.println(lista);
    }
}
