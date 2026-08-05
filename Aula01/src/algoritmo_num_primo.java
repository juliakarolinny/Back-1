 import static java.lang.IO.*;
void main() {

    int num = Integer.parseInt(readln("Digite um número inteiro: "));

    int divisores = 0;// num primo so é divisivel por 0 ou ele mesmo

    for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
            divisores++;
        }
    }
//divisores igual a 2 ( if abaixo).
    if (divisores == 2) {
        IO.println("O número " + num + " é primo!");
    } else {
        IO.println("O número " + num + " não é primo!");
    } // ler codigo
}
