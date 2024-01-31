package com.wdu.productservice.invoice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.wdu.productservice.invoice.dto.PersonalDetails;

@Document(collection = "from_address")
public class FromAddress extends PersonalDetails {

    @Id
    private String id;
}
