package com.client;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

import java.util.Arrays;

public class GeoIPClient {
    public static void main(String[] args) {
        GeoIPService geoIpService = new GeoIPService();
        GeoIPServiceSoap geo = geoIpService.getGeoIPServiceSoap();

        String request = "98.139.180.149";
        String response = geo.getIpLocation20(request);
        System.out.println("Klient wysłał: " + request);

        String[] params = response.split("Country");
        int start = params[1].indexOf('>');
        int end = params[1].indexOf('<');
        String country = "";
        while (start != end - 1) {
            country = country + params[1].charAt(++start);
        }

        System.out.println("Otrzymany kraj to: " + country);
    }
}
