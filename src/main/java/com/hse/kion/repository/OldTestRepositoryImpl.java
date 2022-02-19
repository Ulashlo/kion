package com.hse.kion.repository;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.Key;
import com.aerospike.client.policy.Policy;
import com.hse.kion.model.LastPointView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OldTestRepositoryImpl implements OldTestRepository {
    private final AerospikeClient aerospikeClient;
    private final Policy defaultPolicy;

    @Override
    public LastPointView findById(Long id) {
        final var result = aerospikeClient.get(defaultPolicy, new Key("test", "last_point_view", id));
//        return new LastPointView(
//            id,
//            result.getInt("value")
//        );
        return null;
    }
}
