public class Livros {
    public String nome;
    public String descricao;
    public String autora;

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", autora='" + autora + '\'' +
                '}';
    }

    public Livros(String nome, String descricao, String autora) {
        this.nome = nome;
        this.descricao = descricao;
        this.autora = autora;
    }
}