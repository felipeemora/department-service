package com.fmordev.departmentservice.service.impl;

import com.fmordev.departmentservice.dto.DepartmentDto;
import com.fmordev.departmentservice.entity.DepartmentEntity;
import com.fmordev.departmentservice.exception.ResourceNotFoundException;
import com.fmordev.departmentservice.mappers.DepartmentMapper;
import com.fmordev.departmentservice.repository.DepartmentRepository;
import com.fmordev.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

  private final DepartmentRepository departmentRepository;

  @Override
  public DepartmentDto save(DepartmentDto departmentDto) {
    DepartmentEntity departmentSaved = departmentRepository.save(DepartmentMapper.MAPPER.toEntity(departmentDto));
    return DepartmentMapper.MAPPER.toDto(departmentSaved);
  }

  @Override
  public DepartmentDto getByCode(String code) {
    return DepartmentMapper.MAPPER.toDto(departmentRepository.findByCode(code)
        .orElseThrow(() -> new ResourceNotFoundException("Department", "code", code)));
  }
}
