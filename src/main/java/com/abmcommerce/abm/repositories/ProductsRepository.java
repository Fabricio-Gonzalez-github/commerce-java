package com.abmcommerce.abm.repositories;

import com.abmcommerce.abm.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product ,Long > {
}
