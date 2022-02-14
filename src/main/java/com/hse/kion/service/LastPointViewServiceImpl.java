package com.hse.kion.service;

import com.hse.kion.controller.dto.LastPointViewDTO;
import com.hse.kion.controller.dto.LastPointViewInfoForCreateDTO;
import com.hse.kion.model.LastPointView;
import com.hse.kion.repository.LastPointViewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
class LastPointViewServiceImpl implements LastPointViewService {
    private final LastPointViewRepository lastPointViewRepository;

    @Override
    public List<LastPointViewDTO> getLastPointViews() {
        final var list = new LinkedList<LastPointViewDTO>();
        lastPointViewRepository
            .findAll(Sort.unsorted())
            .forEach(
                view -> {
                    list.add(
                        new LastPointViewDTO(
                            view.getId(),
                            view.getValue()
                        )
                    );
                }
            );
        return list;
    }

    @Override
    public void addLastPointView(LastPointViewInfoForCreateDTO info) {
        lastPointViewRepository.save(
            new LastPointView(info.getId(), info.getValue())
        );
    }
}
