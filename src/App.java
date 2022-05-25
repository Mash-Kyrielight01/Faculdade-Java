import java.util.Scanner;


public class App {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)  {
          //aninhar if para fazer subclasses futuramente
          //criar uma função para o personagem chamar uma ficha com seus dados 
          //implementar rolagem de dados pra jogar e os status

        //variaveis
        int classe;        
        int subclasse;
        //int [] atributos
        //força
        //destreza
        //constituição
        //inteligencia
        //sabedoria
        //carisma


        //tutorial        
        System.out.println("ola aventureiro, seja bem vindo!");             
        System.out.println("Por favor diga-nos o nome daquele(a) que ira desbravar este mundo, fazer grandes descobertas\nexplorar templos escondidos\ne conhecer coisas maravilhosas");
        String nome = input.nextLine();
        System.out.println("Seja bem vindo senhor(a)...." + nome +" ok, parece um nome interessante");
        System.out.println("bem, agora um pouco de introdução do seu trabalho\nalgumas pessoas estao sumindo ao redor da floresta floresta\npor causa disso o chefe da guarda porém eles estavam preocupados com uma possivel ameaça de um dragão");
        System.out.println("por causa disso, a guarda esta pagando aventureiros que se interessarem em algum dinheiro para resolverem esse caso");
        System.out.println("UMA RECOMPENSA PARA AQUELE QUE RESOLVER O PROBLEMA DO DESAPARECIMENTO DAS BOAS PESSOAS DESTA CIDADE, COM O PREMIO DE 50 MOEDAS DE OURO");
        //escolha da sua classe/estilo de jogo
        //("por favor escolha sua classe aventureiro\n");
        
        Capitulo escolhaDePersonagem = new Capitulo("Mago, detentor de poderosas magias, uma inteligencia notável\numa grande sabedoria, e conhece muito do mundo atraves de seus livros\n"+
        "Guerreiro, um lutador habilidoso, treinado em varias armas, conhece campos de batalha como ninguem\n"+
        "Ladino, um  oportunista das sombras, usa venenos e armadilhas para vencer batalhas e trespassar seus desafios\n", "mago", "guerreiro", "ladino", input);
        Capitulo mago = new Capitulo("vc escolheu mago, que os caminhos da magia te guie e que sua sabedoria seja sua melhor arma em batalha", " ", " ", " ", input);
        escolhaDePersonagem.mostrar();
        classe = escolhaDePersonagem.escolher();
        
        if (classe == 1)
        {
            mago.mostrar();
            subclasse = mago.escolher();

            //System.out.println("por favor escolha sua especialização");
            //System.out.println("Mago do Fogo");
           //System.out.println("um mago cujo seu foco é aapenas magias de fogo, resistencia aumentada contra fogo");
        }
        else if ( classe == 2)
        {
            System.out.println("vc escolheu o Lutador, que os caminhos da batalha te guiem pela sua jornada");
        }
        else 
        {
            System.out.println("vc escolheu o ladrão1, que as sombras te protejam pois ao lado delas que vc ira para as batalhas\n");
        }
        
    }
}
