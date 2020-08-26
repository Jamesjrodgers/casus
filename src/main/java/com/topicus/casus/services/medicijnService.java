package com.topicus.casus.services;
import com.topicus.casus.model.medicijn;
import com.topicus.casus.repository.medicijnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class medicijnService {

    @Autowired
    private medicijnRepository medicijnRepository;

    public List<medicijn> findAll(){
        return medicijnRepository.findAll();
    }

    public void save(medicijn medicijn){
        medicijnRepository.save(medicijn);
    }
}
