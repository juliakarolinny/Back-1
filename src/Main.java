
void main() {

    Veiculo ferrari = new Veiculo("Vermelho","ferrari","SF90");

    Veiculo audi = new Veiculo("azul","audi","A3");

    Veiculo bmw = new Veiculo("roxo","mercedes","M1");

    Veiculo porshe = new Veiculo("branco","porche","911");
    IO.println(ferrari.acelerar());
    IO.println(audi.acelerar());
    IO.println(bmw.acelerar());
    IO.println(porshe.acelerar());


}
