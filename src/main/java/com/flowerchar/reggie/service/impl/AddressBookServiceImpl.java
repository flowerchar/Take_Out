package com.flowerchar.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.flowerchar.reggie.entity.AddressBook;
import com.flowerchar.reggie.mapper.AddressBookMapper;
import com.flowerchar.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
