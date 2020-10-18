package io.codehunters.commons.repository.template;

import io.codehunters.commons.repository.template.domain.TemplateEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TemplateJpaRepository extends PagingAndSortingRepository<TemplateEntity, Long> {

    @Query("SELECT t FROM TemplateEntity t WHERE t.code = :code")
    Optional<TemplateEntity> findByCodeEquals(@Param("code") String code);

    @Query("SELECT t FROM TemplateEntity t WHERE t.parameter1 = :parameter1")
    Optional<List<TemplateEntity>> findAllByParameter1Equals(@Param("parameter1") String parameter1);

    @Query("SELECT t FROM TemplateEntity t WHERE t.parameter1 = :parameter1 AND t.parameter2 = :parameter2")
    Optional<List<TemplateEntity>> findAllByParameter1EqualsAndParameter2Equals(@Param("parameter1") String parameter1, @Param("parameter2") String parameter2);

    @Query("SELECT t FROM TemplateEntity t WHERE t.parameter1 = :parameter1 AND t.parameter2 = :parameter2 AND t.parameter3 = :parameter3")
    Optional<List<TemplateEntity>> findAllByParameter1EqualsAndParameter2EqualsAndParameter3Equals(@Param("parameter1") String parameter1, @Param("parameter2") String parameter2, @Param("parameter3") String parameter3);

}
