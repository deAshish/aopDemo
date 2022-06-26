package miu.edu.aopdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExectionTimeAspect {
    @Pointcut("@annotation(miu.edu.aopdemo.aspect.annotation.ExecutionTime)")
    public void executionTimeAnnotation(){}

    @Around("executionTimeAnnotation()")
    public Object calculateExecutionTime(ProceedingJoinPoint processingJoinPoint) throws Throwable{
        long start = System.nanoTime();
        var result = processingJoinPoint.proceed();
        long finish = System.nanoTime();
        System.out.println(processingJoinPoint.getSignature().getName() + "takes ns:" + finish);
        return result;
    }
}
