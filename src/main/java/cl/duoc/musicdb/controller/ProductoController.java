package cl.duoc.musicdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.musicdb.modelo.entities.ProductoEntities;
import cl.duoc.musicdb.service.ProductoService;

@RestController
@RequestMapping("/producto-db")
public class ProductoController {
    
    @Autowired
    ProductoService productoService;

    @GetMapping(path = "/producto", produces = {"application/json"})
    public List<ProductoEntities> getAll(){
        return productoService.getAll();
    }
}
