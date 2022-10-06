
package br.com.bossini._usjt_psc_noite_cadastro_pessoas;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {    
    private String usuario = "root";
    private String senha = "12345678";
    private String host = "localhost";
    private String porta = "3306";
    private String db = "20222_usjt_psc_noite_bd_pessoas";    
    
    public Connection obterConexao(){
        //string de conexão
        //jdbc:mysql://localhost:3306/20222_usjt_psc_noite_bd_pessoas
        //try/catch
        try{
            String stringConexao = String.format("jdbc:mysql://%s:%s/%s", host, porta, db );
            Connection conn = DriverManager.getConnection(stringConexao, usuario, senha);
            return conn;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }    
}
