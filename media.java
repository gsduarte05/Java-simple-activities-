package tipos_de_dados;

import java.util.Scanner;

public class media{
    public static void main(String[] arges) {

        Scanner sc = new Scanner(System.in);
        
        double n1, n2, n3, n4, media;

        System.out.print("Digite a aqui 1: ");
        n1 = sc.nextDouble();

        System.out.print("Digire a aqui 2: ");
        n2= sc.nextDouble();

        System.out.print("Digite a aqui 3: ");
        n3 = sc.nextDouble();

        System.out.print("digite a aqui 4: ");
        n4 = sc.nextDouble();

        media = (n1 + n2 + n3 + n4)/4;

        System.out.println("Media Final:" + media);

        if(media >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");

            }

            sc.close();
                
            }
}
