package Civa.ApiBus.service;

import Civa.ApiBus.entity.Marca;
import Civa.ApiBus.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MarcaService {
    @Autowired
    MarcaRepository marcaRepository;

    public List<Marca> getMarca(){
        return marcaRepository.findAll();
    }

    public Optional<Marca> getMarcaById(Long id){
        return marcaRepository.findById(id);
    }

    public void saveOrUpdate(Marca marca){
        marcaRepository.save(marca);
    }
    public void delete(Long id){
        marcaRepository.deleteById(id);
    }
}
