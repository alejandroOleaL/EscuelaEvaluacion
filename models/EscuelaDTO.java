package app.netlify.alejandroolea.escuela.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "escuelaDTO")
public class EscuelaDTO {
	
	@Id
	private String _id;
	
	private String nombre;
	
	private LocalDate fecha;
	
	public EscuelaDTO(String _id, String nombre, LocalDate fecha) {
		super();
		this._id = _id;
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

}
