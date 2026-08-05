void main() {


    IO.println("----Cadastre seu livro----");

    for(int i = 0; i <= 2; i ++) {

        String Titulo = IO.readln("Titulo: ");
        String Genero = IO.readln("Genero: ");
        String Autora = IO.readln("Autora: ");

        Livros livros = new Livros(Titulo, Genero, Autora);

        Livros livros1 = new Livros("Duna", "Ficcao","Frank Herbert");
        Livros livro2 = new Livros ("Twilight","Romance", " Stephenie Meyer");
        Livros livro3 = new Livros ("It", "Terror", "Stephen King");

        IO.println(livros);
    }

}