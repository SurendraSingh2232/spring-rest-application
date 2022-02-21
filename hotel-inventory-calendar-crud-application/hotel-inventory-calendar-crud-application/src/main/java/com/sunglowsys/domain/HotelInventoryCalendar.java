package com.sunglowsys.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hotel_inventory_calendar_table")
public class HotelInventoryCalendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer sold;

    @NotNull
    private Integer available;
    private Integer block;
    private Integer hotelId;
    private Integer roomTypeId;

    public HotelInventoryCalendar(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelInventoryCalendar that = (HotelInventoryCalendar) o;
        return Objects.equals(id, that.id) && Objects.equals(sold, that.sold) && Objects.equals(available, that.available) && Objects.equals(block, that.block) && Objects.equals(hotelId, that.hotelId) && Objects.equals(roomTypeId, that.roomTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sold, available, block, hotelId, roomTypeId);
    }

    @Override
    public String toString() {
        return "HotelInventoryCalendar{" +
                "id=" + id +
                ", sold=" + sold +
                ", available=" + available +
                ", block=" + block +
                ", hotel_id=" + hotelId +
                ", roomTypeId=" + roomTypeId +
                '}';
    }
}
