package com.rihab.interventions.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rihab.interventions.entities.Demandeur;
import com.rihab.interventions.entities.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
	Manager findByUserUsername(String username);

}
