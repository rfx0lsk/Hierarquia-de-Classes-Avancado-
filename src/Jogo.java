public class Jogo {
    private String nome;
    private double preco;
    private int genero;

    public Jogo(String nome, double preco, int genero){

    }

    public void nomeJogo(){
        System.out.println("Nome: "+ nome);
    }
    public void precoJogo(){
        System.out.println("Preço: "+preco);
    }
    public void generoJogo(){
        System.out.println("Gênero: "+ genero);
    }
}
