package com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.service;


import com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.model.Formed;
import com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.repository.FormedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.activation.DataHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FormedService {

    private final FormedRepository formedRepository;


    @Autowired
    public FormedService(FormedRepository formedRepository) {
        this.formedRepository = formedRepository;

    }

    public List<String> getFormedYear(int formed){
        return FormedRepository.findAll();
    }



}
