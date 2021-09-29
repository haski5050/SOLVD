package com.company;

public class ControlRoom {

    private Dispatcher[] dispatchers;
    private boolean isReady;

    public ControlRoom() {
    }

    public ControlRoom(Dispatcher[] dispatchers, boolean isReady) {
        this.dispatchers = dispatchers;
        this.isReady = isReady;
    }

    public Dispatcher[] getDispatchers() {
        return dispatchers;
    }

    public void setDispatchers(Dispatcher[] dispatchers) {
        this.dispatchers = dispatchers;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }
}
