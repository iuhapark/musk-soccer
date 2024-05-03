package com.musk.api.schedule.repository;

import com.musk.api.schedule.model.QSchedule;
import com.musk.api.schedule.model.ScheduleDTO;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ScheduleDAOImpl implements ScheduleDAO{

    private final JPAQueryFactory factory;


    @Override
    public List<ScheduleDTO> getAllSchedules() {
        return factory.select(
                        QSchedule.schedule.id,
                        QSchedule.schedule.scheDate,
                        QSchedule.schedule.gubun,
                        QSchedule.schedule.hometeamId,
                        QSchedule.schedule.awayteamId,
                        QSchedule.schedule.homeScore,
                        QSchedule.schedule.awayScore
                ).from(QSchedule.schedule)
                .fetch()
                .stream()
                .map(tuple -> ScheduleDTO.builder()
                        .id(tuple.get(QSchedule.schedule.id))
                        .scheDate(tuple.get(QSchedule.schedule.scheDate))
                        .gubun(tuple.get(QSchedule.schedule.gubun))
                        .hometeamId(tuple.get(QSchedule.schedule.hometeamId))
                        .awayteamId(tuple.get(QSchedule.schedule.awayteamId))
                        .homeScore(tuple.get(QSchedule.schedule.homeScore))
                        .awayScore(tuple.get(QSchedule.schedule.awayScore))
                        .build()).toList();
    }
}
