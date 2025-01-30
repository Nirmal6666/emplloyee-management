package com.example.employeemanagement.Service.Impl;

import com.example.employeemanagement.DTO.EmployeeDto;
import com.example.employeemanagement.Mapper.EmployeeMapper;
import com.example.employeemanagement.Service.EmployeeService;
import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.maptoEmployee(employeeDto);
        Employee savedEmployee= employeeRepository.save(employee);
        return EmployeeMapper.maptoEmployeeDto(savedEmployee);
    }
}
