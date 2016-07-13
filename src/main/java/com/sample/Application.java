package com.sample;

import com.hubspot.dropwizard.guicier.GuiceBundle;
import com.sample.config.AppConfiguration;
import com.sample.config.GuiceModule;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Application extends io.dropwizard.Application<AppConfiguration> {
    public static void main(String... args) throws Exception {
        new Application().run(args);
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {
        GuiceBundle<AppConfiguration> guiceBundle = GuiceBundle.defaultBuilder(AppConfiguration.class)
            .modules(new GuiceModule())
            .build();

        bootstrap.addBundle(guiceBundle);

    }

    @Override
    public void run(AppConfiguration configuration, Environment environment) throws Exception {
    }
}

