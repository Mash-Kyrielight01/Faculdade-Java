import java.util.Random;
public class Atributos {
    public static void main(String[] args) {
        int [] atributosDoPersonagem = new int [6]; 
        
        //instância um objeto da classe Random usando o construtor básico
        Random gerador = new Random();

        //imprime sequência de 6 números inteiros aleatórios entre 1 e 20
        for (int i = 0; i < 6; i++) {
            atributosDoPersonagem[i]=gerador.nextInt(20);
            System.out.println(atributosDoPersonagem[i]);
            
         }
         
    }
       
        
    
        //Força
        //Destreza
        //Constituição
        //Inteligencia
        //Sabedoria
        //Carisma
    
    
}
