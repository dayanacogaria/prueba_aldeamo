package com.prueba.repository;

import com.prueba.models.ArraysEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArraysRepository extends CrudRepository< ArraysEntity, Integer> {
}
