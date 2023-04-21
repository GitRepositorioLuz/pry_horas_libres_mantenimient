package novedades.cont.viendo.series.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import novedades.cont.viendo.series.entity.ActoresEntity;
import novedades.cont.viendo.series.entity.PeliculasEntity;
import novedades.cont.viendo.series.entity.SeriesEntity;
import novedades.cont.viendo.series.repository.ActoresRepository;
import novedades.cont.viendo.series.repository.PeliculasRepository;
import novedades.cont.viendo.series.repository.SeriesRepository;
import novedades.cont.viendo.series.response.ActorMsgResponse;
import novedades.cont.viendo.series.response.CabeceraResponse;
import novedades.cont.viendo.series.response.PeliculaMsgResponse;
import novedades.cont.viendo.series.response.SeriesMsgResponse;
import novedades.cont.viendo.series.service.PryHorasLibresMantService;
import novedades.cont.viendo.series.vo.ActoresVO;
import novedades.cont.viendo.series.vo.PeliculasVO;
import novedades.cont.viendo.series.vo.SeriesVO;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Service
public class PryHorasLibresMantServiceImpl implements PryHorasLibresMantService{
	
	@Autowired
	private ActoresRepository actoresReposit;
	
	@Autowired
	private PeliculasRepository peliculasReposi;
	
	@Autowired
	private SeriesRepository seriesRepository;
	
	@Override
	public void insertActores(ActoresVO actoresVO) {
		try {
			LocalDateTime localDateTime = LocalDateTime.now();

			
			ActoresEntity actoresEnt =new ActoresEntity();
			actoresEnt= this.getEntityActores(actoresVO);
			actoresEnt.setFec_reg_actores(localDateTime);
			actoresEnt.setFec_modif_actores(localDateTime);
			
			actoresReposit.save(actoresEnt);
		}
		catch(Exception e) {
			System.out.println("Error al insertar => " + e.getMessage());
		}
		
	}

	@Override
	public ActorMsgResponse consultActores(long id) {
		CabeceraResponse cabecResponse = new CabeceraResponse();
		ActorMsgResponse msgResponse = new ActorMsgResponse();
		ActoresEntity actoresEntity = new ActoresEntity();
		
		actoresEntity = actoresReposit.getById(id);
		
		cabecResponse.setCodigo(200);
		cabecResponse.setIdRastreo("Exito en consulta de Actores :"+id);
			
			msgResponse.setCabeceraResponse(cabecResponse);
			msgResponse.setMensaje("Registro consultado existe");

			msgResponse.setActoresVO(this.getActoresVO(actoresEntity));
			
			return msgResponse;
	}

	@Override
	public ActorMsgResponse modifActores(ActoresVO actoresVO) {
		CabeceraResponse cabecResponse = new CabeceraResponse();
		ActorMsgResponse msgResponse = new ActorMsgResponse();
		
		ActoresEntity actoresEntity = new ActoresEntity();
		actoresEntity= this.getEntityActores(actoresVO);
		
		actoresReposit.save(actoresEntity);
		
		cabecResponse.setCodigo(200);
		cabecResponse.setIdRastreo("Exito en modificacion:"+actoresVO.getId_actor());
			
			msgResponse.setCabeceraResponse(cabecResponse);
			msgResponse.setMensaje("Registro modificado");

			msgResponse.setActoresVO(this.getActoresVO(actoresEntity));
			
			return msgResponse;
	}

	@Override
	public void deleteActores(long id) {
		try {
			System.out.println("Exito al eliminar id: " + id);
			actoresReposit.deleteById(id);

		}
	
		catch(Exception e) {
			System.out.println("Error => " + e.getMessage());
		}
		
	}
	
	private ActoresEntity getEntityActores(ActoresVO actoresVO) {
		ActoresEntity actoresEntity = new ActoresEntity();
		BeanUtils.copyProperties(actoresVO, actoresEntity);
		return actoresEntity;
	}
	private ActoresVO getActoresVO(ActoresEntity actoresEntity)  {
		
		ActoresVO actoresVO=new ActoresVO();
		BeanUtils.copyProperties(actoresEntity,actoresVO);
			
		return actoresVO;
	}
//	------------------------------------

	@Override
	public void insertPeliculas(PeliculasVO peliculasVO) {
		try {
			LocalDateTime localDateTime = LocalDateTime.now();

			
			PeliculasEntity peliculasEntity =new PeliculasEntity();
			peliculasEntity= this.getEntityPeliculas(peliculasVO);
			peliculasEntity.setFec_estreno_pelicula(localDateTime);
			peliculasEntity.setFec_reg_pelicula(localDateTime);
			peliculasEntity.setFec_modif_pelicula(localDateTime);
			
			peliculasReposi.save(peliculasEntity);
		}
		catch(Exception e) {
			System.out.println("Error al insertar => " + e.getMessage());
		}
		
	}

	@Override
	public PeliculaMsgResponse consultPeliculas(long id) {
		CabeceraResponse cabecResponse = new CabeceraResponse();
		PeliculaMsgResponse PelMsgResponse = new PeliculaMsgResponse();
		PeliculasEntity peliculasEntity = new PeliculasEntity();
		
		peliculasEntity = peliculasReposi.getById(id);
		
		cabecResponse.setCodigo(200);
		cabecResponse.setIdRastreo("Exito en consulta de Peliculas :"+id);
			
		PelMsgResponse.setCabeceraResponse(cabecResponse);
		PelMsgResponse.setMensaje("Registro consultado existe");

		PelMsgResponse.setPeliculasVO(this.getPeliculasVO(peliculasEntity));
			
			return PelMsgResponse;
	}

	@Override
	public PeliculaMsgResponse modifPeliculas(PeliculasVO peliculasVO) {
		CabeceraResponse cabecResponse = new CabeceraResponse();
		PeliculaMsgResponse PelMsgResponse = new PeliculaMsgResponse();
		
		PeliculasEntity peliculasEntity = new PeliculasEntity();
		peliculasEntity= this.getEntityPeliculas(peliculasVO);
		
		peliculasReposi.save(peliculasEntity);
		
		cabecResponse.setCodigo(200);
		cabecResponse.setIdRastreo("Exito en modificacion:"+peliculasVO.getId_pelicula());
			
		PelMsgResponse.setCabeceraResponse(cabecResponse);
		PelMsgResponse.setMensaje("Registro modificado");

		PelMsgResponse.setPeliculasVO(this.getPeliculasVO(peliculasEntity));
			
			return PelMsgResponse;
	}

	@Override
	public void deletePeliculas(long id) {
		try {
			System.out.println("Exito al eliminar id: " + id);
			peliculasReposi.deleteById(id);

		}
	
		catch(Exception e) {
			System.out.println("Error => " + e.getMessage());
		}
		
	}
	
	
	private PeliculasEntity getEntityPeliculas(PeliculasVO peliculasVO) {
		PeliculasEntity peliculasEntity = new PeliculasEntity();
		BeanUtils.copyProperties(peliculasVO, peliculasEntity);
		return peliculasEntity;
	}
	private PeliculasVO getPeliculasVO(PeliculasEntity peliculasEntity)  {
		
		PeliculasVO peliculasVO=new PeliculasVO();
		BeanUtils.copyProperties(peliculasEntity,peliculasVO);
			
		return peliculasVO;
	}
	
//----------------------------------------------------
	
	@Override
	public void insertSeries(SeriesVO seriesVO) {
		try {
			LocalDateTime localDateTime = LocalDateTime.now();

			
			SeriesEntity seriesEntity =new SeriesEntity();
			seriesEntity= this.getEntityseries(seriesVO);
			seriesEntity.setFec_reg_ser(localDateTime);
			seriesEntity.setFec_modif_ser(localDateTime);
						
			seriesRepository.save(seriesEntity);
		}
		catch(Exception e) {
			System.out.println("Error al insertar => " + e.getMessage());
		}
		
	}

	@Override
	public SeriesMsgResponse consultSeries(long id) {
		CabeceraResponse cabecResponse = new CabeceraResponse();
		SeriesMsgResponse seriesMsgResponse = new SeriesMsgResponse();
		SeriesEntity seriesEntity =new SeriesEntity();
		
		seriesEntity = seriesRepository.getById(id);
		
		cabecResponse.setCodigo(200);
		cabecResponse.setIdRastreo("Exito en consulta de Serie :"+id);
			
		seriesMsgResponse.setCabeceraResponse(cabecResponse);
		seriesMsgResponse.setMensaje("Registro consultado existe");

		seriesMsgResponse.setSeriesVO(this.getSeriesVO(seriesEntity));
			
			return seriesMsgResponse;
	}

	@Override
	public SeriesMsgResponse modifSeries(SeriesVO seriesVO) {
		CabeceraResponse cabecResponse = new CabeceraResponse();
		SeriesMsgResponse seriesMsgResponse = new SeriesMsgResponse();
		SeriesEntity seriesEntity =new SeriesEntity();
		
		seriesEntity= this.getEntityseries(seriesVO);
		
		seriesRepository.save(seriesEntity);
		
		cabecResponse.setCodigo(200);
		cabecResponse.setIdRastreo("Exito en modificacion:"+seriesVO.getId_serie());
			
		seriesMsgResponse.setCabeceraResponse(cabecResponse);
		seriesMsgResponse.setMensaje("Registro modificado");

		seriesMsgResponse.setSeriesVO(this.getSeriesVO(seriesEntity));
			
			return seriesMsgResponse;
	}

	@Override
	public void deleteSeries(long id) {
		try {
			System.out.println("Exito al eliminar id: " + id);
			seriesRepository.deleteById(id);

		}
	
		catch(Exception e) {
			System.out.println("Error => " + e.getMessage());
		}
		
	}
	
	private SeriesEntity getEntityseries(SeriesVO seriesVO) {
		SeriesEntity seriesEntity = new SeriesEntity();
		BeanUtils.copyProperties(seriesVO, seriesEntity);
		return seriesEntity;
	}
	private SeriesVO getSeriesVO(SeriesEntity seriesEntity)  {
		
		SeriesVO seriesVO=new SeriesVO();
		BeanUtils.copyProperties(seriesEntity,seriesVO);
			
		return seriesVO;
	}

	@Override
	public Map<String, Object> listSeries(int page, int size) {
		List<SeriesEntity> lstSeriesEntity = new ArrayList<SeriesEntity>();
	      Pageable paging = PageRequest.of(page, size);
	      
	      Page<SeriesEntity> pageTuts;
	      pageTuts = seriesRepository.findAll(paging);
	      lstSeriesEntity = pageTuts.getContent();
	      
	      Map<String, Object> response = new HashMap<>();
	      response.put("content", lstSeriesEntity);
	      response.put("currentPage", pageTuts.getNumber());
	      response.put("totalItems", pageTuts.getTotalElements());
	      response.put("totalPages", pageTuts.getTotalPages());
		return response;
	}
	
}
