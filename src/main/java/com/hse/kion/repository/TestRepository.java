package com.hse.kion.repository;

import com.hse.kion.model.LastPointView;

import java.util.List;

public interface TestRepository {
    public LastPointView findById(Long id);
}
