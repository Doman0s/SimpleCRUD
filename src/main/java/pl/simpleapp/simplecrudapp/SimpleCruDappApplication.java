package pl.simpleapp.simplecrudapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SimpleCruDappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleCruDappApplication.class, args);
    }

}
