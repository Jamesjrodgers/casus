package com.topicus.casus.services;

import com.topicus.casus.model.recept;
import com.topicus.casus.repository.receptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class receptService {

    @Autowired
    private receptRepository receptRepository;

    public List<recept> findAll(){
        return receptRepository.findAll();
    }

}
