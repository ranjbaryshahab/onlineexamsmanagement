package ir.maktab.java32.projects.onlineexamsmanagement.common.anotatitons;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface UseCase {
    @AliasFor(
            annotation = Component.class
    )
    String value() default "";
}
