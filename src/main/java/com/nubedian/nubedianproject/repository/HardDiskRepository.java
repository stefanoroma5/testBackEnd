package com.nubedian.nubedianproject.repository;

import com.nubedian.nubedianproject.model.HardDisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardDiskRepository extends JpaRepository<HardDisk, Long> {
}
