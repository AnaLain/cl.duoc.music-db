package cl.duoc.musicdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.musicdb.modelo.entities.ProductoEntities;
import cl.duoc.musicdb.modelo.repository.ProductoRepository;

@Service
public class ProductoService {
    
    @Autowired
    ProductoRepository productoRepository;
    
    public List<ProductoEntities> getAll(){
        return ProductoRepository.findAll();
    }
}
