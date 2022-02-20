package com.hse.kion.configuration;

import com.aerospike.client.Host;
import com.hse.kion.model.lastPointView.LastPointViewKey;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.config.AbstractAerospikeDataConfiguration;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;

import java.util.Collection;
import java.util.List;

@EnableAerospikeRepositories(basePackages = "com.hse.kion.repository")
@RequiredArgsConstructor
@Configuration
public class AerospikeConfiguration extends AbstractAerospikeDataConfiguration {
    private final AerospikeConfigurationProperties properties;

    @Override
    protected Collection<Host> getHosts() {
        return List.of(
            new Host(
                properties.getHost(),
                properties.getPort()
            )
        );
    }

    @Override
    protected String nameSpace() {
        return properties.getNamespace();
    }

    @Override
    protected List<?> customConverters() {
        return List.of(
            LastPointViewKey.LastPointViewKeyToStringConverter.INSTANCE,
            LastPointViewKey.StringToLastPointViewKeyConverter.INSTANCE
        );
    }
}
