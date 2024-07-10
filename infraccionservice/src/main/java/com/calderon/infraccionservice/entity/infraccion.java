package com.calderon.infraccionservice.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "infraccion")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class infraccion {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dni", nullable = false)
    private String dni;

    @Column(name = "fecha", nullable = false)
    private java.sql.Timestamp fecha;

    @Column(name = "tipo_infraccion", nullable = false)
    private String tipoInfraccion;

    @Column(name = "ubicacion", nullable = false)
    private String ubicacion;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "monto_multa", nullable = false)
    private Double montoMulta;
    
    @Column(name = "anular_multa", nullable = false)
    private boolean anular_multa;
    
    public boolean isAnular_multa() {
		return anular_multa;
	}

	public void setAnular_multa(boolean anular_multa) {
		this.anular_multa = anular_multa;
	}

	@Column(name = "estado", nullable = false)
    private String estado;
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public java.sql.Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(java.sql.Timestamp fecha) {
		this.fecha = fecha;
	}

	public String getTipoInfraccion() {
		return tipoInfraccion;
	}

	public void setTipoInfraccion(String tipoInfraccion) {
		this.tipoInfraccion = tipoInfraccion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getMontoMulta() {
		return montoMulta;
	}

	public void setMontoMulta(Double montoMulta) {
		this.montoMulta = montoMulta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

    // Getters y setters (generados por Lombok)
	
	

}
