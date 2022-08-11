
package mintic.reto5listo.Controlador;

import java.sql.SQLException;
import java.util.List;
import mintic.reto5listo.Modelo.*;
import java.util.ArrayList;


public class InformesController {
    
    private ProyectoLiderDao proyectoLiderDao;
    private ProyectoCasaCampestreDao proyectoCasaCampestreDao;
    private ProyectoComprasHomecenterDao proyectoComprasHomecenterDao;
    
    public InformesController(){

    proyectoLiderDao = new ProyectoLiderDao();
    proyectoCasaCampestreDao= new ProyectoCasaCampestreDao();
    proyectoComprasHomecenterDao= new ProyectoComprasHomecenterDao();
// instanciamos
}

    public List<ProyectoLiderVo> listar()throws SQLException{
    return proyectoLiderDao.listar();
    }
   
    public ArrayList<ProyectoCasaCampestreVo> conProyectoCasaCampestre () throws SQLException{
        return proyectoCasaCampestreDao.conProyectoCasaCampestre();
        
    }
    
     public ArrayList<ProyectoComprasHomecenterVo> comprasHomecenterSalento() throws SQLException{
        return proyectoComprasHomecenterDao.comprasHomecenterSalento();
     }   
    
}
