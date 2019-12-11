package org.beer30.batchIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;

@SpringBootApplication
@IntegrationComponentScan
public class BatchIntegrationMain {
    public static void main(String[] args) {
        SpringApplication.run(BatchIntegrationMain.class,args);
    }
}
