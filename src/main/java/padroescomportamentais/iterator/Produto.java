package padroescomportamentais.iterator;

public class Produto {

    private String nome;
    private boolean disponivel; // Corresponde ao 'ativo'

    public Produto(String nome, boolean disponivel) {
        this.nome = nome;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isDisponivel() { // Corresponde ao 'isAtivo()'
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}