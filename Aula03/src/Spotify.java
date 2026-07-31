
void main() {
Musica[] musica = new Musica[3];

  IO.println("===========Cadastre a sua musica=============");

  for(int i = 0; i<3; i++) {
    IO.println("Digite informações de musicas diferentes: " + (i + 1) );

    String titulo = IO.readln("Titulo:");

    int duracao = Integer.parseInt(IO.readln("Duracao:"));

    String cantor = IO.readln("cantor:");

    musica[i] = new Musica(titulo, duracao, cantor);

  }
          Arrays.sort(musica, Comparator.comparing(Musica::getTitulo));

  for (Musica m : musica) {//percorre a lista(navegar dentro do musica linha por linha)
    IO.println(m);
  }
}


