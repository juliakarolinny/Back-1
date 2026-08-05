public class Genero {
    public String Terror;
    public String Comedia;
    public String Roamnce;

    public Genero(String terror, String comedia, String roamnce) {
        Terror = terror;
        Comedia = comedia;
        Roamnce = roamnce;
    }

    @Override
    public String toString() {
        return "Genero{" +
                "Terror='" + Terror + '\'' +
                ", Comedia='" + Comedia + '\'' +
                ", Roamnce='" + Roamnce + '\'' +
                '}';
    }
}