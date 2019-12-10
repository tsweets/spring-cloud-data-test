package org.beer30.shell;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.shell.plugin.support.DefaultHistoryFileNameProvider;
import org.springframework.stereotype.Component;


@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SimpleHistoryFileNameProvider extends DefaultHistoryFileNameProvider {
    @Override
    public String getHistoryFileName() {
        return "test-shell.log";
    }

    @Override
    public String getProviderName() {
        return "Test Shell History";
    }
}
