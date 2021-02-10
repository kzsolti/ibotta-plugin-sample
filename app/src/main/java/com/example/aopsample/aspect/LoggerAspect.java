package com.example.aopsample.aspect;

import android.util.Log;

import com.example.aopsample.logic.Controller;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * To reproduce the issue, build the project from a clean state once (or run the app)
 * and then make a change inside the method of this class. Build or run again, as to
 * trigger an incremental compilation. KAPT will fail with unresolved references.
 */
@Aspect
public class LoggerAspect {

    @AfterReturning("execution(* aopTarget(..)) && args(controller)")
    public void logMainCreated(Controller controller) {
        Log.i("AOP logger", "AOP logger has executed on the target method");
        controller.process();
    }
}
