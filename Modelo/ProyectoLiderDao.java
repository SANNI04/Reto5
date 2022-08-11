
package mintic.reto5listo.Modelo;

import mintic.reto5listo.Util.Util;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//este es la clase que me genera directamente el proceso de comunicacion 
    //ella depente de el proyectoBancoVo porque es el que tiene la informacion  entonces lo importamos
public class ProyectoLiderDao {
      //como lo que va a extraer es varia informacion a la vez yo debo crear una variabble de tipo lista o arreglo que me permita almacenar esa info

    //realizo un metodo para que me devuelva una lista entonces

    public ArrayList <ProyectoLiderVo> listar() throws SQLException{
        ArrayList<ProyectoLiderVo> resultado1  = new ArrayList<>();

        Connection conn= Util.getConnection();
        
        try{
            
        String consulta1= "SELECT ID_Lider,Nombre,Primer_Apellido,Ciudad_Residencia from Lider l \n" 
        + "ORDER BY Ciudad_Residencia ASC ;";
        
        Statement stmt =conn.createStatement(); 
        ResultSet rs = stmt.executeQuery(consulta1);
        
        
        while (rs.next()){
        ProyectoLiderVo LiderC =new ProyectoLiderVo(
        
        rs.getInt("ID_Lider"),
        rs.getString("Nombre"),
        rs.getString("Primer_Apellido"),
        rs.getString("Ciudad_Residencia")
        );       
                
        resultado1.add(LiderC);   //lo adicianomos a respuesta
        
        }
        rs.close();
        stmt.close();
        
        }finally{
            if (conn != null){
                conn.close();
            }
        }
        
        return resultado1;
 
    }
}
   
  
