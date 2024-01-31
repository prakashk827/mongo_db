package com.wdu.productservice.invoice;

import com.wdu.productservice.invoice.model.FromAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceRepository extends MongoRepository<FromAddress, String> {
}
