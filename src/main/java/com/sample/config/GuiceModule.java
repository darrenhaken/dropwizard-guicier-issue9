package com.sample.config;

import com.google.inject.AbstractModule;
import com.sample.resources.HealthResource;

public class GuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(HealthResource.class);
    }
}
