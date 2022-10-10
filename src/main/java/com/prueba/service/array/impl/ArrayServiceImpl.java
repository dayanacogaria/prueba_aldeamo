package com.prueba.service.array.impl;

import com.prueba.models.ArraysEntity;
import com.prueba.repository.ArraysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArrayServiceImpl implements com.prueba.service.array.ArrayService {

    private final ArraysRepository arraysRepository;

    @Autowired
    public ArrayServiceImpl(ArraysRepository arraysRepository) {
        this.arraysRepository = arraysRepository;
    }

    @Override
    public Optional<ArraysEntity> findById(int id) {
        return arraysRepository.findById(id);
    }

    @Override
    public List<ArraysEntity> findAllArrays() {
        return (List<ArraysEntity>) arraysRepository.findAll();
    }

    @Override
    public int[] primos (int num){
        int v[] = new int[num];
        int contador = 0;
        int i=2;
        while(contador<num){
            if(esPrimo(i)){
                v[contador]=i;
                contador++;
            }
            i++;
        }
        return  v;
    }

    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }


}
