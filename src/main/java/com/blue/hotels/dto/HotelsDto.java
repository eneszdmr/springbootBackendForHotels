package com.blue.hotels.dto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
//@ApiModel(value = "Hotels DATA TRANSFER OBJECT")
public class HotelsDto {

   // @ApiModelProperty(value = "Hotel ID")
    private Long hotelId;
   // @NotNull
  //  @ApiModelProperty(value = "Parent ID ")
    private String hotelName;
    private String hotelDesc;
    private String hotelPhone;
    private String hotelPhone2;
    private String hotelAddress;
    private String hotelWhatsapp;
    private String hotelEmail;
    private String hotelAboutUs;
    private String hotelLocation;
    private String hotelLocationLink;
    private String hotelSocialMedia1;
    private String hotelSocialMedia2;
    private String hotelSocialMedia3;

}