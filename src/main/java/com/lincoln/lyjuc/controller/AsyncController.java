package com.lincoln.lyjuc.controller;

import com.lincoln.lyjuc.handler.AsyncTasksHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.CompletableFuture;

/**
 * @Author Lincoln Lin
 * @Date 2022/7/22 17:13
 * @Description: 同步调用
 */
@RestController
@RequestMapping("/async")
@Slf4j
public class AsyncController {

    @Resource
    private AsyncTasksHandler async;

    @GetMapping("/get")
    public String getAsync() throws Exception {
        long start = System.currentTimeMillis();

        CompletableFuture<String> task1 = async.doTaskOne();
        CompletableFuture<String> task2 = async.doTaskTwo();
        CompletableFuture<String> task3 = async.doTaskThree();

        CompletableFuture<String> task4 = async.doTaskFour();
        CompletableFuture<String> task5 = async.doTaskFive();
        CompletableFuture<String> task6 = async.doTaskSix();
        CompletableFuture<String> task7 = async.doTaskSeven();
        CompletableFuture<String> task8 = async.doTaskEight();
        CompletableFuture<String> task9 = async.doTaskNine();
        CompletableFuture<String> task10 = async.doTaskTen();
        CompletableFuture<String> task11 = async.doTaskEleven();
        CompletableFuture.allOf(task1, task2, task3, task4, task5, task6, task7, task8, task9, task10, task11).join();

        long end = System.currentTimeMillis();

        log.info("任务全部完成，总耗时：" + (end - start) + "毫秒");
        return "async success";
    }

    @GetMapping("/get1")
    public String getAsync1() throws Exception {
        long start = System.currentTimeMillis();

        CompletableFuture<String> task1 = async.doTaskOne();
        CompletableFuture<String> task2 = async.doTaskTwo();
        CompletableFuture<String> task3 = async.doTaskThree();
        CompletableFuture<String> task4 = async.doTaskFour();
        CompletableFuture<String> task5 = async.doTaskFive();
        CompletableFuture<String> task6 = async.doTaskSix();
        CompletableFuture.allOf(task1, task2, task3, task4, task5, task6).join();

        long end = System.currentTimeMillis();
        log.info("Async1 任务全部完成，总耗时：" + (end - start) + "毫秒");
        return "async success";
    }

    @GetMapping("/get2")
    public String getAsync2() throws Exception {
        long start = System.currentTimeMillis();

        CompletableFuture<String> task1 = async.doTaskOne();
        CompletableFuture<String> task2 = async.doTaskTwo();
        CompletableFuture<String> task3 = async.doTaskThree();

        CompletableFuture.allOf(task1, task2, task3).join();

        long end = System.currentTimeMillis();

        log.info("Async2 任务全部完成，总耗时：" + (end - start) + "毫秒");
        return "async success";
    }

    @GetMapping("/get3")
    public String getAsync3() throws Exception {
//        long start = System.currentTimeMillis();
//
//        // 线程池1
//        CompletableFuture<String> task1 = async.doTaskOneByTaskNo("1");
//        CompletableFuture<String> task2 = async.doTaskOneByTaskNo("2");
//        CompletableFuture<String> task3 = async.doTaskOneByTaskNo("3");
//
//        // 线程池2
//        CompletableFuture<String> task4 = async.doTaskTwoByTaskNo("4");
//        CompletableFuture<String> task5 = async.doTaskTwoByTaskNo("5");
//        CompletableFuture<String> task6 = async.doTaskTwoByTaskNo("6");
//
//        CompletableFuture.allOf(task1, task2, task3, task4, task5, task6).join();
//
//        long end = System.currentTimeMillis();
//
//        log.info("Async3 任务全部完成，总耗时：" + (end - start) + "毫秒");
        return "async success";
    }

}
