package com.calderon.infraccionservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.calderon.infraccionservice.entity.infraccion;
import com.calderon.infraccionservice.repository.infraccionRepository;
import com.calderon.infraccionservice.service.infraccionService;

@Service
public class infraccionServiceImpl implements infraccionService {

    @Autowired
    private infraccionRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<infraccion> getAll() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    @Transactional(readOnly = true)
    public infraccion get(int id) {
        try {
            return repository.findById(id).orElse(null);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    @Transactional
    public infraccion create(infraccion infraccion) {
        try {
            return repository.save(infraccion);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    @Transactional
    public infraccion update(infraccion infraccion) {
        try {
            infraccion registro = get(infraccion.getId());
            if (registro == null) {
                return null;
            } else {
                registro.setDni(infraccion.getDni());
                registro.setFecha(infraccion.getFecha());
                registro.setTipoInfraccion(infraccion.getTipoInfraccion());
                registro.setUbicacion(infraccion.getUbicacion());
                registro.setDescripcion(infraccion.getDescripcion());
                registro.setMontoMulta(infraccion.getMontoMulta());
                registro.setEstado(infraccion.getEstado());
                repository.save(registro);
                return registro;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    @Transactional
    public infraccion delete(int id) {
        try {
            infraccion registro = get(id);
            if (registro == null) {
                return null;
            } else {
                repository.delete(registro);
                return registro;
            }
        } catch (Exception e) {
            throw e;
        }
    }

	@Override
	public List<infraccion> getByUsuario(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public infraccion anularInfraccion(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
