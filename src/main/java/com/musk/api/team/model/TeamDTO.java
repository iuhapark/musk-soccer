package com.musk.api.team.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Builder
public class TeamDTO {
    private String id;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String origYyyy;
    private String zipCode1;
    private String zipCode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String homePage;
    private String owner;
    private String stadiumId;
    private Double avgHeight;

    public TeamDTO(String id, String regionName, String teamName, String eTeamName, String origYyyy, String zipCode1, String zipCode2, String address, String ddd, String tel, String fax, String homePage, String owner, String stadiumId, Double avgHeight) {
        this.id = id;
        this.regionName = regionName;
        this.teamName = teamName;
        this.eTeamName = eTeamName;
        this.origYyyy = origYyyy;
        this.zipCode1 = zipCode1;
        this.zipCode2 = zipCode2;
        this.address = address;
        this.ddd = ddd;
        this.tel = tel;
        this.fax = fax;
        this.homePage = homePage;
        this.owner = owner;
        this.stadiumId = stadiumId;
    }

    public TeamDTO(String id, String teamName, double avgHeight) {
        this.id = id;
        this.teamName = teamName;
        this.avgHeight = avgHeight;
    }

    public TeamDTO(String teamName) {
        this.teamName = teamName;
    }

    public TeamDTO(String teamName, String stadiumId) {
        this.teamName = teamName;
        this.stadiumId = stadiumId;
    }
}
