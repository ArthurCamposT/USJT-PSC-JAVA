/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.bossini._usjt_psc_noite_cadastro_pessoas;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        //pegar o nome, fone e e-mail de uma pessoa junto ao usuário
        //construir um objeto do tipo Pessoa com esses dados
        //fazer o mapeamento objeto relacional para que esse objeto seja armazenado na base
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
        String fone = JOptionPane.showInputDialog("Digite o fone da pessoa");
        String email = JOptionPane.showInputDialog("Digite o email da pessoa");
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setFone(fone);
        pessoa.setEmail(email);
    }
}







//        Connection conexao = fabricaConexoes.obterConexao();
//        ConnectionFactory fabricaConexoes = new ConnectionFactory();
//        System.out.println(conexao);