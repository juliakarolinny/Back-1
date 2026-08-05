public class Titulo {
    public String Twilight;;
    public String  amoresimprovaveis;
    public String crepusculo;

    public Titulo(String twilight, String amoresimprovaveis, String crepusculo) {
        Twilight = twilight;
        this.amoresimprovaveis = amoresimprovaveis;
        this.crepusculo = crepusculo;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "Twilight='" + Twilight + '\'' +
                ", amoresimprovaveis='" + amoresimprovaveis + '\'' +
                ", crepusculo='" + crepusculo + '\'' +
                '}';
    }
}