package miu.edu.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
//    @Pointcut("@annotation(miu.edu.aopdemo.aspect.annotation.LogMe)")
//    public void a(){} //Always empty method.


//    @After("a()") //This is advice, and is calling pre defined pointcut
    @After("@annotation(miu.edu.aopdemo.aspect.annotation.LogMe)") // this is advice where pointcut i define within.
    public void log(JoinPoint joinPoint){
        System.out.println("Method name" + joinPoint.getSignature().getName());
    }


}
