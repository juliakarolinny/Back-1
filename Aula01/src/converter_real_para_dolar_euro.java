import static java.lang.IO.*;
void main() {
    Double real = Double.parseDouble(readln("digite o valor de real a converter: "));

     IO.println(" conversao do dolar");
     IO.print(String.format("%.2f\n", real/5.10));// ate a virgula é para mostrar somente as duas primeiras casas decimais é o normal, IO.println(real/5.79);
    IO.println(" conversao do euro");
    IO.println(String.format("%.2f\n", real/5.79));



}