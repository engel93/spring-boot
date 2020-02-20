package com.acelera.java.acelerajavaspringboot.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/clientes")
public class ClientesController {

//    @RequestMapping(name = "/clientes", method = RequestMethod.GET)
    @GetMapping()
    public ResponseEntity<List<Clientes>> getClientes(){
        List<Clientes> clientes = new ArrayList<Clientes>();
        clientes.add( new Clientes("Nome1", "CPF1"));
        clientes.add( new Clientes("Nome2", "CPF2"));
        return ResponseEntity.ok(clientes);
    }

}
