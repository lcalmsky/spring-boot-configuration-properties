package io.lcalmsky.springbootconfigurationproperties;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final ServiceProperties serviceProperties;

    @GetMapping("/hello")
    public String hello() {
        return serviceProperties.getMessage();
    }
}
