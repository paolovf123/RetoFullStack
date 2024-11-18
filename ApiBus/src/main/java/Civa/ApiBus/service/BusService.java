package Civa.ApiBus.service;

import Civa.ApiBus.entity.Bus;
import Civa.ApiBus.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BusService {
    @Autowired
    BusRepository busRepository;

    public List<Bus> getBus(){
        return busRepository.findAll();
    }

    public Optional<Bus> getBusById(Long id){
        return busRepository.findById(id);
    }

    public void saveOrUpdate(Bus bus){
        busRepository.save(bus);
    }
    public void delete(Long id){
        busRepository.deleteById(id);
    }
}
