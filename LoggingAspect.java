package org.example;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // 6️⃣ POINTCUT
    @Pointcut("execution(* org.example.StudentService.*(..))")
    public void studentPointcut() {}

    // 1️⃣ BEFORE ADVICE
    @Before("studentPointcut()")
    public void beforeAdvice() {
        System.out.println("Before method execution");
    }

    // 2️⃣ AFTER ADVICE
    @After("studentPointcut()")
    public void afterAdvice() {
        System.out.println("After method execution");
    }

    // 3️⃣ AROUND ADVICE
    @Around("execution(* org.example.StudentService.addStudent(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Before Around Advice");
        Object obj = pjp.proceed();
        System.out.println("After Around Advice");
        return obj;
    }

    // 4️⃣ AFTER RETURNING ADVICE
    @AfterReturning(
            pointcut = "execution(* org.example.StudentService.getStudentName(..))",
            returning = "result"
    )
    public void afterReturningAdvice(Object result) {
        System.out.println("After Returning Advice: " + result);
    }

    // 5️⃣ AFTER THROWING ADVICE
    @AfterThrowing(
            pointcut = "execution(* org.example.StudentService.errorMethod(..))",
            throwing = "ex"
    )
    public void afterThrowingAdvice(Exception ex) {
        System.out.println("After Throwing Advice: " + ex.getMessage());
    }
}
