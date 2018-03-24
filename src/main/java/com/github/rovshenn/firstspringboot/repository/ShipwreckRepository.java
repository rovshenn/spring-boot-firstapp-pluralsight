package com.github.rovshenn.firstspringboot.repository;

import com.github.rovshenn.firstspringboot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
}
