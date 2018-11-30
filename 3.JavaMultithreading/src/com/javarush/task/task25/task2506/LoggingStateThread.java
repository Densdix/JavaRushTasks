package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread target;
    State state;

    @Override
    public void run() {
        while(state!=State.TERMINATED){
            refreshState();
        }
    }

    private void refreshState() {
        if(state != target.getState()){
            state = target.getState();
            System.out.println(state);
        }


    }

    public LoggingStateThread(Thread target) {
        this.target = target;
        refreshState();
    }
}
