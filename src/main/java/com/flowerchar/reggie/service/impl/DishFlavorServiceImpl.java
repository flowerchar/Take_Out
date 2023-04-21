package com.flowerchar.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.flowerchar.reggie.entity.DishFlavor;
import com.flowerchar.reggie.mapper.DishFlavorMapper;
import com.flowerchar.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
