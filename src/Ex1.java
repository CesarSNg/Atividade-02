/******************************************************************************
Ler um valor e informar se ele é ou não múltiplo de 3.
*******************************************************************************/
import java.util.Scanner;

public class Ex1
{
	public static void main(String[] args) {
        Float valor;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com o valor");
        valor = input.nextFloat();
        if(valor % 3 == 0)
            System.out.println("\nValor multiplo de 3");
        else
            System.out.printf("\nValor nao multiplo de 3");	}
}
