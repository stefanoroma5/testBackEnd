package com.nubedian.nubedianproject.repository;

import com.nubedian.nubedianproject.model.PhysicalFactor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalFactorRepository extends JpaRepository<PhysicalFactor, Long> {
}
