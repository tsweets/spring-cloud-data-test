package org.beer30.jasypt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertyServiceTest {

        @Autowired
        ApplicationContext appCtx;

        @Test
        public void whenDecryptedPasswordNeeded_GetFromService() {
            System.setProperty("jasypt.encryptor.password", "password");
            PropertyService service = appCtx.getBean(PropertyService.class);
            assertEquals("Password@2", service.getProperty());
        }
}