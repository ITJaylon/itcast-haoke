package cn.itcast.haoke.dubbo.server.service.impl;

import cn.itcast.haoke.dubbo.server.pojo.BasePojo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public abstract class BaseServiceImpl<T extends BasePojo>{

    @Autowired
    private BaseMapper<T> baseMapper;

    /**
     * 根据id来查询数据
     *
     * @param id
     * @return
     */
    public T queryById(Long id){
        return this.baseMapper.selectById(id);
    }


    /**
     * 查询所有数据
     *
     * @return
     */
    public List<T> queryAll(){
        return this.baseMapper.selectList(null);
    }

    /**
     * 根据条件查询数据列表
     *
     * @param record
     * @return
     */
    public List<T> queryListByWhere(T record){
        return this.baseMapper.selectList(new QueryWrapper<>(record));
    }

    /**
     * 根据条件分页查询数据列表
     *
     * @param record
     * @param page
     * @param rows
     * @return
     */
    public IPage<T> queryPageListByWhere(T record, Integer page, Integer rows){
        //获取分页数据
        return this.baseMapper.selectPage(new Page<T>(page, rows),new QueryWrapper<>(record));
    }


    /**
     * 保存数据
     *
     * @param record
     * @return
     */
    public Integer save(T record){
        record.setCreated(new Date());
        record.setUpdated(record.getCreated());
        return this.baseMapper.insert(record);
    }


    /**
     * 更新数据
     *
     * @param record
     * @return
     */
    public Integer update(T record){
        record.setUpdated(new Date());
        return this.baseMapper.updateById(record);
    }


    public Integer deleteById(Long id){
        return this.baseMapper.deleteById(id);
    }

    public Integer deleteByIds(List<Long> ids){
        return this.baseMapper.deleteBatchIds(ids);
    }

    /**
     * 按照条件进行删除
     *
     * @param record
     * @return
     */
    public Integer deleteByWhere(T record){
        return this.baseMapper.delete(new QueryWrapper<>(record));
    }
}
