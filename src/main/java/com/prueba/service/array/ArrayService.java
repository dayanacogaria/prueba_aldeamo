package com.prueba.service.array;

import com.prueba.models.ArraysEntity;

import java.util.List;
import java.util.Optional;

public interface ArrayService {
    Optional<ArraysEntity> findById(int id);

    List<ArraysEntity> findAllArrays();
    int[] primos (int num);
}
