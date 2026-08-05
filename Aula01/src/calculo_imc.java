import static java.lang.IO.*;

void main() {

double peso = Double.parseDouble(readln("Digite seu peso: "));
double altura = Double.parseDouble(readln("digite sua altura: "));

double imc = peso / (altura * altura);

IO.println("Seu imc é: " + imc );//IO.println("Seu imc é: " + imc ); sem so duas casas decimasis
}