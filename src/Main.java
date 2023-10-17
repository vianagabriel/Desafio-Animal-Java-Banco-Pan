import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String categoria;
        String subCategoria;
        String alimentacao = "";

        System.out.println("Digite a categoria: (Vertebrado ou Invertebrado)");
        categoria = sc.nextLine();

        if (categoria.equals("Vertebrado")) {
            System.out.println("Digite a sub-categoria: (Ave ou Mamifero)");
            subCategoria = sc.nextLine();

            if (subCategoria.equals("Ave")) {
                System.out.println("Digite o tipo de alimentação: (Carnivoro ou Onivoro)");
                alimentacao = sc.nextLine();
                if (alimentacao.equals("Carnivoro")) {
                    System.out.println("Águia");
                } else if (alimentacao.equals("Onivoro")) {
                    System.out.println("Pomba");
                } else {
                    System.out.println("Tipo de alimentação inválido para a sub-categoria Ave.");
                }
            } else if (subCategoria.equals("Mamifero")) {
                System.out.println("Digite o tipo de alimentação: (Onivoro, Herbivoro)");
                alimentacao = sc.nextLine();
                if (alimentacao.equals("Onivoro")) {
                    System.out.println("Homem");
                } else if(alimentacao.equals("Herbivoro")){
                    System.out.println("Vaca");
                } else {
                    System.out.println("Tipo de alimentação inválido para a sub-categoria Mamifero.");
                }
            } else {
                System.out.println("Subcategoria inválida.");
            }
        } else if (categoria.equals("Invertebrado")) {
            System.out.println("Digite a sub-categoria: (Inseto ou Anelideo)");
            subCategoria = sc.nextLine();

            if (subCategoria.equals("Inseto")) {
                System.out.println("Digite o tipo de alimentação: (Onivoro ou Hematofago)");
                alimentacao = sc.nextLine();
                if (alimentacao.equals("Onivoro")) {
                    System.out.println("Minhoca");
                } else if (alimentacao.equals("Hematofago")) {
                    System.out.println("Pulga");
                } else {
                    System.out.println("Tipo de alimentação inválido para a sub-categoria Inseto.");
                }
            } else if (subCategoria.equals("Anelideo")) {
                System.out.println("Digite o tipo de alimentação: (Hematofago ou Onivoro)");
                alimentacao = sc.nextLine();
                if (alimentacao.equals("Hematofago")) {
                    System.out.println("Sanguessuga");
                } else if (alimentacao.equals("Onivoro")) {
                    System.out.println("Minhoca");
                } else {
                    System.out.println("Tipo de alimentação inválido para a sub-categoria Anelideo.");
                }
            } else {
                System.out.println("Subcategoria inválida.");
            }
        } else {
            System.out.println("Categoria inválida.");
        }
    }
}
