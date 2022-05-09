
import java.util.Scanner;
public class Capitulo {

    public String escolha1;
    public String escolha2;
    public String escolha3;
    public String texto;
    public Scanner input;
    
    Capitulo(String texto, String escolha1, String escolha2, String escolha3, Scanner input){
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.escolha3 = escolha3;
        this.input = input;
    }
    void mostrar(){
        System.out.println(" " +texto);
        System.out.println(" " +escolha1);
        System.out.println(" " +escolha2);
        System.out.println(" " +escolha3);       


    }
    public int escolher(){
        int selecao = 0;
                
        while(selecao == 0){
            String resposta = input.nextLine();
            
            if(resposta.equals(escolha1)){
                selecao = 1;
            }
            else if(resposta.equals(escolha2)){
                selecao = 2;
            }
            else if(resposta.equals(escolha3)){
                selecao = 3;
            }
            //quando implementar inteface grafica retirar o else
            else{
                System.out.println("por favor escolha uma das 3 opçoes");
            }
        }
        return selecao;
    }
    
}
