package com.pmalherbe.demokubernetes.controller;

import com.pmalherbe.demokubernetes.model.dto.FishDto;
import com.pmalherbe.demokubernetes.service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FishController {

    private final FishService service;

    @Autowired
    public FishController(FishService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<FishDto> getAllFish(){
        return service.getAllFish();
    }
}
