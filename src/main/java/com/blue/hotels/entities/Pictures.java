package com.blue.hotels.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "pictures")
public class Pictures {

    @Id
    @Column(name = "PICTUREID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pictureId;

    @Column(name = "PICTURENAME", length = 50)
    private String pictureName;

    @Column(name = "PICTUREDESC", length = 500)
    private String pictureDesc;

    @Column(name = "PICTURELINK", length = 50)
    private String pictureLink;

    @Column(name = "PICTUREDETAIL", length = 50)
    private String pictureDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotelId")
    private Hotels hotels;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "roomId")
    private Rooms rooms;
}
