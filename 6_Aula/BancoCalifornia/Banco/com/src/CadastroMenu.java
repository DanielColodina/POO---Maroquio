package BancoCalifornia.Banco.com.src;

public class CadastroMenu {
    
    
    private String nome;
    private String sobrenome;
    private long numero;
    private long cpf;

    //Entrada de dados 
    public CadastroMenu (String nome, String sobrenome, long numero, long cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;
        this.cpf = cpf;
    }

    public void exibirCad() {
    
        System.out.println("****************************************************");

        System.out.println("Seja Bem-Vinda: " + nome );
        System.out.println("Sobrenome de Media renda: " + sobrenome);
        System.out.println("Seu numeo para contato então é: " + numero);
        System.out.println("Seu cpf esta guardado em segredo: " + cpf);
    }

}
