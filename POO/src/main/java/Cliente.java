public class Cliente {

    private Sexo sexo;
    private String nombre;



    private String edad;

    public Cliente(String nombre,String edad,Sexo sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void setNombre(String nombre){
        this.nombre =nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(){
        this.edad = edad;
    }

    public String getEdad(){
        return edad;
    }

    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }

    public Sexo getSexo(){
        return sexo;
    }
}
