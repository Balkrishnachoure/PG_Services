package com.example.PG.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.PG.Entity.PGEntity;

public interface PGRepository  extends JpaRepository<PGEntity, Integer>  {
	
	@Query(value = "Select  * FROM pgdb.pgentity WHERE  name  LIKE :initialLetters%", nativeQuery = true)
    List<PGEntity> getByInitialName(@Param("initialLetters") String initialLetters);

}
