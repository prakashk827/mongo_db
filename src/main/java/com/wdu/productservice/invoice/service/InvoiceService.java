package com.wdu.productservice.invoice.service;

import com.wdu.productservice.invoice.InvoiceRepository;
import com.wdu.productservice.invoice.dto.FromAddressDTO;
import com.wdu.productservice.invoice.exception.CustomException;
import com.wdu.productservice.invoice.model.FromAddress;
import com.wdu.productservice.invoice.util.APIResponse;
import com.wdu.productservice.invoice.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {


    @Autowired
    InvoiceRepository invoiceRepository;

    public ResponseEntity<Response> createNewInvoice(FromAddressDTO fromAddressDTO) {
        FromAddress fromAddress;
        try {

            fromAddress = new FromAddress();
            fromAddress.setName(fromAddressDTO.getName());
            fromAddress.setEmail(fromAddressDTO.getEmail());
            fromAddress.setPhone(fromAddressDTO.getPhone());
            fromAddress.setAddress(fromAddressDTO.getAddress());
            fromAddress.setBusinessNumber(fromAddressDTO.getBusinessNumber());
            fromAddress.setWebsite(fromAddressDTO.getWebsite());
            fromAddress.setOwner(fromAddressDTO.getOwner());

        } catch (CustomException e) {
            throw CustomException.catchCustomException(e);
        } catch (Exception e) {
            throw CustomException.internalError();
        }

        return APIResponse.OK(fromAddress);





    }
}
