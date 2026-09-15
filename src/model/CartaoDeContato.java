package model;

public class CartaoDeContato implements Cloneable{
    private String nome;
    private String telefone;
    private String empresa;
    private String corDeFundo;


    public CartaoDeContato(String nome, String telefone, String empresa, String corDeFundo) {
        this.nome = nome;
        this.telefone = telefone;
        this.empresa = empresa;
        this.corDeFundo = corDeFundo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public CartaoDeContato clone(){
        return new CartaoDeContato(this.nome, this.telefone, this.empresa, this.corDeFundo);
    }

    @Override
    public String toString() {
        return nome + " | " + telefone + " | " + empresa + " (fundo: " + corDeFundo + ")";
    }

}
