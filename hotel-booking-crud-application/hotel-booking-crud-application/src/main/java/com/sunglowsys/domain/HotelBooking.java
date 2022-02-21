package com.sunglowsys.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "Hotel_booking_table")
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String checkInDate;

    @NotNull
    private String  checkOutDate;

    @NotNull
    private Integer totalGuest;

    @NotNull
    private Integer noOfNight;

    @NotNull
    private Integer noOfRooms;

    @NotNull
    private Long bookingAmount;

    @NotNull
    private Integer customerId;

    @NotNull
    private Integer hotelId;

    @NotNull
    private Integer ratePlanId;

    @NotNull
    private Integer roomTypeId;

    public HotelBooking(){
        System.out.println("hotelBooking object created");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getTotalGuest() {
        return totalGuest;
    }

    public void setTotalGuest(Integer totalGuest) {
        this.totalGuest = totalGuest;
    }

    public Integer getNoOfNight() {
        return noOfNight;
    }

    public void setNoOfNight(Integer noOfNight) {
        this.noOfNight = noOfNight;
    }

    public Integer getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(Integer noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public Long getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(Long bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRatePlanId() {
        return ratePlanId;
    }

    public void setRatePlanId(Integer ratePlanId) {
        this.ratePlanId = ratePlanId;
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
        HotelBooking that = (HotelBooking) o;
        return Objects.equals(id, that.id) && Objects.equals(checkInDate, that.checkInDate) && Objects.equals(checkOutDate, that.checkOutDate) && Objects.equals(totalGuest, that.totalGuest) && Objects.equals(noOfNight, that.noOfNight) && Objects.equals(noOfRooms, that.noOfRooms) && Objects.equals(bookingAmount, that.bookingAmount) && Objects.equals(customerId, that.customerId) && Objects.equals(hotelId, that.hotelId) && Objects.equals(ratePlanId, that.ratePlanId) && Objects.equals(roomTypeId, that.roomTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, checkInDate, checkOutDate, totalGuest, noOfNight, noOfRooms, bookingAmount, customerId, hotelId, ratePlanId, roomTypeId);
    }

    @Override
    public String toString() {
        return "HotelBooking{" +
                "id=" + id +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", totalGuest=" + totalGuest +
                ", noOfNight=" + noOfNight +
                ", noOfRooms=" + noOfRooms +
                ", bookingAmount=" + bookingAmount +
                ", customerId=" + customerId +
                ", hotelId=" + hotelId +
                ", ratePlanId=" + ratePlanId +
                ", roomTypeId=" + roomTypeId +
                '}';
    }
}
