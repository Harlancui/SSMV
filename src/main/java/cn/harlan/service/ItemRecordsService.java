package cn.harlan.service;

import cn.harlan.entity.ItemMap;
import cn.harlan.entity.ItemRecords;

import java.util.List;

public interface ItemRecordsService {

    List<ItemRecords> queryRuKu(Integer type);

    List<ItemMap> queryMap();
}
