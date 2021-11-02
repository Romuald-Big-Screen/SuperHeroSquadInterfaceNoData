package com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.controller;


import com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.model.Formed;
import com.SuperHeroquadInterfaceNoData.SuperHeroquadInterfaceNoData.service.FormedService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FormedController {

    private final FormedService formedService;

    public FormedController(FormedService formedService) {
        this.formedService = formedService;
    }

    @RequestMapping(value = "formedYear", method = RequestMethod.GET)
    public List<String> formedYear(@RequestParam(name = "formed") int formed) {

        return this.formedService.getFormedYear(formed);
    }

}
