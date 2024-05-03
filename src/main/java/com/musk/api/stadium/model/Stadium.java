package com.musk.api.stadium.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.musk.api.schedule.model.Schedule;
import com.musk.api.team.model.Team;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString
@Entity
public class Stadium {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String stadiumName;
    private String homeTeamId;
    private Integer seatCount;
    private String address;
    private String ddd;
    private String tel;

    @OneToMany(mappedBy = "stadium")
    private List<Schedule> schedules = new ArrayList<>();

    @OneToMany(mappedBy = "stadium")
    @JsonManagedReference
    private List<Team> team = new ArrayList<>();
}
