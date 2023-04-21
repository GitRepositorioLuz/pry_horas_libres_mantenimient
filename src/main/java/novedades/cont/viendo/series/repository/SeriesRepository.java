package novedades.cont.viendo.series.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import novedades.cont.viendo.series.entity.SeriesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface SeriesRepository  extends JpaRepository<SeriesEntity,Long>{

	@Query("SELECT u FROM SeriesEntity u WHERE u.estado_serie ='1'")
	Page<SeriesEntity> findAll(Pageable pageable);
	
}
