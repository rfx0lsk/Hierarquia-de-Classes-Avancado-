import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jogo a1 = new Acao("God of War (2018)", 199.90, 1);
        Jogo a2 = new Acao("Devil May Cry 5", 99.90, 1);
        Jogo a3 = new Acao("Bayonetta", 89.50, 1);

        Jogo b1 = new Luta("Tekken 8", 176.90, 2);
        Jogo b2 = new Luta("Street Fighter 6", 199.90, 2);
        Jogo b3 = new Luta("Mortal Kombat 1", 279.90, 2);

        Jogo c1 = new Roguelike("Cult of the Lamb", 64.95, 3);
        Jogo c2 = new Roguelike("Hades", 73.99, 3);
        Jogo c3 = new Roguelike("The Binding of Isaac", 30.99, 3);

        Jogo d1 = new RPG("The Witcher 3", 159.99, 4);
        Jogo d2 = new RPG("Cyberpunk 2077", 219.99, 4);
        Jogo d3 = new RPG("Baldur's Gate 3", 199.99, 4);

        Jogo e1 = new Sandbox("Minecraft", 149.00, 5);
        Jogo e2 = new Sandbox("Terraria", 32.99, 5);
        Jogo e3 = new Sandbox("Garry's Mod", 32.99, 5);

        Jogo f1 = new Terror("Resident Evil 7", 89.00, 6);
        Jogo f2 = new Terror("Outlast", 32.99, 6);
        Jogo f3 = new Terror("Amnesia: The Bunker", 88.99, 6);

        Jogo g1 = new VisualNovel("Danganronpa V3", 75.49, 7);
        Jogo g2 = new VisualNovel("Saya no Uta", 46.99, 7);
        Jogo g3 = new VisualNovel("Ace Attorney", 129.00, 7);

        ArrayList<Jogo> jogos = new ArrayList<>();

        jogos.add(a1);
        jogos.add(a2);
        jogos.add(a3);
        jogos.add(b1);
        jogos.add(b2);
        jogos.add(b3);
        jogos.add(c1);
        jogos.add(c2);
        jogos.add(c3);
        jogos.add(d1);
        jogos.add(d2);
        jogos.add(d3);
        jogos.add(e1);
        jogos.add(e2);
        jogos.add(e3);
        jogos.add(f1);
        jogos.add(f2);
        jogos.add(f3);
        jogos.add(g1);
        jogos.add(g2);
        jogos.add(g3);

        int opcao;

        do {
            System.out.println("\n===== CATÁLOGO DE JOGOS =====");
            System.out.println("1 - Buscar por nome");
            System.out.println("2 - Filtrar por gênero");
            System.out.println("3 - Filtrar por preço máximo");
            System.out.println("4 - Listar todos os jogos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do jogo: ");
                    String nome = sc.nextLine();
                    boolean encontrouNome = false;

                    for (Jogo jogo : jogos) {
                        if (jogo.getNome().toLowerCase().contains(nome.toLowerCase())) {
                            jogo.nomeJogo();
                            jogo.precoJogo();
                            encontrouNome = true;
                        }
                    }

                    if (!encontrouNome) {
                        System.out.println("Nenhum jogo encontrado.");
                    }
                    break;

                case 2:
                    System.out.println("\n1 - Ação");
                    System.out.println("2 - Luta");
                    System.out.println("3 - Roguelike");
                    System.out.println("4 - RPG");
                    System.out.println("5 - Sandbox");
                    System.out.println("6 - Terror");
                    System.out.println("7 - Visual Novel");
                    System.out.print("Escolha o gênero: ");

                    int genero = sc.nextInt();
                    boolean encontrouGenero = false;

                    if (genero < 1 || genero > 7) {
                        System.out.println("Gênero inválido.");
                        break;
                    }

                    for (Jogo jogo : jogos) {
                        if (jogo.getGenero() == genero) {
                            jogo.nomeJogo();
                            jogo.precoJogo();
                            encontrouGenero = true;
                        }
                    }

                    if (!encontrouGenero) {
                        System.out.println("Nenhum jogo encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o preço máximo: ");
                    double precoMaximo = sc.nextDouble();
                    boolean encontrouPreco = false;

                    for (Jogo jogo : jogos) {
                        if (jogo.getPreco() <= precoMaximo) {
                            jogo.nomeJogo();
                            jogo.precoJogo();
                            encontrouPreco = true;
                        }
                    }

                    if (!encontrouPreco) {
                        System.out.println("Nenhum jogo encontrado.");
                    }
                    break;

                case 4:
                    for (Jogo jogo : jogos) {
                        jogo.nomeJogo();
                        jogo.precoJogo();
                        jogo.generoJogo();
                        System.out.println("--------------------");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o catálogo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}