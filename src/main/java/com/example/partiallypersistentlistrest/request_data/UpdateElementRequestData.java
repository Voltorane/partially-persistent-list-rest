package com.example.partiallypersistentlistrest.request_data;

public class UpdateElementRequestData extends RequestData {
    private Integer oldElement;
    private Integer newElement;
    private Integer version;

    public UpdateElementRequestData() {
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getVersion() {
        return version;
    }

    public void setNewElement(Integer newElement) {
        this.newElement = newElement;
    }

    public Integer getNewElement() {
        return newElement;
    }

    public Integer getOldElement() {
        return oldElement;
    }

    public void setOldElement(Integer oldElement) {
        this.oldElement = oldElement;
    }

    @Override
    public boolean isValid() {
        return oldElement != null && newElement != null && version != null;
    }
}
