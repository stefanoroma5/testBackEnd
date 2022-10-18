package com.nubedian.nubedianproject.service;

import com.nubedian.nubedianproject.model.HDInterface;
import com.nubedian.nubedianproject.repository.HDInterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HDInterfaceService {
    private final HDInterfaceRepository hdInterfaceRepository;

    @Autowired
    public HDInterfaceService(HDInterfaceRepository hdInterfaceRepositoryRepository) {
        this.hdInterfaceRepository = hdInterfaceRepositoryRepository;
    }

    public List<HDInterface> findAllInterfaces() {
        return hdInterfaceRepository.findAll();
    }

}
