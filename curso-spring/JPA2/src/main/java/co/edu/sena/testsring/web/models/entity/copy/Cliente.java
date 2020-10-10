package co.edu.sena.testsring.web.models.entity.copy;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 4152508492042720659L;

	@Id
	private Long id;

	@Column(name = "nombre")
	@NotEmpty(message = "El nombre  es obligatorio")
	@Size(max = 50)
	private String nombre;

	@Column(name = "apellido")
	@NotEmpty(message = "El apellido es obligatorio")
	@Size(max = 50)
	private String apellido;

	@Column(name = "email")
	@NotNull
	@Size(max = 50)
	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;

	@PrePersist()
	public void prePersist() {
		fecha = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
