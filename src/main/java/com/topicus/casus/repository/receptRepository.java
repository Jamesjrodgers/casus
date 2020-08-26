package com.topicus.casus.repository;

import com.topicus.casus.model.recept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface receptRepository extends JpaRepository<recept, Integer> {
}
