package ProjectTest;


import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author lizhupeng
 * @date 2018/01/11
 */
public class TaskExecutorExample {

    private TaskExecutor taskExecutor;

    public TaskExecutorExample(TaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    private class MessagePrinterTask implements Runnable {

        private String message;

        public MessagePrinterTask(String message) {
            this.message = message;
        }

        public void run() {
            System.out.println(Thread.currentThread().getName() +  message);
        }
    }

    public void printMessages() {
        for(int i = 0; i < 1000000; i++) {
            taskExecutor.execute(new MessagePrinterTask("Message" + i));
        }
    }

    public static void main(String[] args) {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(1);
        threadPoolTaskExecutor.setMaxPoolSize(2);
        threadPoolTaskExecutor.setQueueCapacity(1000);
        threadPoolTaskExecutor.setThreadNamePrefix("LZP_");
//        threadPoolTaskExecutor.setRejectedExecutionHandler(500);
//        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy());
        threadPoolTaskExecutor.initialize();
        TaskExecutorExample taskExecutorExample = new TaskExecutorExample(threadPoolTaskExecutor);
        taskExecutorExample.printMessages();
    }

}