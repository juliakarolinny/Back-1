public class Titulo {
    public String Twilight;;
    public String  Duna;
    public String It;

    public Titulo(String twilight, String Duna, String It) {
        Twilight = twilight;
        this.Duna = Duna;
        this.It =It;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "Twilight='" + Twilight + '\'' +
                ", Duna='" + Duna + '\'' +
                ",It='" + It + '\'' +
                '}';
    }
}
