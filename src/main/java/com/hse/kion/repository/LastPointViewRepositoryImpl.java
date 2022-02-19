package com.hse.kion.repository;

import com.aerospike.client.AerospikeClient;
import com.aerospike.client.policy.RecordExistsAction;
import com.aerospike.client.policy.WritePolicy;
import com.hse.kion.repository.query.LastPointViewInfoForUpdate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LastPointViewRepositoryImpl implements LastPointViewRepository {
    private final AerospikeClient aerospikeClient;
    @Override
    public void addLastPointView(LastPointViewInfoForUpdate infoForUpdate) {
        WritePolicy wPolicy = new WritePolicy();
        wPolicy.recordExistsAction = RecordExistsAction.UPDATE;

    }
}
