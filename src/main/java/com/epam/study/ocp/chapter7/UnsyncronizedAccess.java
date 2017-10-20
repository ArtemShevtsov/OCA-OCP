package com.epam.study.ocp.chapter7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by artem_shevtsov on 8/4/17.
 */
public class UnsyncronizedAccess {
    public static void main(String[] args) {
        ExecutorService service = null;
        try{
            service = Executors.newFixedThreadPool(13);
            doUnsecureWork(service);
        } finally{
            if(service != null){
                service.shutdown();
            }
        }
    }

    private static void doUnsecureWork(ExecutorService service){
        for(int j = 0; j<10; j++){
            CountManager countManager = new CountManager();
            for (int i = 0; i < 10; i++){
                service.submit(() -> countManager.doIncrementAndPring());
            }
        }
    }
}
