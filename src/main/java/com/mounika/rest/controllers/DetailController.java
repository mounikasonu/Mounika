package com.mounika.rest.controllers;

import com.mounika.Dtos.TenantDetailsDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailController {
    @PostMapping("/add-tendent-details")
    public void addDetails(@RequestBody TenantDetailsDto tendentDetailsDto){

    }

}
