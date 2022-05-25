public class Personagem {
    String nome;
    int energia;

    //protagonista
    Personagem(String nome , int energia);
    {
        this.nome = nome;
        this.energia = energia;

    }
    //inimigos
    Personagem(String nome);
    {
        this.nome = nome;
        this.energia = 100;
    }
    //NPCs
    Personagem(String nome);
    {
        this.nome = nome;
    }
}
