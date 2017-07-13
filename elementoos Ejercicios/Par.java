
public class Par implements Comparable<Par>
{
    private char c;
    private int cnt;//contador
    public Par(char c){
        this.c = c;
        cnt = 1;
    }
    public void incr(){
        cnt++;
    }
    public char getC(){
        return c;
    }
    public String toString(){
        return c+""+cnt;
    }
    public int compareTo(Par otro){
        return  this.c - otro.c;
    }
}
