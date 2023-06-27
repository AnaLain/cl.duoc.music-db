package cl.duoc.musicdb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductoController {
  
    @GetMapping()
    public List<Producto> getAll(){
        return productoService.getAll();
    }
}
