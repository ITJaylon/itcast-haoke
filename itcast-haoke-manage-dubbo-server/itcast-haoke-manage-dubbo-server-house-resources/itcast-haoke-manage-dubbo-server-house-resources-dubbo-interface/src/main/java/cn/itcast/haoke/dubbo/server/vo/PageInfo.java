package cn.itcast.haoke.dubbo.server.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
public class PageInfo<T> implements java.io.Serializable{
    private static final long serialVersionUID = 6019371426519087132L;

    private Integer total;

    private Integer pageNum;

    private Integer pageSize;

    private List<T> records = Collections.emptyList();
}
