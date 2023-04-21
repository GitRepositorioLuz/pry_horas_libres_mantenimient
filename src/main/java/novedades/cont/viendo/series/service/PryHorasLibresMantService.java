package novedades.cont.viendo.series.service;


import novedades.cont.viendo.series.exception.UnprocessableEntityException;
import novedades.cont.viendo.series.response.ActorMsgResponse;
import novedades.cont.viendo.series.response.PeliculaMsgResponse;
import novedades.cont.viendo.series.response.SeriesMsgResponse;
import novedades.cont.viendo.series.vo.ActoresVO;
import novedades.cont.viendo.series.vo.PeliculasVO;
import novedades.cont.viendo.series.vo.SeriesVO;
import java.util.Map;

public interface PryHorasLibresMantService {
		
	void insertActores ( ActoresVO actoresVO) ;
	ActorMsgResponse consultActores(long id);
	ActorMsgResponse  modifActores(ActoresVO actoresVO);
	void deleteActores(long id);
	
	void insertPeliculas ( PeliculasVO peliculasVO) ;
	PeliculaMsgResponse consultPeliculas(long id);
	PeliculaMsgResponse  modifPeliculas(PeliculasVO peliculasVO);
	void deletePeliculas(long id);
	
	
	void insertSeries ( SeriesVO seriesVO) ;
	SeriesMsgResponse consultSeries(long id);
	SeriesMsgResponse  modifSeries( SeriesVO seriesVO);
	void deleteSeries(long id);
	
	
	Map<String, Object> listSeries(int page, int size);
	
	
}
