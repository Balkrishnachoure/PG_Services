package com.example.PG.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.PG.Entity.PGEntity;
import com.example.PG.Service.PGService;


@RestController
@RequestMapping("api/v1")
public class PGController {
	
	
	@Autowired 
	PGService pgService ;

	@PostMapping("/pg")
	public ResponseEntity<?> addPGIndividually(@RequestBody PGEntity pgEntity )
	{ 
		pgService.addPGIndividually(pgEntity ) ;
		return new ResponseEntity<>(pgService.addPGIndividually(pgEntity)  ,HttpStatus.OK) ;
		
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletePGIndividuallyById(@PathVariable int id )
	{
		  pgService.deletePGIndividuallyById(id);
		return new ResponseEntity<>("Deleted Sucessfully" ,HttpStatus.OK) ;
		
	}
	@GetMapping("/getByUserName/{InitialName}")
	public List<PGEntity> getPGIndividuallyByUsername(@PathVariable String InitialName )
	{return pgService.getPGByUserName(InitialName);

	}

    @GetMapping("/getAllPg")
    public List<PGEntity> getAllPG( )
    {
        return pgService.getAllPG();
    }

}
