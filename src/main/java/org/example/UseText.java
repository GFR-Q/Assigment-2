package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Primary
public class UseText {
    public UseText() {
        System.out.println("--------Tasks List Ended--------");
    }
}
