package com.blue.hotels.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rooms")
public class Rooms {


    @Id
    @Column(name = "ROOMID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @Column(name = "ROOMNAME", length = 50)
    private String roomName;

    @Column(name = "ROOMDESC", length = 500)
    private String roomDesc;

    @Column(name = "ROOMTYPE", length = 50)
    private String roomType;

    @Column(name = "ROOMPRICE", length = 50)
    private String roomPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotelId")
    private Hotels hotels;

}
