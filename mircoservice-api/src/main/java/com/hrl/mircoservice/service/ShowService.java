package com.hrl.mircoservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2019/1/24.
 */
@FeignClient(value = "MIRCOSERVICE-SHOW")
public interface ShowService
{
    @RequestMapping(value="/show/get")
    public String get();

}
