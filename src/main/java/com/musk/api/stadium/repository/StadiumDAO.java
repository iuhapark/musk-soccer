package com.musk.api.stadium.repository;

import com.musk.api.stadium.model.StadiumDTO;

import java.util.List;

public interface StadiumDAO {
    List<StadiumDTO> getAllStadiums();
}
