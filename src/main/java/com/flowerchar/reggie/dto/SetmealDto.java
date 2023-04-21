package com.flowerchar.reggie.dto;

import com.flowerchar.reggie.entity.Setmeal;
import com.flowerchar.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
