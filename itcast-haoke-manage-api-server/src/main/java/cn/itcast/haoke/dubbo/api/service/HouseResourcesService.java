package cn.itcast.haoke.dubbo.api.service;

import cn.itcast.haoke.dubbo.server.api.ApiHouseResourcesService;
import cn.itcast.haoke.dubbo.server.pojo.HouseResources;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


@Service
public class HouseResourcesService {

    @Reference(version ="1.0.0")
    ApiHouseResourcesService apiHouseResourcesService;

    public boolean saveHouseResources(HouseResources houseResources){
        int result = apiHouseResourcesService.saveHouseResources(houseResources);
        return result == 1;
    }
}
