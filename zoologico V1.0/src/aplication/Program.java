package aplication;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entites.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String especie;
        String nome;
        String corPredominante;
        String sexo;

        int escolha;
        int contadorAve = 0;
        int idAnimal = 0;
        int contadorMamifero= 0;
        int contadorRepteis= 0;
        int contadorPeixes= 0;
        int contadorAnfibios= 0;

        do {
            System.out.println("---------------BEM VINDO---------------");
            System.out.println("----CENTRAL DE CADASTRO DE ANIMAIS-----");
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.print("\n");
            System.out.println("Selecione a classe do animal: ");
            System.out.println("1 - MAMÍFEROS ");
            System.out.println("2 - AVES ");
            System.out.println("3 - RÉPTEIS ");
            System.out.println("4 - PEIXES ");
            System.out.println("5 - ANFÍBIOS ");
            System.out.print("Opção: ");
            int classe = sc.nextInt();

            switch (classe) {

                case 1:

                    Scanner m = new Scanner(System.in);
                    System.out.println("\n-------Cadastro de Mamíferos-------\n");
                    System.out.println("Digite a espécie do animal: ");
                    especie = m.nextLine();
                    System.out.println("Digite o nome do animal: ");
                    nome = m.nextLine();
                    System.out.println("Digite a Cor Predominante do animal: ");
                    corPredominante = m.nextLine();
                    System.out.println("Digite o sexo do animal: ");
                    sexo = m.nextLine();
                    System.out.println("Digite a tipo de pelagem: ");
                    String tipoPelagem = m.nextLine();


                    Mamiferos newMamifero = new Mamiferos(nome, especie, corPredominante, sexo, tipoPelagem);
                    contadorMamifero++;
                    idAnimal++;
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Registro_de_Mamiferos.txt", true))) {

                        writer.write("Mamífero - Nº " +contadorMamifero+"\n");
                        writer.write("ID DO ANIMAL: " +idAnimal+"\n");
                        writer.write("Espécie: " + newMamifero.getEspecie() + "\n");
                        writer.write("Nome: " + newMamifero.getNome() + "\n");
                        writer.write("Cor Predominante: " + newMamifero.getCorPredominate() + "\n");
                        writer.write("Sexo: " + newMamifero.getSexo() + "\n");
                        writer.write("Tipo de Pelagem: " + newMamifero.getTipoPelagem() + "\n");
                        writer.write("\n");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:

                    Scanner a = new Scanner(System.in);
                    System.out.println("\n-------Cadastro de Aves-------\n");
                    System.out.println("Digite o nome do animal: ");
                    nome = a.nextLine();
                    System.out.println("Digite a espécie do animal: ");
                    especie = a.nextLine();
                    System.out.println("Digite a Cor Predominante do animal: ");
                    corPredominante = a.nextLine();
                    System.out.println("Digite o sexo do animal: ");
                    sexo = a.nextLine();
                    System.out.println("Digite a cor do bico: ");
                    String corDoBico = a.nextLine();
                    System.out.println("Digite a quantidade média que a espécie põe: ");
                    int qtdDeOvos = a.nextInt();

                    Aves newAve = new Aves(nome, especie, corPredominante, sexo, corDoBico, qtdDeOvos);
                    contadorAve++;
                    idAnimal++;
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Registro_de_Aves.txt", true))) {

                        writer.write("Ave - Nº " +contadorAve+"\n");
                        writer.write("ID DO ANIMAL: " +idAnimal+"\n");
                        writer.write("Nome: " + newAve.getNome() + "\n");
                        writer.write("Espécie: " + newAve.getEspecie() + "\n");
                        writer.write("Cor Predominante: " + newAve.getCorPredominate() + "\n");
                        writer.write("Sexo: " + newAve.getSexo() + "\n");
                        writer.write("Cor do Bico: " + newAve.getCorDoBico() + "\n");
                        writer.write("Quantidade Média de Ovos: " + newAve.getQntDeOvos() + "\n");
                        writer.write("\n");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 3:

                    Scanner r = new Scanner(System.in);
                    System.out.println("\n-------Cadastro de Mamíferos-------\n");
                    System.out.println("Digite a espécie do animal: ");
                    especie = r.nextLine();
                    System.out.println("Digite o nome do animal: ");
                    nome = r.nextLine();
                    System.out.println("Digite a Cor Predominante do animal: ");
                    corPredominante = r.nextLine();
                    System.out.println("Digite o sexo do animal: ");
                    sexo = r.nextLine();



                    Repteis newReptil = new Repteis(nome, especie, corPredominante, sexo);
                    contadorRepteis++;
                    idAnimal++;
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Registro_de_Repteis.txt", true))) {

                        writer.write("Réptil - Nº " +contadorRepteis+"\n");
                        writer.write("ID DO ANIMAL: " +idAnimal+"\n");
                        writer.write("Espécie: " + newReptil.getEspecie() + "\n");
                        writer.write("Nome: " + newReptil.getNome() + "\n");
                        writer.write("Cor Predominante: " + newReptil.getCorPredominate() + "\n");
                        writer.write("Sexo: " + newReptil.getSexo() + "\n");
                        writer.write("\n");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    Scanner p = new Scanner(System.in);
                    System.out.println("\n-------Cadastro de Mamíferos-------\n");
                    System.out.println("Digite a espécie do animal: ");
                    especie = p.nextLine();
                    System.out.println("Digite o nome do animal: ");
                    nome = p.nextLine();
                    System.out.println("Digite a Cor Predominante do animal: ");
                    corPredominante = p.nextLine();
                    System.out.println("Digite o sexo do animal: ");
                    sexo = p.nextLine();



                    Peixes newPeixe = new Peixes(nome, especie, corPredominante, sexo);
                    contadorPeixes++;
                    idAnimal++;
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Registro_de_Peixes.txt", true))) {

                        writer.write("Peixe - Nº " +contadorPeixes+"\n");
                        writer.write("ID DO ANIMAL: " +idAnimal+"\n");
                        writer.write("Espécie: " + newPeixe.getEspecie() + "\n");
                        writer.write("Nome: " + newPeixe.getNome() + "\n");
                        writer.write("Cor Predominante: " + newPeixe.getCorPredominate() + "\n");
                        writer.write("Sexo: " + newPeixe.getSexo() + "\n");
                        writer.write("\n");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    Scanner an = new Scanner(System.in);
                    System.out.println("\n-------Cadastro de Mamíferos-------\n");
                    System.out.println("Digite a espécie do animal: ");
                    especie = an.nextLine();
                    System.out.println("Digite o nome do animal: ");
                    nome = an.nextLine();
                    System.out.println("Digite a Cor Predominante do animal: ");
                    corPredominante = an.nextLine();
                    System.out.println("Digite o sexo do animal: ");
                    sexo = an.nextLine();




                    Anfibios newAnfibio = new Anfibios(nome, especie, corPredominante, sexo);
                    contadorAnfibios++;
                    idAnimal++;
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Registro_de_Anfibios.txt", true))) {

                        writer.write("Anfíbio - Nº " +contadorAnfibios+"\n");
                        writer.write("ID DO ANIMAL: " +idAnimal+"\n");
                        writer.write("Espécie: " + newAnfibio.getEspecie() + "\n");
                        writer.write("Nome: " + newAnfibio.getNome() + "\n");
                        writer.write("Cor Predominante: " + newAnfibio.getCorPredominate() + "\n");
                        writer.write("Sexo: " + newAnfibio.getSexo() + "\n");
                        writer.write("\n");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

            }

            System.out.println("Deseja cadastrar novo animal? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            escolha = sc.nextInt();
        } while (escolha == 1);

    }

}
