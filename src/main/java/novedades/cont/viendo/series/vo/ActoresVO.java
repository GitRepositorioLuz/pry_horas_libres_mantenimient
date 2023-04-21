package novedades.cont.viendo.series.vo;
import java.io.Serializable;
import java.time.LocalDateTime;



public class ActoresVO  implements Serializable{
		
	private static final long serialVersionUID = 8889765510811719485L;

	private long id_actores ;

	private long id_actor;
	 private String   desc_serie_pel ;
	 private String   estado_actores ;
	 private long id_serie_pel;
	 private LocalDateTime  fec_reg_actores ;
	 private LocalDateTime  fec_modif_actores ;
	public long getId_actores() {
		return id_actores;
	}
	public void setId_actores(long id_actores) {
		this.id_actores = id_actores;
	}
	public long getId_actor() {
		return id_actor;
	}
	public void setId_actor(long id_actor) {
		this.id_actor = id_actor;
	}
	public String getDesc_serie_pel() {
		return desc_serie_pel;
	}
	public void setDesc_serie_pel(String desc_serie_pel) {
		this.desc_serie_pel = desc_serie_pel;
	}
	public String getEstado_actores() {
		return estado_actores;
	}
	public void setEstado_actores(String estado_actores) {
		this.estado_actores = estado_actores;
	}
	public LocalDateTime getFec_reg_actores() {
		return fec_reg_actores;
	}
	public void setFec_reg_actores(LocalDateTime fec_reg_actores) {
		this.fec_reg_actores = fec_reg_actores;
	}
	public LocalDateTime getFec_modif_actores() {
		return fec_modif_actores;
	}
	public void setFec_modif_actores(LocalDateTime fec_modif_actores) {
		this.fec_modif_actores = fec_modif_actores;
	}
	public long getId_serie_pel() {
		return id_serie_pel;
	}
	public void setId_serie_pel(long id_serie_pel) {
		this.id_serie_pel = id_serie_pel;
	}
	
	@Override
	public String toString() {
		return "ActoresVO [id_actores=" + id_actores + ", id_actor=" + id_actor + ", desc_serie_pel=" + desc_serie_pel
				+ ", estado_actores=" + estado_actores + ", id_serie_pel=" + id_serie_pel + ", fec_reg_actores="
				+ fec_reg_actores + ", fec_modif_actores=" + fec_modif_actores + "]";
	}
	
	
	


	
	
	
}
