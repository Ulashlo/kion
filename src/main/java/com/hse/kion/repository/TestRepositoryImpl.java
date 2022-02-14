package com.hse.kion.repository;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Key;
import com.aerospike.client.policy.Policy;
import com.hse.kion.model.LastPointView;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestRepositoryImpl implements TestRepository {
    private final AerospikeClient aerospikeClient;
    private final Policy defaultPolicy;

    public TestRepositoryImpl() {
        aerospikeClient = new AerospikeClient("localhost", 3000);
        defaultPolicy = new Policy();
    }

    @Override
    public LastPointView findById(Long id) {
        final var result = aerospikeClient.get(defaultPolicy, new Key("test", "last_point_view", id));
        return new LastPointView(
            id,
            result.getInt("value")
        );
    }
}
