package com.pmalherbe.demokubernetes.service;

import com.pmalherbe.demokubernetes.model.dto.FishDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FishService {
    public List<FishDto> getAllFish() {
        List<FishDto> fishDtos = new ArrayList<>();
        fishDtos.add(new FishDto("toto", 19));
        fishDtos.add(new FishDto("titi", 12));
        return fishDtos;
    }
}
