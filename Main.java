package lamda.lesson2;

import lamda.lesson2.Worker;

public class Main {
    public static void main(String[] args) {

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener Error = System.out::println;
        Worker worker = new Worker(listener, Error);
        worker.start();
    }
}
