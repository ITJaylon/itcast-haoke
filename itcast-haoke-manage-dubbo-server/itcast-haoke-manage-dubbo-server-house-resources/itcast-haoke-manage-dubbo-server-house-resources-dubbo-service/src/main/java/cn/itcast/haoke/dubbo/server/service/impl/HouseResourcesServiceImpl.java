package cn.itcast.haoke.dubbo.server.service.impl;

import cn.itcast.haoke.dubbo.server.pojo.HouseResources;
import cn.itcast.haoke.dubbo.server.service.HouseResourcesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class HouseResourcesServiceImpl extends BaseServiceImpl<HouseResources>
implements HouseResourcesService{

    @Override
    public int saveHouseResources(HouseResources houseResources) {

        //编写校验逻辑，校验不通过，返回-1
        if(StringUtils.isBlank(houseResources.getTitle())){
            return -1;
        }
        //其他校验省略...
        return super.save(houseResources);
    }
}
