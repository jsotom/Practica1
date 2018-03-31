package pe.usmp.practica.recorrido.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Vehiculo {
	
	@NotNull
	@Size(min=2, max=50)
	private String vehiculo;
	@NotNull
	@Size(min=2, max=30,message="Hola")
	private String nombre;
	@NotNull
	private Double recorrido;
	
	private Double consumo;

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getRecorrido() {
		return recorrido;
	}

	public void setRecorrido(Double recorrido) {
		this.recorrido = recorrido;
	}

	public Double getConsumo() {
		return consumo;
	}

	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}
	
	

}

