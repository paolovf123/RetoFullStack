package Civa.ApiBus.controller;

import Civa.ApiBus.entity.Marca;
import Civa.ApiBus.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/marcas")
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @GetMapping
    public List<Marca> getAll(){
        return marcaService.getMarca();
    }
    @PostMapping
    public void saveUpdate(@RequestBody Marca marca){
        marcaService.saveOrUpdate(marca);
    }
    @DeleteMapping("/{Id}")
    public void saveUpdate(@PathVariable("Id") Long marcaId){
        marcaService.delete(marcaId);
    }

    @GetMapping("/{Id}")
    public Optional<Marca> getById(@PathVariable("Id") Long marcaId){
        return marcaService.getMarcaById(marcaId);
    }
}
