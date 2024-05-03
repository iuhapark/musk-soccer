package com.musk.api.schedule.repository;

import com.musk.api.schedule.model.ScheduleDTO;

import java.util.List;

public interface ScheduleDAO {

    List<ScheduleDTO> getAllSchedules();
}
