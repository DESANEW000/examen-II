package com.calderon.infraccionservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.calderon.infraccionservice.entity.infraccion;

@Repository
public interface infraccionRepository extends JpaRepository<infraccion, Integer> {

}


