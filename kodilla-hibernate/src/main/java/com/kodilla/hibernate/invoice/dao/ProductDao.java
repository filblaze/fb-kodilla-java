package com.kodilla.hibernate.invoice.dao;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.kodilla.hibernate.invoice.Product;

@Transactional
@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {

}
