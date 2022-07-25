package com.lincoln.lyjuc.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

/**
 * @Author Lincoln Lin
 * @Date 2022/7/25 14:34
 * @Description: 异步操作的handler
 */
@Slf4j
@Component
public class AsyncTasksHandler {

    public static Random random = new Random();

    @Async
    public CompletableFuture<String> doTaskOne() throws Exception {
        log.info("开始任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务一，耗时：" + (end - start) + "毫秒");
        return CompletableFuture.completedFuture("任务一完成");
    }

    @Async
    public CompletableFuture<String> doTaskTwo() throws Exception {
        log.info("开始任务二");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务二，耗时：" + (end - start) + "毫秒");
        return CompletableFuture.completedFuture("任务二完成");
    }

    @Async
    public CompletableFuture<String> doTaskThree() throws Exception {
        log.info("开始任务三");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务三，耗时：" + (end - start) + "毫秒");
        return CompletableFuture.completedFuture("任务三完成");
    }

    @Async
    public CompletableFuture<String> doTaskFour() throws Exception {
        log.info("开始任务四");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务四，耗时：" + (end - start) + "毫秒");
        return CompletableFuture.completedFuture("任务四完成");
    }

    @Async
    public CompletableFuture<String> doTaskFive() throws Exception {
        log.info("开始任务五");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务五，耗时：" + (end - start) + "毫秒");
        return CompletableFuture.completedFuture("任务五完成");
    }

    @Async
    public CompletableFuture<String> doTaskSix() throws Exception {
        log.info("开始任务六");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务六，耗时：" + (end - start) + "毫秒");
        return CompletableFuture.completedFuture("任务六完成");
    }

    @Async
    public CompletableFuture<String> doTaskSeven() throws Exception {
        log.info("开始任务七");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务七，耗时：" + (end - start) + "毫秒");
        return CompletableFuture.completedFuture("任务七完成");
    }

    @Async
    public CompletableFuture<String> doTaskEight() throws Exception {
        log.info("开始任务八");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务八，耗时：" + (end - start) + "毫秒");
        return CompletableFuture.completedFuture("任务八完成");
    }

    @Async
    public CompletableFuture<String> doTaskNine() throws Exception {
        log.info("开始任务九");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务九，耗时：" + (end - start) + "毫秒");
        return CompletableFuture.completedFuture("任务九完成");
    }

    @Async
    public CompletableFuture<String> doTaskTen() throws Exception {
        log.info("开始任务十");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务十，耗时：" + (end - start) + "毫秒");
        return CompletableFuture.completedFuture("任务十完成");
    }

    @Async
    public CompletableFuture<String> doTaskEleven() throws Exception {
        log.info("开始任务十一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务十一，耗时：" + (end - start) + "毫秒");
        return CompletableFuture.completedFuture("任务十一完成");
    }

    @Async("taskExecutor1")
    public CompletableFuture<String> doTaskOneByTaskNo(String taskNo) throws Exception {
        log.info("开始任务:{}", taskNo);
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务:{}，耗时：{}毫秒", taskNo, (end - start));
        return CompletableFuture.completedFuture("任务完成");
    }

    @Async("taskExecutor2")
    public CompletableFuture<String> doTaskTwoByTaskNo(String taskNo) throws Exception {
        log.info("开始任务:{}", taskNo);
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("完成任务:{}，耗时：{}毫秒", taskNo, (end - start));
        return CompletableFuture.completedFuture("任务完成");
    }

}
