package novedades.cont.viendo.series.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import novedades.cont.viendo.series.entity.PeliculasEntity;

@Repository
public interface PeliculasRepository   extends JpaRepository<PeliculasEntity,Long>{

}
