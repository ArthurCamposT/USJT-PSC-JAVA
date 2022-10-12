/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.com.bossini._usjt_psc_noite_cadastro_pessoas;

import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) {
        //1. Cadastrar 2. Atualizar 3. Apagar 4. Listar pessoas 0. Sair
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op){
                case 1:
                    
                    break;
                case 2:
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código?"));
                    String nome = JOptionPane.showInputDialog("Nome?");
                    String fone = JOptionPane.showInputDialog("Fone?");
                    String email = JOptionPane.showInputDialog("E-mail?");
                    Pessoa p = new Pessoa(codigo, nome, fone, email);
                    p.atualizar();
                    JOptionPane.showMessageDialog(null, "OK, atualizou!");
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 0:
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
            
        }while (op != 0);
    }
}







        //pegar o nome, fone e e-mail de uma pessoa junto ao usuário
        //construir um objeto do tipo Pessoa com esses dados
        //fazer o mapeamento objeto relacional para que esse objeto seja armazenado na base
//        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
//        String fone = JOptionPane.showInputDialog("Digite o fone da pessoa");
//        String email = JOptionPane.showInputDialog("Digite o email da pessoa");
//        
//        Pessoa pessoa = new Pessoa();
//        pessoa.setNome(nome);
//        pessoa.setFone(fone);
//        pessoa.setEmail(email);
//        
//        pessoa.inserir();
//        Connection conexao = fabricaConexoes.obterConexao();
//        ConnectionFactory fabricaConexoes = new ConnectionFactory();
//        System.out.println(conexao);