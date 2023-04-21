package novedades.cont.viendo.series.response;


import novedades.cont.viendo.series.vo.PeliculasVO;

public class PeliculaMsgResponse {
	
	private CabeceraResponse cabeceraResponse;
	private PeliculasVO peliculasVO;
	private String mensaje;
	
	public CabeceraResponse getCabeceraResponse() {
		return cabeceraResponse;
	}
	public void setCabeceraResponse(CabeceraResponse cabeceraResponse) {
		this.cabeceraResponse = cabeceraResponse;
	}
	public PeliculasVO getPeliculasVO() {
		return peliculasVO;
	}
	public void setPeliculasVO(PeliculasVO peliculasVO) {
		this.peliculasVO = peliculasVO;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	@Override
	public String toString() {
		return "PeliculaMsgResponse [cabeceraResponse=" + cabeceraResponse + ", peliculasVO=" + peliculasVO
				+ ", mensaje=" + mensaje + "]";
	}

	
}
