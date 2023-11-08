package com.example.PG.ServiceImpl;

import java.util.List;

import com.example.PG.Exception.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.PG.Entity.PGEntity;
import com.example.PG.Repo.PGRepository;
import com.example.PG.Service.PGService;
import org.yaml.snakeyaml.scanner.Constant;

@Service
public class PGServiceImpl implements PGService {

	@Autowired
	PGRepository pgRepository ;
		
	public ResponseEntity<?> addPGIndividually(PGEntity pgEntity) {
		
			pgEntity.setName(pgEntity.getName().toLowerCase());
			 //pgRepository.save(pgEntity);
			return new ResponseEntity<>(pgRepository.save(pgEntity), HttpStatus.OK);
		
	}


	@Override
	public List<PGEntity> getPGByUserName(String initialLetters) {
			String strToLowerCase = initialLetters.toLowerCase();
			return pgRepository.getByInitialName(strToLowerCase);
	}

	@Override
	public ResponseEntity<?> deletePGIndividuallyById(int id) {
		// TODO Auto-generated method stub
		pgRepository.deleteById(id);
		return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);

	}

	 public List<PGEntity> getAllPG()
	 {   try {
		  return pgRepository.findAll() ;

	 }catch (Exception e)
	 {
		  return  null ;
	 }
	 }



}
