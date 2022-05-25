import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;


public class App extends Application {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)  {
        launch(args);
          
          //criar uma função para o personagem chamar uma ficha com seus dados 
          //implementar rolagem de dados pra jogar e os status

        //variaveis
        int classe;        
        //int [] atributos
        //força
        //destreza
        //constituição
        //inteligencia
        //sabedoria
        //carisma
        Personagem Protagonista = new Personagem("Jack" , 50);

        //tutorial        
        System.out.println("ola aventureiro, seja bem vindo!");             
        System.out.println("Por favor diga-nos Senhor jack, aquele(a) que ira desbravar este mundo, fazer grandes descobertas\nexplorar templos escondidos\ne conhecer coisas maravilhosas");
        System.out.println("bem, agora um pouco de introdução do seu trabalho\nalgumas pessoas estao sumindo ao redor da floresta \npor causa disso o chefe da guarda  está contratando, pois eles estavam preocupados com uma possivel ameaça de um dragão");
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
            Protagonista.energia = 150;
            System.out.println("como mago sua energia agora é de");
            System.out.println("o seu arquirival é o Shinow, o Grande bruxo das trevas");

            //System.out.println("por favor escolha sua especialização");
            //System.out.println("Mago do Fogo");
           //System.out.println("um mago cujo seu foco é aapenas magias de fogo, resistencia aumentada contra fogo");
        }
        else if ( classe == 2)
        {
            System.out.println("vc escolheu o Lutador, que os caminhos da batalha te guiem pela sua jornada");
            Protagonista.energia = 200;
            System.out.println("Seu rival e maior inimigo é o Sir. Filipe, o rei da guerra");
        }
        else 
        {
            System.out.println("vc escolheu o ladrão, que as sombras te protejam pois ao lado delas que vc ira para as batalhas\n");
            Protagonista.energia = 100;

        }
        
    }
    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        
    }
}
