package com.everis.ejercicio1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.ejercicio1.models.FamilyMembers;

public interface IFamilyMembersRepo extends JpaRepository<FamilyMembers, Integer>{

}
