package lamda.lesson2;

public class Worker {
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }
   @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);

    }
    private OnTaskErrorListener errorCallback;

    private OnTaskDoneListener callback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33){
                errorCallback.onError("Task " + i + " not implemented");
            }
                else callback.onDone("Task " + i + " is done");
        }
    }
}
