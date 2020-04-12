package modelo;

import java.math.BigDecimal;

public class Computador {
	private Integer codigo;
	private String nombre;
	private String descripcion;
	private BigDecimal precio;
	private boolean tieneGarantia;
	private String duracionGarantia;

	public Computador() {

	}

	public Computador(Integer codigo, String nombre, String descripcion, BigDecimal precio, boolean tieneGarantia,String duracionGarantia) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.tieneGarantia = tieneGarantia;
		this.duracionGarantia = duracionGarantia;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public boolean isTieneGarantia() {
		return tieneGarantia;
	}

	public void setTieneGarantia(boolean tieneGarantia) {
		this.tieneGarantia = tieneGarantia;
	}

	public String getDuracionGarantia() {
		return duracionGarantia;
	}

	public void setDuracionGarantia(String duracionGarantia) {
		this.duracionGarantia = duracionGarantia;
	}

	@Override
	public String toString() {
		return "Computador [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computador other = (Computador) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	

}

