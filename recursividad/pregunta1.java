
public class pregunta1 {
    public String criptografo(String mensaje){
        return criptografo(mensaje,0);
        
    }
    private String criptografo(String texto,int pos){
        if(pos==texto.length()){
            return "";
        } else {
          if(texto.charAt(pos)==' '){ 
             return criptografo(texto,pos+1);
          }else{
            if(pos==0){
             return esImPar(texto.charAt(pos))+ criptografo(texto,pos+1);          
            }else{
                if(pos%2==0){
                    return esImPar(texto.charAt(pos))+ criptografo(texto,pos+1);  
                }else{
                    return esPar(texto.charAt(pos))+ criptografo(texto,pos+1);  
                }
                
            }
          }
            
        }
    }
    private String esPar(char comparar){
        if('A'==comparar)
            return "n";
        if('B'==comparar)
            return "r";
        if('C'==comparar)
            return "w";
        if('D'==comparar)
            return "b";
        if('E'==comparar)
            return "g";
        if('F'==comparar)
            return "l";
        if('G'==comparar)
            return "p";
        if('H'==comparar)
            return "u";
        if('I'==comparar)
            return "z";
        if('J'==comparar)
            return "e";
        if('K'==comparar)
            return "j";
        if('L'==comparar)
            return "ñ";
        if('M'==comparar)
            return "s";
        if('N'==comparar)
            return "x";
        if('Ñ'==comparar)
            return "c";
        if('O'==comparar)
            return "h";
        if('P'==comparar)
            return "m";
        if('Q'==comparar)
            return "q";
        if('R'==comparar)
            return "v";
        if('S'==comparar)
            return "a";
        if('T'==comparar)
            return "f";
        if('U'==comparar)
            return "k";
        if('V'==comparar)
            return "o";
        if('W'==comparar)
            return "t";
        if('X'==comparar)
            return "y";
        if('Y'==comparar)
            return "d";
        else
            return "i";
    }
     private String esImPar(char comparar){
        if('A'==comparar)
            return "a";
        if('B'==comparar)
            return "e";
        if('C'==comparar)
            return "i";
        if('D'==comparar)
            return "m";
        if('E'==comparar)
            return "p";
        if('F'==comparar)
            return "t";
        if('G'==comparar)
            return "x";
        if('H'==comparar)
            return "b";
        if('I'==comparar)
            return "f";
        if('J'==comparar)
            return "j";
        if('K'==comparar)
            return "n";
        if('L'==comparar)
            return "q";
        if('M'==comparar)
            return "u";
        if('N'==comparar)
            return "y";
        if('Ñ'==comparar)
            return "c";
        if('O'==comparar)
            return "g";
        if('P'==comparar)
            return "k";
        if('Q'==comparar)
            return "ñ";
        if('R'==comparar)
            return "r";
        if('S'==comparar)
            return "v";
        if('T'==comparar)
            return "z";
        if('U'==comparar)
            return "d";
        if('V'==comparar)
            return "h";
        if('W'==comparar)
            return "l";
        if('X'==comparar)
            return "o";
        if('Y'==comparar)
            return "s";
        else
            return "w";
    }
}
