package io.lcalmsky.springbootconfigurationproperties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("service")
@ConstructorBinding
@RequiredArgsConstructor
@Getter
public class ServiceProperties {
    private final String message;
}
