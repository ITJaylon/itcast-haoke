package cn.itcast.haoke.dubbo.server.service;

import cn.itcast.haoke.dubbo.server.pojo.HouseResources;

public interface HouseResourcesService {
    /**
     * @param houseResources
     *
     * @return -1：输入的参数不符合要求 ,0:插入失败,1：插入成功
     */
    int saveHouseResources(HouseResources houseResources);
}
