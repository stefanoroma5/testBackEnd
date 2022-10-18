package com.nubedian.nubedianproject.repository;

import com.nubedian.nubedianproject.model.HDInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HDInterfaceRepository extends JpaRepository<HDInterface, Long> {
}
