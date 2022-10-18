package com.nubedian.nubedianproject.controller;

import com.nubedian.nubedianproject.model.HardDisk;
import com.nubedian.nubedianproject.service.HardDiskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hard-disk")
public class HardDiskResource {
    private final HardDiskService hardDiskService;

    public HardDiskResource(HardDiskService hardDiskService) {
        this.hardDiskService = hardDiskService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<HardDisk>> getAllHardDisks() {
        List<HardDisk> hardDisks = hardDiskService.findAllHardDisks();
        return new ResponseEntity<>(hardDisks, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<HardDisk> updateHardDisk(@RequestBody HardDisk hardDisk) {
        HardDisk updatedHardDisk = hardDiskService.updateHardDisk(hardDisk);
        return new ResponseEntity<>(updatedHardDisk, HttpStatus.OK);
    }

}
