package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pays;
import com.example.demo.repository.PaysRepository;

@Service
public class PaysService {
    @Autowired
    private PaysRepository paysRepository;

    public Pays[] findAll(){
        List<Pays> object = paysRepository.findAll();   
        Pays[]array = new Pays[object.size()];
        array = object.toArray(array);
        return array;
    }
    
}
