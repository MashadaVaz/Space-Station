package com.spring.spacestation.model;

public class Location {
    private String name;
    private int id;
    private double latitude;
    private double longitude;
    private double altitude;
    private double velocity;
    private String visibility;
    private double footprint;
    private double timestamp;
    private double daynum;
    private double solar_lat;
    private double solar_lon;
    private String units;

    public Location() {
    }

    public Location(String name, int id, double latitude, double longitude, double altitude, double velocity, String visibility, double footprint, double timestamp, double daynum, double solar_lat, double solar_lon, String units) {
        this.name = name;
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.velocity = velocity;
        this.visibility = visibility;
        this.footprint = footprint;
        this.timestamp = timestamp;
        this.daynum = daynum;
        this.solar_lat = solar_lat;
        this.solar_lon = solar_lon;
        this.units = units;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
