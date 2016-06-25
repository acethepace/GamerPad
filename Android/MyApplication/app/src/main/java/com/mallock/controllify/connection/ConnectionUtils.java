package com.mallock.controllify.connection;

/**
 * Created by Mallock on 21-06-2016.
 */
public class ConnectionUtils {
    public static State currentState;

    static void setState(State newState){
        currentState=newState;
    }

    static State getCurrentState(){
        return currentState;
    }

    public enum State{
        CONNECTED,DISCONNECTED,CONNECTING
    }
}
