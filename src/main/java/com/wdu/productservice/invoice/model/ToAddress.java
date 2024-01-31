package com.wdu.productservice.invoice.model;

import com.wdu.productservice.invoice.dto.PersonalDetails;
import org.springframework.data.annotation.Id;

public class ToAddress extends PersonalDetails {

    @Id
    private String id;
    private String fromAddressId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFromAddressId() {
        return fromAddressId;
    }

    public void setFromAddressId(String fromAddressId) {
        this.fromAddressId = fromAddressId;
    }
}
