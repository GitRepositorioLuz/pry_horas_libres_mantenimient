package novedades.cont.viendo.series.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="PELICULAS")
public class PeliculasEntity   implements Serializable{
	
	private static final long serialVersionUID = 8889765510811719485L;
	
	@Id   
	@Column(name="ID_PELICULA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUnico")
	@SequenceGenerator(name = "seqUnico",allocationSize=1,sequenceName="SEQ_PELICULA")
	private long id_pelicula ;
	
	@Column(name="DESC_PELICULA")
	private String desc_pelicula ;
	
	@Column(name="ID_CATEGORIA")
	private long id_categoria ;
	
	@Column(name="ESTADO_PELICULA")
	private String estado_pelicula ;
	
	@Column(name="FEC_ESTRENO_PELICULA")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
	private LocalDateTime fec_estreno_pelicula ;
	
	@Column(name="FEC_REG_PELICULA")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
	private LocalDateTime fec_reg_pelicula ;
	
	@Column(name="FEC_MODIF_PELICULA")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "GMT-5:00")
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
		return "PeliculasEntity [id_pelicula=" + id_pelicula + ", desc_pelicula=" + desc_pelicula + ", id_categoria="
				+ id_categoria + ", estado_pelicula=" + estado_pelicula + ", fec_estreno_pelicula="
				+ fec_estreno_pelicula + ", fec_reg_pelicula=" + fec_reg_pelicula + ", fec_modif_pelicula="
				+ fec_modif_pelicula + "]";
	}

	
	
	
	
}
