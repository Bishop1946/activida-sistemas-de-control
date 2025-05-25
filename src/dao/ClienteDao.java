
package dao;

import config.Databaseconnection;
import models.Cliente;
import java.sql.*;




public class ClienteDao {
    
    public void agregarCliente(Cliente Cliente){
        String sql = "INSERT INTO clientes (nombre, email, telefono, direccion) VALUES (?, ?, ?, ?)";
        try (Connection conn = Databaseconnection.getConnection();
                 
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, Cliente.getNombre());
            stmt.setString(2, Cliente.getEmail());
            stmt.setString(3, Cliente.getTelefono());
            stmt.setString(4, Cliente.getDireccion());
            
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0){
                
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()){
                    
                    
                    
                    if (generatedKeys.next()){
                        
                    }
                        
                       
                        
                    
                }
            }
            
            
             
         }
            
        
    }
    
}
