package com.directi.training.isp.exercice_refactor;

import java.util.TimerTask;

public class Timer
{
    public void register(long timeOut, final ITimedDoor door)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                door.timeOutCallback();
            }
        }, timeOut);
    }
}
