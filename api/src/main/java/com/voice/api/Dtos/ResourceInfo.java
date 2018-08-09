package com.voice.api.Dtos;

import java.util.Date;
import java.util.UUID;

public class ResourceInfo {
    private UUID uuid;
    private String Name;
    private Date createDate;
    private Date uploadDate;
    private boolean available;
    private String creator;
    private int uploadUserid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getUploadUserid() {
        return uploadUserid;
    }

    public void setUploadUserid(int uploadUserid) {
        this.uploadUserid = uploadUserid;
    }
}
