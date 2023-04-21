package novedades.cont.viendo.series.entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name="ACTORES")
@Entity

public class ActoresEntity  implements Serializable{
		
	private static final long serialVersionUID = 8889765510811719485L;
	
	@Id   
	@Column(name="ID_ACTORES")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUnico")
	@SequenceGenerator(name = "seqUnico",allocationSize=1,sequenceName="SEQ_ACTORES")
	private long id_actores ;
	
	@Column(name="ID_ACTOR")
	private long id_actor;
	
	@Column(name="DESC_SERIE_PEL")
	 private String   desc_serie_pel ;
	
	@Column(name="ID_SERIE_PEL")
	private long id_serie_pel;
	
	
	@Column(name="ESTADO_ACTORES")
	 private String   estado_actores ;
	
	
	@Column(name="FEC_REG_ACTORES")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
	 private LocalDateTime  fec_reg_actores ;
	
	@Column(name="FEC_MODIF_ACTORES")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
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

	public long getId_serie_pel() {
		return id_serie_pel;
	}

	public void setId_serie_pel(long id_serie_pel) {
		this.id_serie_pel = id_serie_pel;
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

	@Override
	public String toString() {
		return "ActoresEntity [id_actores=" + id_actores + ", id_actor=" + id_actor + ", desc_serie_pel="
				+ desc_serie_pel + ", id_serie_pel=" + id_serie_pel + ", estado_actores=" + estado_actores
				+ ", fec_reg_actores=" + fec_reg_actores + ", fec_modif_actores=" + fec_modif_actores + "]";
	}
	
	
	
	
}
