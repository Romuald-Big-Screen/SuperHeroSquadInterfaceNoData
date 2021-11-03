package com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.controller;


import com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.model.Formed;
import com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.service.FormedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FormedController {

    @Autowired
    private FormedService formedService;



    @PostMapping("/createFormed")
    public void createFormed(@RequestBody Formed formed) {
        formedService.createFormed(formed);
    }

    /*
    @RequestMapping(value = "formedYear", method = RequestMethod.GET)
    public List<String> formedYear(@RequestParam(name = "formed") int formed) {

        return this.formedService.getFormedYear(formed);
    } */

}
