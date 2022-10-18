package com.nubedian.nubedianproject.service;

import com.nubedian.nubedianproject.model.HardDisk;
import com.nubedian.nubedianproject.repository.HardDiskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HardDiskService {
    private final HardDiskRepository hardDiskRepository;

    @Autowired
    public HardDiskService(HardDiskRepository hardDiskRepository) {
        this.hardDiskRepository = hardDiskRepository;
    }

    public List<HardDisk> findAllHardDisks() {
        return hardDiskRepository.findAll();
    }

    public HardDisk updateHardDisk(HardDisk hardDisk) {
        return hardDiskRepository.save(hardDisk);
    }


}
