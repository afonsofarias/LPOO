

package quitanda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexaoDB {

private String servidor = "ns110.hostgator.com.br:3306";
private String baseDeDados = "atcsol18_quitanda";
private String url = "jdbc:mysql://" + servidor + "/" +baseDeDados; 
private String driver = "com.mysql.cj.jdbc.Driver";
private String usuario = "atcsol18_afonso";
private String senha = "Quitanda2021.";
public Connection conexao; 


public void ConectarDB(){
    try {
        Class.forName(driver);
        conexao = DriverManager.getConnection(url,usuario,senha);
        System.out.println("Conexão feita com sucesso!!");
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE, null, ex);
    }
}


public void DesconectarDB(){
    try {
        conexao.close();
        System.out.println("Desconectado do Banco de Dados!!");
    } catch (SQLException ex) {
        Logger.getLogger(ConexaoDB.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    
}
