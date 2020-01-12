package com.motherbuy.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import com.motherbuy.BasePojo;

/**value用来指定调用哪个服务*/
@FeignClient(value = "eurekaclient")
public interface ApiService {
    /**value用来指定调用哪个接口*/
    @RequestMapping(value = "/index")
    String index();
    @RequestMapping(value = "/testPojoParam")
    String testPojoParam(BasePojo basePojo);

}
