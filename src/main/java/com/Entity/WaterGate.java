package com.Entity;

/**
 * 水闸管理系统的水闸类。内部属性包括水闸的编号、名称、建成时间
 * 负责人、经度、纬度、简介等。
 */
public class WaterGate {

    private String id;
    private String name;
    private String buildTime;
    private String master;
    private double longitude;
    private double latitude;
    private String introduction;

    /**
     * 水闸类的构造函数。用于初始化水闸实例。
     *
     * @param id           编号
     * @param name         水闸名
     * @param buildTime    建成时间
     * @param master       负责人
     * @param longitude    经度
     * @param latitude     纬度
     * @param introduction 简介
     */
    public WaterGate(String id, String name, String buildTime, String master, double longitude, double latitude, String introduction) {
        this.id = id;
        this.name = name;
        this.buildTime = buildTime;
        this.master = master;
        this.longitude = longitude;
        this.latitude = latitude;
        this.introduction = introduction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "WaterGate{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", buildTime='" + buildTime + '\'' +
                ", master='" + master + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
