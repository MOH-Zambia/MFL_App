package com.moh.mfl.model;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Facility {
    private Long id;
    private String name;
    private String dhis2Uid;
    private String hmisUid;
    private String smartcareGuid;
    private String elmisId;
    private String ihrisId;
    private String ownersip;
    private String operationStatus;
    private String facilityType;
    private Integer numberOfBeds;
    private Integer numberOfCots;
    private Integer numberOfNurses;
    private Integer numberOfDoctors;
    private String addressLine;
    private String addressLine2;
    private String postalAddress;
    private String webAddress;
    private String email;
    private String phone;
    private String mobile;
    private String fax;
    private Integer catchmentPopulationHeadCount;
    private Integer catchmentPopulationCso;
    private String longitude;
    private String latitude;
    private String geom;
    private String locationType;
    private String ward;
    private String constituency;
    private String district;
    private String province;
    private Integer numberOfParamedics;
    private Integer numberOfMidwives;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDhis2Uid() {
        return dhis2Uid;
    }

    public void setDhis2Uid(String dhis2Uid) {
        this.dhis2Uid = dhis2Uid;
    }

    public String getHmisUid() {
        return hmisUid;
    }

    public void setHmisUid(String hmisUid) {
        this.hmisUid = hmisUid;
    }

    public String getSmartcareGuid() {
        return smartcareGuid;
    }

    public void setSmartcareGuid(String smartcareGuid) {
        this.smartcareGuid = smartcareGuid;
    }

    public String getElmisId() {
        return elmisId;
    }

    public void setElmisId(String elmisId) {
        this.elmisId = elmisId;
    }

    public String getIhrisId() {
        return ihrisId;
    }

    public void setIhrisId(String ihrisId) {
        this.ihrisId = ihrisId;
    }

    public String getOwnersip() {
        return ownersip;
    }

    public void setOwnersip(String ownersip) {
        this.ownersip = ownersip;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Integer getNumberOfCots() {
        return numberOfCots;
    }

    public void setNumberOfCots(Integer numberOfCots) {
        this.numberOfCots = numberOfCots;
    }

    public Integer getNumberOfNurses() {
        return numberOfNurses;
    }

    public void setNumberOfNurses(Integer numberOfNurses) {
        this.numberOfNurses = numberOfNurses;
    }

    public Integer getNumberOfDoctors() {
        return numberOfDoctors;
    }

    public void setNumberOfDoctors(Integer numberOfDoctors) {
        this.numberOfDoctors = numberOfDoctors;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Integer getCatchmentPopulationHeadCount() {
        return catchmentPopulationHeadCount;
    }

    public void setCatchmentPopulationHeadCount(Integer catchmentPopulationHeadCount) {
        this.catchmentPopulationHeadCount = catchmentPopulationHeadCount;
    }

    public Integer getCatchmentPopulationCso() {
        return catchmentPopulationCso;
    }

    public void setCatchmentPopulationCso(Integer catchmentPopulationCso) {
        this.catchmentPopulationCso = catchmentPopulationCso;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getNumberOfParamedics() {
        return numberOfParamedics;
    }

    public void setNumberOfParamedics(Integer numberOfParamedics) {
        this.numberOfParamedics = numberOfParamedics;
    }

    public Integer getNumberOfMidwives() {
        return numberOfMidwives;
    }

    public void setNumberOfMidwives(Integer numberOfMidwives) {
        this.numberOfMidwives = numberOfMidwives;
    }
}
