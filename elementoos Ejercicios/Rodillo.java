
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
