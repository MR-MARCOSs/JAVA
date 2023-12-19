import java.util.Scanner;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        int escolha=0;
        cadastroDeLivro Livro = new cadastroDeLivro();
        
        while (escolha!=5){
            Scanner menu = new Scanner(System.in);
            System.out.println("\nEscolha uma das opções de acordo com o número\n1 - Cadastrar livros\n2 - Cadastrar usuário\n3 - Empréstimo\n4 - Devolução\n5 - Sair\n");
            escolha = menu.nextInt();
            
            if (escolha==1){
                
                
                Scanner ScanLivro = new Scanner(System.in);

                System.out.println("Qual nome do livro?");
                String nome = ScanLivro.nextLine();
                System.out.println("Qual gênero?");
                String genero = ScanLivro.nextLine();
                System.out.println("Qual autor?");
                String autor = ScanLivro.nextLine();
                System.out.println("Qual ano de lançamento?");
                int lancado = ScanLivro.nextInt();

                

                Livro.setNomeLivro(nome);
                Livro.setAutor(autor);
                Livro.setGênero(genero);
                Livro.setLancado(lancado);

                Livro.cadastrado(nome);
                
                
            }
            else if (escolha==2){
                cadastroDeLeitor leitor = new cadastroDeLeitor();
                Scanner ScanLeitor = new Scanner(System.in);

                System.out.println("Insira seu nome: ");
                String nomeLeitor = ScanLeitor.nextLine();
                System.out.println("insira seu sexo: ");
                String sexoLeitor = ScanLeitor.nextLine();
                System.out.println("Insira sua idade: ");
                int idadeLeitor = ScanLeitor.nextInt();

                leitor.setNome(nomeLeitor);
                leitor.setIdade(idadeLeitor);
                leitor.setSexo(sexoLeitor);

                leitor.leitorCadastrado();


            }
            else if (escolha==3){
                
                int var = 0;
                while (var!=1){
                    Scanner emprestimoScan = new Scanner(System.in);
                    System.out.println("Livros disponíveis:\n"+ Livro.getLivros());
                    System.out.println("Para voltar digite voltar\nInsira o livro desejado pelo nome:");
                    String escolhido = emprestimoScan.nextLine();
                    if (Livro.getLivros().contains(escolhido)) {
                        System.out.printf("Livro %s escolhido, Tem 7 dias para devolver", escolhido);
                        Livro.remover(escolhido);
                        break;
                    
                    }
                    else if (escolhido.equals("voltar")) {
                        break;
                    }
                    else {System.out.println("livro não encontrado! tente novamente ou digite 'voltar' para voltar");}

                    
                }
                


            }
            else if (escolha==4){
                int var=0;
                while (var!=1) {
                    Scanner devolucaoScan = new Scanner(System.in);
                    System.out.println("para voltar digite voltar\ninsira o nome do livro que deseja devolver: ");
                    String devolvido = devolucaoScan.nextLine();
                    if (Livro.getLivrosPegos().contains(devolvido)) {
                        System.out.println("Livro devolvido com sucesso!");
                        Livro.devolver(devolvido);
                        break;
                    }
                    else if (devolvido.equals("voltar")) {
                        break;
                    }
                    else{
                        System.out.println("Esse livro não foi pego na biblioteca! tente novamente ou digite 'voltar' para voltar");
                    }
                }
                    
                }
            

            else if (escolha==5){
                System.out.println("INTÉ");
                break;
            }
            else {
                System.out.println("Opção inválida");
            }
        }

    }
    
}
