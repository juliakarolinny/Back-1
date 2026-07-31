public class Musica {
    public String titulo;
    public Integer duracao;
    public String cantor;

    public Musica(String titulo, Integer duracao, String cantor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.cantor = cantor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "titulo='" + titulo + '\'' +
                ", duracao='" + duracao + '\'' +
                ", cantor='" + cantor + '\'' +
                '}';
    }
}