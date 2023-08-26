/******************************************************************************
Ler três números e mostrá-los em ordem crescente.
*******************************************************************************/
import java.util.Scanner;

public class Ex2
{
	public static void main(String[] args) {
        int valor1, valor2, valor3;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro valor");
        valor1 = input.nextInt();
        System.out.println("%nEntre com o segundo valor");
        valor2 = input.nextInt();
        System.out.println("%nEntre com o terceiro valor");
        valor3 = input.nextInt();
        if(valor1 > valor2 && valor1 > valor3){
            if(valor2 > valor3){
                System.out.println(valor3 + " " + valor2 + " " + valor1);
            }else
                System.out.println(valor2 + " " + valor3 + " " + valor1);
        }else if(valor2 > valor1 && valor2 > valor3){
            if(valor1 > valor3){
                System.out.println(valor3 + " " + valor1 + " " + valor2);
            }else
                System.out.println(valor1 + " " + valor3 + " " + valor2);
        }else if(valor3 > valor1 && valor3 > valor2){
            if(valor1 > valor2){
            System.out.println(valor2 + " " + valor1 + " " + valor3);
            }else
                System.out.println(valor1 + " " + valor2 + " " + valor3);
        }
    }
}
