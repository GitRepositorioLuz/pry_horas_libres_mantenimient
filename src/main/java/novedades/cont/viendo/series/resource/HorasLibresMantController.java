package novedades.cont.viendo.series.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import novedades.cont.viendo.series.response.ActorMsgResponse;
import novedades.cont.viendo.series.response.PeliculaMsgResponse;
import novedades.cont.viendo.series.response.SeriesMsgResponse;
import novedades.cont.viendo.series.service.PryHorasLibresMantService;
import novedades.cont.viendo.series.vo.ActoresVO;
import novedades.cont.viendo.series.vo.PeliculasVO;
import novedades.cont.viendo.series.vo.SeriesVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.core.Response;
import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/dato")
public class HorasLibresMantController {

	@Autowired
	private PryHorasLibresMantService pryHorasLibresMantService;

	@PostMapping("/insActores")
	public Response insertActores(@Valid  @RequestBody  ActoresVO actoresVO) {

		try {

			pryHorasLibresMantService.insertActores(actoresVO);
			return Response.ok().build();
		
		} catch (Exception e) {
			
		    String message = "No se registro Actores"+HttpStatus.INTERNAL_SERVER_ERROR;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
			
		}
	}
	
	@GetMapping("buscarActores/{id}")
	public ResponseEntity<ActorMsgResponse>   findActores(@PathVariable long id){
		return new ResponseEntity<>(
				pryHorasLibresMantService.consultActores(id), 
		          HttpStatus.OK);
	}
	
	@PutMapping("/modifActores")
	public ResponseEntity<ActorMsgResponse>   modifActores(@Valid  @RequestBody  ActoresVO actoresVO){
		return new ResponseEntity<>(
				pryHorasLibresMantService.modifActores(actoresVO), 
		          HttpStatus.OK);
	}
	
	@DeleteMapping("elimActores/{id}")
	public Response  delActores(@PathVariable long id){
		try {
			pryHorasLibresMantService.deleteActores(id);
					return Response.ok().build();
		} catch (Exception e) {
		    String message = "No se elimino Actores"+HttpStatus.INTERNAL_SERVER_ERROR+" "+id;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
		}
		
	}
	
//	----------------------------------------------------------

	@PostMapping("/insPeliculas")
	public Response insertPeliculas(@Valid  @RequestBody  PeliculasVO peliculasVO) {

		try {

			pryHorasLibresMantService.insertPeliculas(peliculasVO);
			return Response.ok().build();
		
		} catch (Exception e) {
			
		    String message = "No se registro Actores"+HttpStatus.INTERNAL_SERVER_ERROR;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
			
		}
	}
	
	@GetMapping("buscarPeliculas/{id}")
	public ResponseEntity<PeliculaMsgResponse>   findPeliculas(@PathVariable long id){
		return new ResponseEntity<>(
				pryHorasLibresMantService.consultPeliculas(id), 
		          HttpStatus.OK);
	}
	
	@PutMapping("/modifPeliculas")
	public ResponseEntity<PeliculaMsgResponse>   modifPeliculas(@Valid  @RequestBody  PeliculasVO peliculasVO){
		return new ResponseEntity<>(
				pryHorasLibresMantService.modifPeliculas(peliculasVO), 
		          HttpStatus.OK);
	}
	
	@DeleteMapping("elimPeliculas/{id}")
	public Response  delPeliculas(@PathVariable long id){
		try {
			pryHorasLibresMantService.deletePeliculas(id);
					return Response.ok().build();
		} catch (Exception e) {
		    String message = "No se elimino Actores"+HttpStatus.INTERNAL_SERVER_ERROR+" "+id;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
		}
		
	}
	
//	----------------------------------------------------------
	
	@PostMapping("/insSeries")
	public Response insertSeries(@Valid  @RequestBody  SeriesVO seriesVO) {

		try {

			pryHorasLibresMantService.insertSeries(seriesVO);
			return Response.ok().build();
		
		} catch (Exception e) {
			
		    String message = "No se registro Series"+HttpStatus.INTERNAL_SERVER_ERROR;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
			
		}
	}
	
	@GetMapping("buscarSeries/{id}")
	public ResponseEntity<SeriesMsgResponse>   findSeries(@PathVariable long id){
		return new ResponseEntity<>(
				pryHorasLibresMantService.consultSeries(id), 
		          HttpStatus.OK);
	}
	
	@PutMapping("/modifSeries")
	public ResponseEntity<SeriesMsgResponse>   modifSeries(@Valid  @RequestBody  SeriesVO seriesVO){
		return new ResponseEntity<>(
				pryHorasLibresMantService.modifSeries(seriesVO), 
		          HttpStatus.OK);
	}
	
	@DeleteMapping("elimSeries/{id}")
	public Response  delSeries(@PathVariable long id){
		try {
			pryHorasLibresMantService.deleteSeries(id);
					return Response.ok().build();
		} catch (Exception e) {
		    String message = "No se elimino Series"+HttpStatus.INTERNAL_SERVER_ERROR+" "+id;

		    return Response
		      .status(Response.Status.NOT_MODIFIED)
		      .entity(message)
		      .build();
		}
		
	}	
//	---------------------------------
	@GetMapping("/listaSeries")
	public ResponseEntity<Map<String, Object>>   listaSeries(
	        @RequestParam(defaultValue = "0") int page,
	        @RequestParam(defaultValue = "10") int size)
	{
	    Map<String, Object>  paginator=pryHorasLibresMantService.listSeries(page, size);
	      return new ResponseEntity<>(paginator, HttpStatus.OK);
	}
}
