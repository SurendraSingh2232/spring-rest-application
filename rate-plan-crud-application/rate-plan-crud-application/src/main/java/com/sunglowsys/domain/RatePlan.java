package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rate_plan_table")
public class RatePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer hotelId;
    private Integer RoomTypeId;

    public RatePlan(){
        System.out.println("RatePlan object created");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRoomTypeId() {
        return RoomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        RoomTypeId = roomTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatePlan ratePlan = (RatePlan) o;
        return Objects.equals(id, ratePlan.id) && Objects.equals(name, ratePlan.name) && Objects.equals(hotelId, ratePlan.hotelId) && Objects.equals(RoomTypeId, ratePlan.RoomTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hotelId, RoomTypeId);
    }

    @Override
    public String toString() {
        return "RatePlan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hotelId=" + hotelId +
                ", RoomTypeId=" + RoomTypeId +
                '}';
    }
}
