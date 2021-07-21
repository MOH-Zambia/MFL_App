package com.moh.mfl.model;

import java.util.ArrayList;

public class FacilityResponse {
    private Boolean success;
    private String message;
    private ArrayList<Facility> data = new ArrayList<>();

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public ArrayList<Facility> getData() {
        return data;
    }

    public void setData(ArrayList<Facility> data) {
        this.data = data;
    }
}
