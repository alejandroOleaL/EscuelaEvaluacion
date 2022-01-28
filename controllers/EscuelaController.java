package app.netlify.alejandroolea.escuela.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import app.netlify.alejandroolea.escuela.models.EscuelaDTO;
import app.netlify.alejandroolea.escuela.repositorios.IEscuelaDAO;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api/escuelas")
public class EscuelaController {
	
	@Autowired
	private IEscuelaDAO escuelaDao;
	
	@PostMapping("/escuela")
	@ResponseStatus( code = HttpStatus.CREATED )
	public EscuelaDTO create(@Validated @RequestBody EscuelaDTO e) {
		return escuelaDao.insert(e);
	}
	
	@GetMapping("/all")
	public List<EscuelaDTO> findAll(){
		return escuelaDao.findAll();
	}
	
}
