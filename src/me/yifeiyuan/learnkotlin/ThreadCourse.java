package me.yifeiyuan.learnkotlin;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Created by 程序亦非猿 on 2019/12/20.
 */
public class ThreadCourse {


    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(3);

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("A 运行完成");
                latch.countDown();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("B 运行完成");
                latch.countDown();
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("C 运行完成");
                latch.countDown();
            }
        }).start();

        try {
            latch.await();
            System.out.println("所有任务运行完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void notifyWhenAllTasksFinished(List<Thread> tasks, Callback callback) {

        CountDownLatch latch = new CountDownLatch(tasks.size());

        for (Thread task : tasks) {
            task.start();
        }
    }

    interface Callback {
        void onFinished();
    }
}
