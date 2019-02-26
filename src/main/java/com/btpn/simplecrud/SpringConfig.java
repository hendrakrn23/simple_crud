package com.btpn.simplecrud;


import com.btpn.simplecrud.service.CrudService;
import com.btpn.simplecrud.service.CrudServiceImpl;
import org.springframework.context.annotation.Bean;

public class SpringConfig {

    @Bean
    public CrudService crudService(){
        return new CrudServiceImpl();
    }
}
