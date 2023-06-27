package cl.duoc.musicdb.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.duoc.musicdb.modelo.entities.ProductoEntities;

public interface ProductoRepository extends JpaRepository <ProductoEntities, Integer> {
    
}
