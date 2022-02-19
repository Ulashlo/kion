package com.hse.kion.configuration;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.policy.ClientPolicy;
import com.aerospike.client.policy.Policy;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class AerospikeConfiguration {
    private final AerospikeConfigurationProperties aerospikeConfigurationProperties;

    @Bean
    public AerospikeClient getAerospikeClient() {
        return new AerospikeClient(
            new ClientPolicy(),
            aerospikeConfigurationProperties.getHost(),
            aerospikeConfigurationProperties.getPort()
        );
    }

    @Bean
    public Policy getDefaultPolicy() {
        return new Policy();
    }
}
