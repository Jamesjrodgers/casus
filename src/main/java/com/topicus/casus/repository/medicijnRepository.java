package com.topicus.casus.repository;


import com.topicus.casus.model.medicijn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface medicijnRepository extends JpaRepository<medicijn, Integer>{


}
