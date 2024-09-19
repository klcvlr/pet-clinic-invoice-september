package com.petclinic.invoice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class InvoiceService {

    private RestClient restClient;

    public InvoiceService(RestClient restClient) {
        this.restClient = restClient;
    }

    public Invoice generateInvoice(Integer id) {
        return restClient.get()
                .uri("http://localhost:8080/visit/" + id)
                .retrieve()
                .body(Invoice.class);
    }
}
