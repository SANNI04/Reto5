
package mintic.reto5listo.Modelo;

import mintic.reto5listo.Util.Util;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ProyectoCasaCampestreDao {
    
    public ArrayList<ProyectoCasaCampestreVo> conProyectoCasaCampestre() throws SQLException{
        
        ArrayList<ProyectoCasaCampestreVo> resultado2 = new ArrayList<>();
        
        Connection conn= Util.getConnection();
     
            try{
                
                String consulta2= "SELECT ID_Proyecto,Constructora,Numero_Habitaciones,Ciudad from proyecto WHERE Ciudad IN ('Santa Marta','Cartagena','Barranquilla')\n" +
                "AND  Clasificacion ='Casa Campestre';";
        
                Statement stmt =conn.createStatement(); 
                ResultSet rs = stmt.executeQuery(consulta2);
                
                while(rs.next()){
                    ProyectoCasaCampestreVo casaC = new ProyectoCasaCampestreVo(
                            
                        rs.getInt("ID_Proyecto"),
                        rs.getString("Constructora"),
                        rs.getDouble("Numero_Habitaciones"),
                        rs.getString("Ciudad")
                        );
                    
                        resultado2.add(casaC);
                }
                rs.close();
                stmt.close();
            }finally{
                
                if (conn != null){
                    conn.close();
                }
            }
    
            return resultado2;
    }
           
}

