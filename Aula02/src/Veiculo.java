public class Veiculo {

    public String cor;
    public String marca;
    public String modelo;

    public String acelerar(){
        return "VRUUUUUMM";
    }
    public String freiar(){
        return "IIRRIII";
    }

    public Veiculo(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}