package app.netlify.alejandroolea.escuela.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import app.netlify.alejandroolea.escuela.models.EscuelaDTO;

@Repository
public interface IEscuelaDAO extends MongoRepository<EscuelaDTO, String> {

}
