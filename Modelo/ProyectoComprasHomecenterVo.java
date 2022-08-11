
package mintic.reto5listo.Modelo;

public class ProyectoComprasHomecenterVo {
    
    private Integer IdCompra;
    private String Constructora;
    private String BancoVinculado;

    public ProyectoComprasHomecenterVo(Integer IdCompra, String Constructora, String BancoVinculado) {
        this.IdCompra = IdCompra;
        this.Constructora = Constructora;
        this.BancoVinculado = BancoVinculado;
    }
    
    

    public Integer getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(Integer IdCompra) {
        this.IdCompra = IdCompra;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public String getBancoVinculado() {
        return BancoVinculado;
    }

    public void setBancoVinculado(String BancoVinculado) {
        this.BancoVinculado = BancoVinculado;
    }
    
    
    
}
