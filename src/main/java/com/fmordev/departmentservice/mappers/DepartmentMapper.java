package com.fmordev.departmentservice.mappers;

import com.fmordev.departmentservice.dto.DepartmentDto;
import com.fmordev.departmentservice.entity.DepartmentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {

  DepartmentMapper MAPPER = Mappers.getMapper(DepartmentMapper.class);

  DepartmentDto toDto(DepartmentEntity departmentEntity);
  DepartmentEntity toEntity(DepartmentDto departmentDto);
}
