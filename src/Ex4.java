/******************************************************************************
ler a idade de uma pessoa e informar a sua classe eleitoral:
Não-eleitor (abaixo de 16 anos)
Eleitor obrigatório (entre 18 e 65 anos)
Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)
*******************************************************************************/
import java.util.Scanner;

public class Ex4
{
	public static void main(String[] args) {
        int idade;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a idade: ");
        idade = input.nextInt();
        if(idade < 16)
            System.out.println("\nNão eleitor!");
        else if(idade > 16 && idade <18)
            System.out.println("\nEleitor Facultativo.");
        else
         System.out.println("\nEleitor Obrigatório.");

    }
}
