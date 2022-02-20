package com.hse.kion.repository;

import com.hse.kion.model.lastPointView.LastPointView;
import com.hse.kion.model.lastPointView.LastPointViewKey;
import org.springframework.data.repository.CrudRepository;

public interface LastPointViewRepository extends CrudRepository<LastPointView, LastPointViewKey> {
}
