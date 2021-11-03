package com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.service;


import com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.model.Formed;
import com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.repository.FormedRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Data
@Service
public class FormedService {

    @Autowired
    private FormedRepository formedRepository;





    public void createFormed(Formed formed) {
        formedRepository.save(formed);
    }

    /*
    public List<String> getFormedYear(int formed){
        return FormedRepository.findAll();
    } */



}
