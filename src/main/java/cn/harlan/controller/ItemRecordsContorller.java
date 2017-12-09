package cn.harlan.controller;

import cn.harlan.entity.ItemMap;
import cn.harlan.entity.ItemRecords;
import cn.harlan.service.ItemRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/record")
public class ItemRecordsContorller {

    @Autowired
    ItemRecordsService service;

    @RequestMapping(value = "/queryRuKu",method = RequestMethod.POST)
    public List<ItemRecords> queryRuKu(){
        /*0为入库*/
        return  service.queryRuKu(0);
    }

    @RequestMapping(value = "/queryChuKu",method = RequestMethod.POST)
    public List<ItemRecords> queryChuKu(){
        /*1为出库*/
        return service.queryRuKu(1);
    }

    @RequestMapping(value = "queryMap",method = RequestMethod.POST)
    public List<ItemMap> queryMap(){
        return service.queryMap();
    }
}