package br.com.spring_boot_rocketseat.main.ioc_di;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public String callMyComponent() {
        return "My Component";
    }
}
