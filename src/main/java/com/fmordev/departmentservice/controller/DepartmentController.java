package com.fmordev.departmentservice.controller;

import com.fmordev.departmentservice.dto.DepartmentDto;
import com.fmordev.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
@AllArgsConstructor
public class DepartmentController {

  private final DepartmentService departmentService;

  @PostMapping
  public ResponseEntity<DepartmentDto> save(@RequestBody DepartmentDto departmentDto) {
    DepartmentDto departmentDtoSaved = departmentService.save(departmentDto);
    return new ResponseEntity<>(departmentDtoSaved, HttpStatus.CREATED);
  }

  @GetMapping(value = "/by-code/{code}")
  public ResponseEntity<DepartmentDto> getByCode(@PathVariable String code) {
    DepartmentDto departmentDto = departmentService.getByCode(code);
    return new ResponseEntity<>(departmentDto, HttpStatus.OK);
  }
}
