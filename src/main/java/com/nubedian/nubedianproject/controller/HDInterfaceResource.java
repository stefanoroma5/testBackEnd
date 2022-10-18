package com.nubedian.nubedianproject.controller;

import com.nubedian.nubedianproject.model.HDInterface;
import com.nubedian.nubedianproject.service.HDInterfaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interface")
public class HDInterfaceResource {
    private final HDInterfaceService hdInterfaceService;

    public HDInterfaceResource(HDInterfaceService hdInterfaceService) {
        this.hdInterfaceService = hdInterfaceService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<HDInterface>> getAllInterfaces() {
        List<HDInterface> interfaces = hdInterfaceService.findAllInterfaces();
        return new ResponseEntity<>(interfaces, HttpStatus.OK);
    }

}
