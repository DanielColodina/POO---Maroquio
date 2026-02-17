package BancoCalifornia.Banco.com.src.services;

import BancoCalifornia.Banco.com.src.CadastroMenu;

public class ContaService {
    
    public CadastroMenu CriarConta(String nome, String sobrenome, int numero, int cpf) {
        return new CadastroMenu(nome, sobrenome, numero, cpf);
    }

    //Regras de negocios

}
