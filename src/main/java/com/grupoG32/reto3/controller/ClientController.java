package com.grupoG32.reto3.controller;

import com.grupoG32.reto3.dbo.ClientDbo;
import com.grupoG32.reto3.model.ClientModel;
import com.grupoG32.reto3.model.GamaModel;
import com.grupoG32.reto3.service.ClientService;
import com.grupoG32.reto3.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

   @Autowired
   ClientService clientService;

    @GetMapping("/all")
    public List<ClientModel> obtener(){
        return clientService.obtener();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody ClientModel client){
        clientService.crear(client);
    }
}
