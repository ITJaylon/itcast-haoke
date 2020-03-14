package cn.itcast.haoke.dubbo.server.api;

import cn.itcast.haoke.dubbo.server.pojo.HouseResources;
import cn.itcast.haoke.dubbo.server.vo.PageInfo;

public interface ApiHouseResourcesService {
    /**
     * @param houseResources
     *
     * @return -1：输入的参数不符合要求 ,0:插入失败,1：插入成功
     */
    int saveHouseResources(HouseResources houseResources);

    /**
     * 分页查询房源列表
     *
     * @param page 当前页
     * @param pageSize 页面大小
     * @param queryCondition 查询条件
     * @return
     *
     */

    PageInfo<HouseResources> queryHouseResourcesList(int page, int pageSize,
                                                    HouseResources queryCondition);
}
