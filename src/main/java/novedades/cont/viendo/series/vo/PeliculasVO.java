package novedades.cont.viendo.series.vo;

import java.io.Serializable;
import java.time.LocalDateTime;


public class PeliculasVO   implements Serializable{
	
	private static final long serialVersionUID = 8889765510811719485L;
	

	private long id_pelicula ;
	private String desc_pelicula ;
	private long id_categoria ;
	private String estado_pelicula ;
	private LocalDateTime fec_estreno_pelicula ;
	private LocalDateTime fec_reg_pelicula ;
	private LocalDateTime fec_modif_pelicula ;
	
	public long getId_pelicula() {
		return id_pelicula;
	}
	public void setId_pelicula(long id_pelicula) {
		this.id_pelicula = id_pelicula;
	}
	public String getDesc_pelicula() {
		return desc_pelicula;
	}
	public void setDesc_pelicula(String desc_pelicula) {
		this.desc_pelicula = desc_pelicula;
	}
	public long getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getEstado_pelicula() {
		return estado_pelicula;
	}
	public void setEstado_pelicula(String estado_pelicula) {
		this.estado_pelicula = estado_pelicula;
	}
	public LocalDateTime getFec_estreno_pelicula() {
		return fec_estreno_pelicula;
	}
	public void setFec_estreno_pelicula(LocalDateTime fec_estreno_pelicula) {
		this.fec_estreno_pelicula = fec_estreno_pelicula;
	}
	public LocalDateTime getFec_reg_pelicula() {
		return fec_reg_pelicula;
	}
	public void setFec_reg_pelicula(LocalDateTime fec_reg_pelicula) {
		this.fec_reg_pelicula = fec_reg_pelicula;
	}
	public LocalDateTime getFec_modif_pelicula() {
		return fec_modif_pelicula;
	}
	public void setFec_modif_pelicula(LocalDateTime fec_modif_pelicula) {
		this.fec_modif_pelicula = fec_modif_pelicula;
	}
	
	@Override
	public String toString() {
		return "PeliculasVO [id_pelicula=" + id_pelicula + ", desc_pelicula=" + desc_pelicula + ", id_categoria="
				+ id_categoria + ", estado_pelicula=" + estado_pelicula + ", fec_estreno_pelicula="
				+ fec_estreno_pelicula + ", fec_reg_pelicula=" + fec_reg_pelicula + ", fec_modif_pelicula="
				+ fec_modif_pelicula + "]";
	}


	
	
	
	
}
