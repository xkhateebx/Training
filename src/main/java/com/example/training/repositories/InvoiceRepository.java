package com.example.training.repositories;

import com.example.training.models.Invoice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InvoiceRepository extends CrudRepository<Invoice,Long> {
    List<Invoice> findAll();
    List<Invoice>findAllByOwnerId(Long id);
}
