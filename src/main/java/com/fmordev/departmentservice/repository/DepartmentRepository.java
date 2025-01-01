package com.fmordev.departmentservice.repository;

import com.fmordev.departmentservice.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
  Optional<DepartmentEntity> findByCode(String code);
}
