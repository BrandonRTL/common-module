package liga.medical.commonmodule.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"liga.medical.commonmodule", "liga.medical.common.service"})
public class CommonModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(liga.medical.commonmodule.core.CommonModuleApplication.class, args);
    }

}