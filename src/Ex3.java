/******************************************************************************
Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor
da  compra for  menor  que  R$20,00;  caso  contrário,  o  lucro  será de 30%.
Entrar com o valor do produto e imprimir o valor da venda.
*******************************************************************************/
import java.util.Scanner;

public class Ex3
{
	public static void main(String[] args) {
        double valorProduto, valorVenda;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com o valor do produto: ");
        valorProduto = input.nextDouble();
        if(valorProduto < 20){
            valorVenda = valorProduto + valorProduto * 0.45;
        }else{
            valorVenda = valorProduto + valorProduto * 0.30;
        }
        System.out.println("\nValor de venda do produto é: " + valorVenda);
    }
}
