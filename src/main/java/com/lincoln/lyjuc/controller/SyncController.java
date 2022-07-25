package com.lincoln.lyjuc.controller;

import com.lincoln.lyjuc.handler.SyncTasksHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Lincoln Lin
 * @Date 2022/7/22 17:13
 * @Description: 同步调用
 */
@RestController
@RequestMapping("/sync")
@Slf4j
public class SyncController {

    @Resource
    private SyncTasksHandler sync;

    @GetMapping("/get")
    public String getAsync() throws Exception {
        sync.doTaskOne();
        sync.doTaskTwo();
        sync.doTaskThree();
        return "sync success";
    }

}
