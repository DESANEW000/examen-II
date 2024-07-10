package com.calderon.infraccionservice.service;
import java.util.List;
import com.calderon.infraccionservice.entity.infraccion;

public interface infraccionService {
	public List<infraccion> getAll();
	public infraccion get(int id);
	public infraccion create(infraccion infraccion);
	public infraccion update(infraccion infraccion);
	public infraccion delete(int id);
    List<infraccion> getByUsuario(String dni);
    infraccion anularInfraccion(int id);

}
