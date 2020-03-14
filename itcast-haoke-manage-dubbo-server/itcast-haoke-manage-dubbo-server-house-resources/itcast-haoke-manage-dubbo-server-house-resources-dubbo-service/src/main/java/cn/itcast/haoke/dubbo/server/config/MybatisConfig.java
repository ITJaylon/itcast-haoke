package cn.itcast.haoke.dubbo.server.config;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@MapperScan("cn.itcast.haoke.dubbo.server.mapper")
@Configuration
public class MybatisConfig {
    //配置分页插件生效，否则分页无效
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor().setDialectType("mysql");
    }
}
