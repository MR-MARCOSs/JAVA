import java.util.Scanner;
import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        Condominio condominio = new Condominio();
        
        
        int i = 1;
        while(i<16){
        condominio.getDisponiveis().add(i);
        i++;
        }
        System.out.println(condominio.getDisponiveis().size());
        
        while (opcao != 4){
            System.out.println("====== MENU ======");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Reservar unidade");
            System.out.println("2 - Consultar disponíveis");

            System.out.println("3 - Consultar apartamento");
            System.out.println("4 - Encerrar");
            opcao = scanner.nextInt();
            

            switch (opcao){
                case 1:
                    System.out.println("Insira o N° que deseja:");

                    int apto = scanner.nextInt();

                    if (condominio.getDisponiveis().contains(apto)){
                        condominio.getDisponiveis().remove(Integer.valueOf(apto));
                    }
                    else {
                        System.out.println("ap não disponivel ou inváido");
                        break;
                    }
                    
                    
                    System.out.println("insira seu nome");
                    String nome = scanner.next();

                    System.out.println("Insira seu RG");
                    Double rg = scanner.nextDouble();

                    System.out.println("insira seu cpf");
                    Double cpf = scanner.nextDouble();

                    System.out.println("insira seu cep");
                    Double cep = scanner.nextDouble(); 
                    
                    System.out.println("insira seu telefone");
                    Double tel = scanner.nextDouble();
                    
                    System.out.println("Insira seu email");
                    String ema = scanner.next();

                    String acomp;
                    System.out.println("Terá acompanhamte? s/n");
                    Locatario locatario = new Locatario();
                    
                    acomp = scanner.next();
                        while (acomp.equals("s")) {
                            System.out.println("Insira o nome dele");
                            String nomeAc = scanner.next();
                            System.out.println("Seu parentesco com ele");
                            String parentesco = scanner.next();
                            System.out.println("O rg dele");
                            Double rgAc = scanner.nextDouble();
                            System.out.println("Mais algum acompanhantem? s/n");
                            acomp = scanner.next();
                            Acompanhantes acompanhantes = new Acompanhantes();

                            acompanhantes.setNomeAc(nomeAc);
                            acompanhantes.setParentesco(parentesco);
                            acompanhantes.setRgAc(rgAc);
                            acompanhantes.setApto(apto);
                            locatario.addAc(acompanhantes);

                        }
                    

                    locatario.setApto(apto);
                    locatario.setNome(nome);
                    locatario.setRg(rg);
                    locatario.setCpf(cpf);
                    locatario.setCep(cep);
                    locatario.setTelefone(tel);
                    locatario.setEmail(ema);
                    condominio.addLocatario(locatario);

                    condominio.setLocatario(locatario);


                    


                    break;
                case 2:
                    System.out.println("Os disponiveis são:");
                    int x=0;
                    int disp =condominio.getDisponiveis().size();
                    for (int g =0;g<disp;g++) {
                        System.out.println(condominio.getDisponiveis().get(x));
                        x++;
                    }

                    break;
                case 3:
        
                    System.out.println("Insira o número do apartamento que deseja consultar");
                    int naoDisp = scanner.nextInt();

                    int o=0;
                    
                    for (Locatario Locatario : condominio.getNaoDisponiveis()){
                    if (Locatario.getApto()==naoDisp){
                        

                        
                        System.out.println("O morador é " + Locatario.getNome() + " e tem o cpf " + Locatario.getCpf() + " e o rg " + Locatario.getRg());
                        for(Acompanhantes Acompanhantes : Locatario.getListaAc()){
                        if (Acompanhantes.getApto()==naoDisp){
                            o++;
                            System.out.println("O aconpanhante " + o + " Se chama " + Acompanhantes.getNomeAc());


                            }
                        }
                    }
                }
                    
                    break;
                case 4:
                    System.out.println("Encerrado");
                    break;
                    
                    

                default:
                    System.out.println("opcao invalida");
                    break;
            }

        }
    }
}
    
