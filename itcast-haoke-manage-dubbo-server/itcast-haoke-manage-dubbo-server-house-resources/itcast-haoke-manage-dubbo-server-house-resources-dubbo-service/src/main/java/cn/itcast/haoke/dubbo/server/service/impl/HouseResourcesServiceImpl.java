package cn.itcast.haoke.dubbo.server.service.impl;

import cn.itcast.haoke.dubbo.server.pojo.HouseResources;
import cn.itcast.haoke.dubbo.server.service.HouseResourcesService;
import cn.itcast.haoke.dubbo.server.vo.PageInfo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
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

    @Override
    public PageInfo<HouseResources> queryHouseResourcesList(int page, int pageSize, HouseResources queryCondition) {
        QueryWrapper<HouseResources> queryWrapper = new QueryWrapper<>(queryCondition);
        queryWrapper.orderByDesc("updated");
        //System.out.println(page+","+pageSize);
        IPage iPage = super.queryPageList(queryWrapper,page,pageSize);
        System.out.println(iPage);
        return new PageInfo<HouseResources>(Long.valueOf(iPage.getTotal()).intValue(),page,pageSize,iPage.getRecords());
    }
}
