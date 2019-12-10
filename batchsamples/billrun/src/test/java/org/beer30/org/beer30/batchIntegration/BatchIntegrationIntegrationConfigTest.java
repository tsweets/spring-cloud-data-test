package org.beer30.org.beer30.batchIntegration;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static org.junit.Assert.*;

@Configuration
@EnableBatchProcessing
@Profile(value = "test")
public class BatchIntegrationIntegrationConfigTest {

    @Bean
    JobLauncherTestUtils jobLauncherTestUtils() {
        JobLauncherTestUtils jltu = new JobLauncherTestUtils();
        return jltu;
    }
}