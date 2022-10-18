package com.nubedian.nubedianproject.controller;

import com.nubedian.nubedianproject.model.HardDisk;
import com.nubedian.nubedianproject.model.PhysicalFactor;
import com.nubedian.nubedianproject.service.PhysicalFactorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/physical-factor")
public class PhysicalFactorResource {
    private final PhysicalFactorService physicalFactorService;

    public PhysicalFactorResource(PhysicalFactorService physicalFactorService) {
        this.physicalFactorService = physicalFactorService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PhysicalFactor>> getAllPhysicalFactors() {
        List<PhysicalFactor> physicalFactors = physicalFactorService.findAllPhysicalFactors();
        return new ResponseEntity<>(physicalFactors, HttpStatus.OK);
    }

}
