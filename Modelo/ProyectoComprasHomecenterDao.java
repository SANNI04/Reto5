
package mintic.reto5listo.Modelo;
import mintic.reto5listo.Util.Util;
        
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProyectoComprasHomecenterDao {
    
    public ArrayList <ProyectoComprasHomecenterVo> comprasHomecenterSalento() throws SQLException{
        ArrayList<ProyectoComprasHomecenterVo> resultado3  = new ArrayList<>();

        Connection conn= Util.getConnection();
        
        try{
            
        String consulta3= " SELECT ID_Compra,p.Constructora,p.Banco_Vinculado from Compra c\n" +
                          "JOIN proyecto p \n" +
                          "ON c.ID_Proyecto = p.ID_Proyecto\n" +
                          "WHERE Proveedor = 'Homecenter' AND p.Ciudad='Salento';";
        
        Statement stmt =conn.createStatement(); 
        ResultSet rs = stmt.executeQuery(consulta3);
        
        
        while (rs.next()){
        ProyectoComprasHomecenterVo HomSalento =new ProyectoComprasHomecenterVo(
        
        rs.getInt("ID_Compra"),
        rs.getString("Constructora"),
        rs.getString("Banco_Vinculado")
        );       
                
        resultado3.add(HomSalento);   //lo adicianomos a respuesta
        
        }
        rs.close();
        stmt.close();
        
        }finally{
            if (conn != null){
                conn.close();
            }
        }
        
        return resultado3;
 
    }
}
   
    

