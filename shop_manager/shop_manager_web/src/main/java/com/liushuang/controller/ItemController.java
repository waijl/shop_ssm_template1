package com.liushuang.controller;

import com.liushuang.pojo.TbItem;
import com.liushuang.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liushuang
 * @create 2020-06-29 16:45
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable("itemId") long itemId){
        TbItem itemById = itemService.getItemById(itemId);
        return itemById;
    }
}
