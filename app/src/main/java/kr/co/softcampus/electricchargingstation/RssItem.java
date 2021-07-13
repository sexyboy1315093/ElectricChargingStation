package kr.co.softcampus.electricchargingstation;

import org.w3c.dom.NodeList;

public class RssItem {

    private String addr;
    private String chargeTp;
    private String cpId;
    private String cpNm;
    private String lat;
    private String longi;

    public RssItem(){

    }

    public RssItem(String addr, String chargeTp, String cpId, String cpNm, String lat, String longi){
        this.addr = addr;
        this.chargeTp = chargeTp;
        this.cpId = cpId;
        this.cpNm = cpNm;
        this.lat = lat;
        this.longi = longi;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getChargeTp() {
        return chargeTp;
    }

    public void setChargeTp(String chargeTp) {
        this.chargeTp = chargeTp;
    }

    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    public String getCpNm() {
        return cpNm;
    }

    public void setCpNm(String cpNm) {
        this.cpNm = cpNm;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLongi() {
        return longi;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }
}
