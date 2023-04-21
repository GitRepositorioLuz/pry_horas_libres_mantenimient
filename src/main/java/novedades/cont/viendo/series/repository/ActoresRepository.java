package novedades.cont.viendo.series.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import novedades.cont.viendo.series.entity.ActoresEntity;



@Repository
public interface ActoresRepository  extends JpaRepository<ActoresEntity,Long>{

}
