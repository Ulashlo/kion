package com.hse.kion.configuration;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Host;
import com.aerospike.client.policy.ClientPolicy;
import com.aerospike.client.policy.Policy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
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


    @Bean
    public AerospikeClient getAerospikeClient() {
        return new AerospikeClient(
            new ClientPolicy(),
            properties.getHost(),
            properties.getPort()
        );
    }

    @Bean
    public Policy getDefaultPolicy() {
        return new Policy();
    }
}
