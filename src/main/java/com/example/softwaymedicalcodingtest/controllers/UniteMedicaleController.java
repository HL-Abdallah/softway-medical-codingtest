package com.example.softwaymedicalcodingtest.controllers;

import com.example.softwaymedicalcodingtest.entity.ServiceMedical;
import com.example.softwaymedicalcodingtest.service.UniteMedicaleService;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;
import io.swagger.v3.oas.annotations.responses.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unite-medicale")
public class UniteMedicaleController {

    private final UniteMedicaleService uniteMedicaleService;

    public UniteMedicaleController(UniteMedicaleService uniteMedicaleService) {
        this.uniteMedicaleService = uniteMedicaleService;
    }

    @Operation(summary = "Redirect Patient",
            description = "Redirects a patient to relevant medical units based on the provided index."
    )
    @GetMapping("rediriger")
    public List<ServiceMedical> redirigerPatient(
            @RequestParam Long index
    ){
        return uniteMedicaleService.redirigerPatient(index);
    }

}
