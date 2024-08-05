package edu.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.demo.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository <Product,Long> {

}