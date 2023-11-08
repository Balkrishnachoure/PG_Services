package com.example.PG.Service;

import java.util.List;



import com.example.PG.Entity.PGEntity;
import org.springframework.http.ResponseEntity;


public interface PGService {

	ResponseEntity<?> addPGIndividually(PGEntity pgEntity);
	
	ResponseEntity<?> deletePGIndividuallyById(int id);
	
	List<PGEntity> getPGByUserName(String InitialName);


	List<PGEntity> getAllPG();

}
