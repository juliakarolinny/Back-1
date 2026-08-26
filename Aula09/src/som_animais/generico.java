import som_animais.Cachorro;
import som_animais.Gato;
import som_animais.Humano;

void main() {
    Humano pessoa = new Humano();
    Gato gato = new Gato();
    Cachorro cachorro = new Cachorro();

    IO.println("som emitido: " + pessoa.gemido());
    IO.println("Som emitido : " + gato.ronronar());
    IO.println("som emitido: " + cachorro.ladito());
}