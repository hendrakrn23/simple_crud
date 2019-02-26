package com.btpn.persistence;

import com.btpn.simplecrud.model.Crud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository extends JpaRepository<Crud, String> {

}
