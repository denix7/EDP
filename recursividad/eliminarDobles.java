public class eliminarDobles {
    public String eliminarDobles(String texto){
        String dobles = eliminarDobles(texto,1,0,0);
        return invertir(dobles,dobles.length()-1);
    }
    private String eliminarDobles(String texto, int posF,int posI,int contador){
        //int contador=0;
        if(posF<texto.length()){
            char posicionInicial= texto.charAt(posI);
            char posicionFinal= texto.charAt(posF);
            if(posicionInicial==posicionFinal){
                return eliminarDobles(texto,posF+1,posI+1,contador+1);
            }else{
                if(contador==1){
                return posicionInicial+ eliminarDobles(texto,posF+1,posI+1,0);
                }else{
                return posicionInicial+ eliminarDobles(texto,posF+1,posI+1,contador);
                }
            }
        }else{
            char posII=texto.charAt(posI-1);
            char posFF=texto.charAt(posF-1);
            if(posII==posFF)
            return "";
            else
            return posFF+"";
        }
    }   
    public String invertir(String palabra,int posInicialP){
        
        if(posInicialP<0){
        return "";
        }else{
            return palabra.charAt(posInicialP)+ invertir(palabra,posInicialP-1);
            
        }
    }
}     