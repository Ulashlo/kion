package com.hse.kion.repository;

import com.hse.kion.model.LastPointView;
import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface LastPointViewRepository extends AerospikeRepository<LastPointView, Object> {
}
