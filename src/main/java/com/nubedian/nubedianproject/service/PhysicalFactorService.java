package com.nubedian.nubedianproject.service;

import com.nubedian.nubedianproject.model.PhysicalFactor;
import com.nubedian.nubedianproject.repository.PhysicalFactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalFactorService {
    private final PhysicalFactorRepository physicalFactorRepository;

    @Autowired
    public PhysicalFactorService(PhysicalFactorRepository physicalFactorRepository) {
        this.physicalFactorRepository = physicalFactorRepository;
    }

    public List<PhysicalFactor> findAllPhysicalFactors() {
        return physicalFactorRepository.findAll();
    }

}
