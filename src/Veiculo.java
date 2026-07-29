public class  Veiculo {

    public String cor;//atribuots
    public String marca;
    public String modelo;

    public String acelerar(){//metodos
        return "vruuuuuuummm";
    }
    public String freiar(){
        return "firifrifir ";
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

