package Civa.ApiBus.controller;

import Civa.ApiBus.entity.Bus;
import Civa.ApiBus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/buses")
public class BusController {
    @Autowired
    private BusService busService;


    @GetMapping
    public List<Bus> getAll(){
        return busService.getBus();
    }

    @PostMapping
    public void saveUpdate(@RequestBody Bus bus){
        busService.saveOrUpdate(bus);
    }

    @DeleteMapping("/{busId}")
    public void saveUpdate(@PathVariable("busId") Long busId){
        busService.delete(busId);
    }
    @GetMapping("/{busId}")
    public Optional<Bus> getById(@PathVariable("busId") Long busId){
        return busService.getBusById(busId);
    }
}
