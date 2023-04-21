package com.flowerchar.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.flowerchar.reggie.entity.Employee;
import com.flowerchar.reggie.mapper.EmployeeMapper;
import com.flowerchar.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
