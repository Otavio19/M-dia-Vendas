/*
    Exercicio do curso "Lógica de programação" aula "O que são linguagens de programação?"

Exercicio:
    Pedir as vendas de um funcionarios nos meses: Janeiro, Fevereiro, março e Abril.
    somar as vendas.
    Calcular a média. 
    Exebir total de vendas. 
    Exebir a média de vendas
*/

package mediadevendas;

import java.util.Scanner;

public class MediaDeVendas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int Janeiro, Fevereiro, Marco, Abril, Soma, Media, Resposta;
        String funcionario;
        
        for(int i = 0; i <=4; i++){
            
            System.out.println("Qual Nome do funcionario?");
        funcionario = ler.next();
        
        System.out.println("Quantas vendas funcionario fez no mes de Janeiro?");
        Janeiro = ler.nextInt();
        
        System.out.println("Quantas vendas funcionario fez no mes de Fevereiro?");
        Fevereiro = ler.nextInt();
        
        System.out.println("Quantas vendas funcionario fez no mes de Março?");
        Marco = ler.nextInt();
        
        System.out.println("Quantas vendas funcionario fez no mes de Abril?");
        Abril = ler.nextInt();
        
        System.out.println("########################################"); 
        System.out.println("Funcionario " + funcionario + " Vendeu fez em\nJaneiro " + Janeiro + " Vendas "
                +"\nFevereiro "+Fevereiro+" Vendas "+"\nMarço "+Marco+" Vendas "+"\nAbril "+Abril+" Vendas ");
        
        Soma = Janeiro + Fevereiro + Marco + Abril;
        Media = (Janeiro + Fevereiro + Marco + Abril)/4;
        
        System.out.println("########################################");        
        System.out.println("Teve um total de: " + Soma + " Vendas");
        
        System.out.println("########################################"); 
        System.out.println("E a media de vendas foi: " + Media + " Vendas");
        System.out.println("########################################"); 
        
        System.out.println("Deseja continuar a usar o programa? \nSim = 1\nNão = 2");
         Resposta = ler.nextInt();
           
        switch(Resposta){
            case 1:
                i = 0;
                break;
            case 2:
                i = 5;
                break;
            }
        }
        System.out.println("#############################");
        System.out.println("Obrigado por usar meu código!");
        System.out.println("#############################");
    }
    
}
