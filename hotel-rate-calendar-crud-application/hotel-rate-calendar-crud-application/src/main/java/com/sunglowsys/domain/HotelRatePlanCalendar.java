package com.sunglowsys.domain;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "hotel_rate_plan_calendar_table")
public class HotelRatePlanCalendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private Integer singleOccupancy;

    private Integer doubleOccupancy;

    private Integer extraAdultPrice;

    private Integer extraChildPrice;

    @NotNull
    private Integer applicableDays;

    @NotNull
    private Integer hotelId;

    @NotNull
    private Integer hotelRoomType;

    public HotelRatePlanCalendar(){
        System.out.println("HotelRatePlanCalendar object created: ");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSingleOccupancy() {
        return singleOccupancy;
    }

    public void setSingleOccupancy(Integer singleOccupancy) {
        this.singleOccupancy = singleOccupancy;
    }

    public Integer getDoubleOccupancy() {
        return doubleOccupancy;
    }

    public void setDoubleOccupancy(Integer doubleOccupancy) {
        this.doubleOccupancy = doubleOccupancy;
    }

    public Integer getExtraAdultPrice() {
        return extraAdultPrice;
    }

    public void setExtraAdultPrice(Integer extraAdultPrice) {
        this.extraAdultPrice = extraAdultPrice;
    }

    public Integer getExtraChildPrice() {
        return extraChildPrice;
    }

    public void setExtraChildPrice(Integer extraChildPrice) {
        this.extraChildPrice = extraChildPrice;
    }

    public Integer getApplicableDays() {
        return applicableDays;
    }

    public void setApplicableDays(Integer applicableDays) {
        this.applicableDays = applicableDays;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getHotelRoomType() {
        return hotelRoomType;
    }

    public void setHotelRoomType(Integer hotelRoomType) {
        this.hotelRoomType = hotelRoomType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelRatePlanCalendar that = (HotelRatePlanCalendar) o;
        return Objects.equals(id, that.id) && Objects.equals(singleOccupancy, that.singleOccupancy) && Objects.equals(doubleOccupancy, that.doubleOccupancy) && Objects.equals(extraAdultPrice, that.extraAdultPrice) && Objects.equals(extraChildPrice, that.extraChildPrice) && Objects.equals(applicableDays, that.applicableDays) && Objects.equals(hotelId, that.hotelId) && Objects.equals(hotelRoomType, that.hotelRoomType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, singleOccupancy, doubleOccupancy, extraAdultPrice, extraChildPrice, applicableDays, hotelId, hotelRoomType);
    }

    @Override
    public String toString() {
        return "HotelRatePlanCalendar{" +
                "id=" + id +
                ", singleOccupancy=" + singleOccupancy +
                ", doubleOccupancy=" + doubleOccupancy +
                ", extraAdultPrice=" + extraAdultPrice +
                ", extraChildPrice=" + extraChildPrice +
                ", applicableDays=" + applicableDays +
                ", hotelId=" + hotelId +
                ", hotelRoomType=" + hotelRoomType +
                '}';
    }
}
