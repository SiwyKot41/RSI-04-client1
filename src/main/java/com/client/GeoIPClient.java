package com.client;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

public class GeoIPClient {
    public static void main(String[] args) {
        GeoIPService geoIpService = new GeoIPService();
        GeoIPServiceSoap geo = geoIpService.getGeoIPServiceSoap();

        String request = "98.139.180.149";
        String response = geo.getIpLocation20(request);
        System.out.println("Klient wysłał: " + request);
        System.out.println("Klient otrzymał: " + response);
    }
}
