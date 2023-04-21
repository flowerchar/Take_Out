package com.flowerchar.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.flowerchar.reggie.entity.OrderDetail;
import com.flowerchar.reggie.mapper.OrderDetailMapper;
import com.flowerchar.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}