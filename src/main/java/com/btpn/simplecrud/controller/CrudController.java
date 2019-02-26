package com.btpn.simplecrud.controller;

import com.btpn.simplecrud.model.Crud;
import com.btpn.simplecrud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/crud")
public class CrudController {

    @Autowired
    private CrudService crudService;

    @GetMapping(path = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Crud> findAll(){
        return crudService.findAll();
    }
}
