import java.util.ArrayList;
public class registroPais
{
    registro reg;
    ArrayList<registro> guardado=new ArrayList<registro>();
    public registroPais(int cod,String nombrePais,String idioma,String cap)
    {
        reg= new registro(cod,nombrePais,idioma,cap);
        guardado.add(reg);
    }
    public void setAgregarPais(int cod,String nombrePais,String idioma,String cap)
    {
        reg= new registro(cod,nombrePais,idioma,cap);
        guardado.add(reg);
    }
    /*
    public void mostrar(){
        System.out.println("Lista de Paises");
        System.out.println("Nombre    Codigo   Idioma   Capital");
        System.out.println(reg.getPais()+"    "+reg.getCodigo()+"    "+reg.getIdioma()+"    "+reg.getCapital());
    }*/
    public void mostrar(){
        //registro s= guardado.get(0);
        //System.out.println(s.getPais()+"    "+s.getCodigo()+"    "+s.getIdioma()+"    "+s.getCapital());
        for(registro reg:guardado){
            System.out.println(reg.getPais()+"    "+reg.getCodigo()+"    "+reg.getIdioma()+"    "+reg.getCapital());    
        }
    }
}
