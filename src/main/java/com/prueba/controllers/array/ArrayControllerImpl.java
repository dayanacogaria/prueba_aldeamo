package com.prueba.controllers.array;



import com.prueba.models.ArraysEntity;
import com.prueba.repository.ArraysRepository;
import com.prueba.service.array.ArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class ArrayControllerImpl implements ArrayController {


    @Autowired
    ArrayService arrayService;

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    @Override
    public String test() {
        return "Test done";
    }

    @Override
    @RequestMapping(value = "/bartener", method = RequestMethod.POST, produces = "application/json")
    public String bartener(int q, int id) {
       String  rta = "";
        if(id > 5 || id < 0){
            rta ="Numero de 1 a 5 campo id";
        }else{
            ArraysEntity arr = arrayService.findById(id).get();
            String[] cadena = arr.getInputArray().split(",");
            ArrayList<String> a = new ArrayList<String>(Arrays.asList(cadena));
            ArrayList<Integer> b = new ArrayList<Integer>();
            int p[] = arrayService.primos(q);

            int num = 0 ;
            while (num < q) {

                for(int i = 0; i < a.size(); i++){

                    int n = Integer.valueOf(a.get(i));

                 if( n % p[num] == 0){
                    b.add(n);
                    a.remove(i);
                 }

                }

                num ++;
            }
            rta = b.toString();

        }



        return rta;
    }


}
