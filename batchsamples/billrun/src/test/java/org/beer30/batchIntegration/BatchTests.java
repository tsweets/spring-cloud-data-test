package org.beer30.batchIntegration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest(classes = { BatchIntegrationIntegrationConfigTest.class, BatchIntegrationBatchConfig.class })
public class BatchTests {
    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Test
    public void testSampleJob() throws Exception {
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        jobParametersBuilder.addString("file_path", "src/test/resources/sample.txt");
        // We add a dummy value to make job params unique, or else spring batch
        // will only run it the first time
        jobParametersBuilder.addDate("dummy", new Date());
        JobExecution jobExecution = jobLauncherTestUtils.launchJob(jobParametersBuilder.toJobParameters());
        System.out.println(jobExecution.getExitStatus());
    }
}
