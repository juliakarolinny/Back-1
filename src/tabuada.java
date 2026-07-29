import static java.lang.IO.*;
void main() {


    int num = Integer.parseInt(readln("Digite um numero:" ));

 IO.println( "Tabuada" + num + ":");

    for (int i = 1; i <= 10; i++) {
        IO.println( num + "x" + i + "=" + (num * i) );

    }


}