package com.blue.hotels.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "hotels")
@Data
public class Hotels {

    @Id
    @Column(name = "HOTELID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelId;

    @Column(name = "HOTELNAME", length = 50)
    private String hotelName;

    @Column(name = "HOTELDESC", length = 50)
    private String hotelDesc;


    @Column(name = "HOTELPHONE", length = 50)
    private String hotelPhone;

    @Column(name = "HOTELPHONE2", length = 50)
    private String hotelPhone2;

    @Column(name = "HOTELADDRESS", length = 50)
    private String hotelAddress;


    @Column(name = "HOTELWHATSAPP", length = 50)
    private String hotelWhatsapp;

    @Column(name = "HOTELEMAIL", length = 50)
    private String hotelEmail;

    @Column(name = "HOTELABOUTUS", length = 50)
    private String hotelAboutUs;

    @Column(name = "HOTELLOCATION", length = 250)
    private String hotelLocation;

    @Column(name = "HOTELLOCATIONLINK", length = 250)
    private String hotelLocationLink;

    @Column(name = "HOTELSOCIALMEDIA1", length = 250)
    private String hotelSocialMedia1;

    @Column(name = "HOTELSOCIALMEDIA2", length = 250)
    private String hotelSocialMedia2;

    @Column(name = "HOTELSOCIALMEDIA3", length = 250)
    private String hotelSocialMedia3;

}