package com.hse.kion.service;

import com.hse.kion.controller.dto.lastPointView.LastPointViewDTO;
import com.hse.kion.controller.dto.lastPointView.LastPointViewInfoForGetDTO;
import com.hse.kion.controller.dto.lastPointView.LastPointViewInfoForUpdateDTO;
import com.hse.kion.model.lastPointView.LastPointViewKey;
import com.hse.kion.repository.LastPointViewRepository;
import com.hse.kion.utils.converters.LastPointViewConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static com.hse.kion.utils.converters.LastPointViewConverter.toLastPointView;

@Service
@RequiredArgsConstructor
public class LastPointViewServiceImpl implements LastPointViewService {
    private final LastPointViewRepository lastPointViewRepository;

    @Override
    public void updateLastPointView(LastPointViewInfoForUpdateDTO dto) {
        lastPointViewRepository.save(toLastPointView(dto));
    }

    @Override
    public List<LastPointViewDTO> getLastPointViewsByVideoIds(LastPointViewInfoForGetDTO dto) {
        final var userId = dto.getUserId();
        final var videoIds = dto.getVideoIds();
        return StreamSupport.stream(
                lastPointViewRepository.findAllById(
                    videoIds.stream()
                        .map(videoId -> new LastPointViewKey(userId, videoId))
                        .collect(Collectors.toList())
                ).spliterator(),
                false
            ).map(LastPointViewConverter::toLastPointViewDTO)
            .collect(Collectors.toList());
    }
}
