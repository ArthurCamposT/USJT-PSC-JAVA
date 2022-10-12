/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bossini._usjt_psc_noite_cadastro_pessoas;

import java.sql.*;

/**
 *
 * @author rodrigo
 */
public class Pessoa {
    //cod_pessoa INT
    private int codigo;
    
    //nome VARCHAR(200)
    private String nome;
    
    //fone VARCHAR(50)
    private String fone;
    
    //email VARCHAR(200)
    private String email;
    
    Pessoa (int codigo, String nome, String fone, String email){
        this.codigo = codigo;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }
    
    public void atualizar(){
        try{        
            //1. Especificar o comando SQL
            String sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE cod_pessoa = ?";
            //2. Abrir uma conexão com o MySQL
            Connection conexao = new ConnectionFactory().obterConexao();
            //3. Preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. Substituir os placeholders
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, codigo);        
            //5. Executar o comando
            ps.execute();
            //6. Fechar o comando e a conexão
            ps.close();
            conexao.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
    //cláusula catch or declare    
    public void inserir(){
        try{        
            //não faça isso!
            //String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES( '" + nome + "', " + fone + ", '" + email + "')";
            //1. Especificar o comando SQL
            String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
            //2. Abrir uma conexão com o MySQL
            ConnectionFactory conexaoFactory = new ConnectionFactory();
            Connection conexao = conexaoFactory.obterConexao();
            //3. Pré compilar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. Preencher os dados faltantes (substituir os placeholders)
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);        
            //5. Executar o comando
            ps.execute();        
            //6. Fechar a conexão
            ps.close();
            conexao.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
