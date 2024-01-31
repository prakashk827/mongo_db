package com.wdu.productservice.invoice.controller;

import com.wdu.productservice.invoice.dto.FromAddressDTO;
import com.wdu.productservice.invoice.service.InvoiceService;
import com.wdu.productservice.invoice.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/invoice")
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;


    @PostMapping("/create")
    public ResponseEntity<Response> createNewInvoice(@RequestBody FromAddressDTO fromAddressDTO) {
        return invoiceService.createNewInvoice(fromAddressDTO);
    }

}
