public enum Sexo {
    MASCULINO("Soy hombre"),
    FEMENINO("Soy mujer"),
    OTROS("No me he definido");

    private String description;

    private Sexo(String s){
        description = s;
    }

    public String getDescription(){
        return description;
    }

}
