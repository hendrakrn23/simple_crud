package com.btpn.simplecrud.service;

import com.btpn.persistence.CrudRepository;
import com.btpn.simplecrud.model.Crud;
import com.btpn.simplecrud.model.Response;
import org.hibernate.engine.jdbc.ReaderInputStream;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CrudServiceImpl implements CrudService{
    @Autowired
    private CrudRepository crudRepository;

    @Autowired
    private Crud crud;

    @Autowired
    private Response response;

    @Override
    public List<Crud> findAll() {
        return crudRepository.findAll();
    }


}
