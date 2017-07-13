public class registro
{
    String pais;
    int codigo;
    String idioma;
    String capital;
    conectar cc=new conectar();
    public registro(int cod,String nombrePais,String idioma,String cap)
    {   
        pais=nombrePais;
        codigo=cod;
        this.idioma=idioma;
        capital=cap;
        cc.conexion();
    }
    public String getPais(){
        return pais;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getIdioma(){
        return idioma;
    }
    public String getCapital(){
        return capital;
    }
    public void setPais(String nombrePais){
        pais=nombrePais;
    }
    public void setCodigo(int cod){
        codigo=cod;
    }
    public void setIdioma(String idioma){
        this.idioma=idioma;
    }
    public void setCapital(String cap){
        capital=cap;
    }
}
