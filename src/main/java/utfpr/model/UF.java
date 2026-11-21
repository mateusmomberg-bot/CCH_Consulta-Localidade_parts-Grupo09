package utfpr.model;

public class UF {
    private final int id;
    private final String nome;
    private final String sigla;

    public UF(int id, String nome, String sigla){
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getSigla(){
        return sigla;
    }

    @Override
    public String toString(){
        return nome + "(" + sigla + ")";
    }

}
