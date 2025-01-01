package com.fmordev.departmentservice.service;

import com.fmordev.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
  DepartmentDto save(DepartmentDto departmentDto);
  DepartmentDto getByCode(String code);
}
