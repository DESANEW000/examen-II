package com.calderon.infraccionservice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.calderon.infraccionservice.entity.infraccion;
import com.calderon.infraccionservice.service.infraccionService;

@RestController
@RequestMapping ("api/vl/infraccion")
public class infraccionController {
	 @Autowired
	    private infraccionService service;

	    @GetMapping
	    public ResponseEntity<List<infraccion>> getAll() {
	        List<infraccion> infracciones = service.getAll();
	        return new ResponseEntity<>(infracciones, HttpStatus.OK);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<infraccion> get(@PathVariable int id) {
	    	infraccion infraccion = service.get(id);
	        if (infraccion != null) {
	            return new ResponseEntity<>(infraccion, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @PostMapping
	    public ResponseEntity<infraccion> create(@RequestBody infraccion infraccion) {
	    	infraccion nuevaInfraccion = service.create(infraccion);
	        return new ResponseEntity<>(nuevaInfraccion, HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<infraccion> update(@PathVariable int id, @RequestBody infraccion infraccion) {
	        infraccion.setId(id);
	        infraccion infraccionActualizada = service.update(infraccion);
	        if (infraccionActualizada != null) {
	            return new ResponseEntity<>(infraccionActualizada, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<infraccion> delete(@PathVariable int id) {
	    	infraccion infraccion = service.delete(id);
	        if (infraccion != null) {
	            return new ResponseEntity<>(infraccion, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	    @GetMapping("/usuario/{dni}")
	    public ResponseEntity<List<infraccion>> getByUsuario(@PathVariable String dni) {
	        List<infraccion> infracciones = service.getByUsuario(dni);
	        return new ResponseEntity<>(infracciones, HttpStatus.OK);
	    }

	    @PutMapping("/anular/{id}")
	    public ResponseEntity<infraccion> anularInfraccion(@PathVariable int id) {
	    	infraccion infraccionAnulada = service.anularInfraccion(id);
	        if (infraccionAnulada != null) {
	            return new ResponseEntity<>(infraccionAnulada, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

}
