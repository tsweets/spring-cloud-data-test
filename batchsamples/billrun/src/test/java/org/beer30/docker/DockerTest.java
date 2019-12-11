package org.beer30.docker;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.DockerCmdExecFactory;
import com.github.dockerjava.api.model.Info;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.jaxrs.JerseyDockerCmdExecFactory;
import org.junit.Assert;
import org.junit.Test;

public class DockerTest {

    @Test
    public void test() {
        DockerClientConfig config = DefaultDockerClientConfig.createDefaultConfigBuilder()
            //    .withDockerHost("tcp://localhost:2375")
              //  .withDockerTlsVerify(true)
              //  .withDockerCertPath("/home/user/.docker")
              //  .withRegistryUsername(registryUser)
              //  .withRegistryPassword(registryPass)
              //  .withRegistryEmail(registryMail)
              //  .withRegistryUrl(registryUrl)
                .build();

        DockerCmdExecFactory dockerCmdExecFactory = new JerseyDockerCmdExecFactory()
                .withReadTimeout(1000)
                .withConnectTimeout(1000)
                .withMaxTotalConnections(100)
                .withMaxPerRouteConnections(10);

        DockerClient dockerClient = DockerClientBuilder.getInstance(config)
                .withDockerCmdExecFactory(dockerCmdExecFactory)
                .build();
        Assert.assertNotNull(dockerClient);

        Info info = dockerClient.infoCmd().exec();
        System.out.print(info);
    }
}
