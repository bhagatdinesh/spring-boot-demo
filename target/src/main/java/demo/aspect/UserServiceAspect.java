package demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by dinesh.bhagat on 13/03/18.
 */
@Aspect
public class UserServiceAspect {

    @Around("execution(* demo.UserService.doTask(int, int))")
    public void userAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("find my advice before the method...");
        System.out.println(joinPoint.getKind());
        System.out.println(joinPoint.getTarget());
        Object[] intA = joinPoint.getArgs();
        for(int i=0;i<intA.length;i++){
            System.out.println(intA[i]);
        }
        joinPoint.proceed();
        System.out.println(joinPoint.getSignature().getName());
        System.out.println("find my advice after the method...");
    }
}
