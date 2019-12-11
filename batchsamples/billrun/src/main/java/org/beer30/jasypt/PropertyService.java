package org.beer30.jasypt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {
    @Value("${encryptedv2.property}")
    private String property;

    public String getProperty() { return property; }

}
