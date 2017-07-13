import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;
/**
2
8 0 5 6
6 5 0 8
5
8 0 5 7
8 0 4 7
5 5 0 8
7 5 0 8
6 4 0 8
0 0 0 0
5 3 1 7
8
0 0 0 1
0 0 0 9
0 0 1 0
0 0 9 0
0 1 0 0
0 9 0 0
1 0 0 0
9 0 0 0
   
   */
public class Maquina
{
    public static void main(String[]arg){
       new Maquina().leer();
    }
    
    public void leer(){
        Scanner in = new Scanner(System.in);
        int t,T,p,i,j;
        int[]s;
        Rodillo ini,fin;
        //ArrayList<Rodillo> proh;
        TreeSet<Rodillo> proh;
        T = in.nextInt();
        for(t = 0; t < T; t++){
            s = new int[4];
            for(i = 0; i < 4; i++) s[i] = in.nextInt();
            ini = new Rodillo(s, 0);
            s = new int[4];
            for(i = 0; i < 4; i++) s[i] = in.nextInt();
            fin = new Rodillo(s, 0);
            p = in.nextInt();
            //proh = new ArrayList<Rodillo>();
            proh = new TreeSet<Rodillo>();
            for(i = 0; i < p; i++){
                s = new int[4];
                for(j = 0; j < 4; j++) s[j] = in.nextInt();
                proh.add(new Rodillo(s, 0));
            }
            System.out.println(minimaCantidadBotonesPresionados(ini, fin, proh));
        }
    }    
    
    public int minimaCantidadBotonesPresionados(Rodillo ini, 
                                                Rodillo fin,
                                                TreeSet<Rodillo> proh){
           int min = -1, ind;
           Queue<Rodillo> cola = new ArrayDeque<Rodillo>();
           cola.add(ini);
           Rodillo nr;//nuevo Rodillo
           while(!cola.isEmpty()){
               ini = cola.poll();
               if(ini.equals(fin)){
                   min = ini.getPasos();
                }else{
                    for(ind = 0; ind < 4; ind++){
                        nr = ini.generarRodillo(ind, -1);
                        if(!proh.contains(nr)){
                            proh.add(nr);
                            cola.add(nr);
                        }
                        nr = ini.generarRodillo(ind, +1);
                        if(!proh.contains(nr)) {
                            proh.add(nr);
                            cola.add(nr);
                        }
                    }
                }
            }
            return min;
    }
    
    
public class Rodillo implements Comparable<Rodillo>
{
    private int[]S;//start = S = conf.inicial
    private int pasos;
    public Rodillo(int[]S, int pasos){
        this.S = S;
        this.pasos = pasos;
    }
    public Rodillo generarRodillo(int ind, int val){
        Rodillo rod = new Rodillo(S.clone(), pasos);
        if(rod.S[ind] + val == -1)  rod.S[ind] = 9;
        else if(rod.S[ind] + val == 10)  rod.S[ind] = 0;
        else  rod.S[ind] = rod.S[ind] + val;        
        rod.pasos++;
        return rod;
    }
    @Override
    public boolean equals(Object o){
        boolean equals = true;
        if(o instanceof Rodillo){
            Rodillo otro = (Rodillo)o;
            for(int i = 0; i < S.length && equals; i++){
                if(otro.S[i] != this.S[i]){
                    equals = false;
                }
            }
        }
        return equals;
    }
    public int getPasos(){
        return pasos;
    }
    
    public int compareTo(Rodillo o){
        int res = 0,i ;
        for(i = 0; i < S.length && res == 0; i++){
            res = S[i] - o.S[i];
        }
        return res;
    }
    
}

}
