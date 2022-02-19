package com.hse.kion.repository;

import com.hse.kion.repository.query.LastPointViewInfoForUpdate;

public interface LastPointViewRepository {
    void addLastPointView(LastPointViewInfoForUpdate infoForUpdate);
}
