package utfpr.model;

public class Municipio {
    private final int id;
    private final String nome;
    private final String siglaUf;
    private final String regiao;

    public Municipio(int id, String nome, String siglauf, String regiao){
        this.id = id;
        this.nome = nome;
        this.siglaUf = siglauf;
        this.regiao = regiao;
    }

    public int getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }
    public String getSiglaUf() {
        return siglaUf;
    }
    public String getRegiao() {
        return regiao;
    }

    @Override
    public String toString(){
        return nome;
    }
}
