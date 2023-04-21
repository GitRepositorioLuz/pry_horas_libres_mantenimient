package novedades.cont.viendo.series.response;

import novedades.cont.viendo.series.vo.ActoresVO;


public class ActorMsgResponse {
		
	private CabeceraResponse cabeceraResponse;
	private ActoresVO actoresVO;
	private String mensaje;
	
	public CabeceraResponse getCabeceraResponse() {
		return cabeceraResponse;
	}
	public void setCabeceraResponse(CabeceraResponse cabeceraResponse) {
		this.cabeceraResponse = cabeceraResponse;
	}
	public ActoresVO getActoresVO() {
		return actoresVO;
	}
	public void setActoresVO(ActoresVO actoresVO) {
		this.actoresVO = actoresVO;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override
	public String toString() {
		return "ActorMsgResponse [cabeceraResponse=" + cabeceraResponse + ", actoresVO=" + actoresVO + ", mensaje="
				+ mensaje + "]";
	}
	

	
	
	
}
