package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Skis");
        Product product2 = new Product("Bindings");
        Item item = new Item(BigDecimal.valueOf(10), 1, BigDecimal.valueOf(10));
        Item item2 = new Item(BigDecimal.valueOf(10), 2, BigDecimal.valueOf(20));
        Item item3 = new Item(BigDecimal.valueOf(20), 1, BigDecimal.valueOf(20));
        Item item4 = new Item(BigDecimal.valueOf(20), 2, BigDecimal.valueOf(40));
        item.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product2);
        item4.setProduct(product2);
        Invoice invoice1 = new Invoice("Ski Invoice");
        Invoice invoice2 = new Invoice("Binding Invoice");
        invoice1.getItems().add(item);
        invoice1.getItems().add(item2);
        invoice2.getItems().add(item3);
        invoice2.getItems().add(item4);
        item.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice2);
        item4.setInvoice(invoice2);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();

        //Then
        Assertions.assertNotEquals(0, invoice1Id);
        Assertions.assertNotEquals(0, invoice2Id);


        //Cleanup
        try {
            invoiceDao.deleteById(invoice1Id);
            invoiceDao.deleteById(invoice2Id);
        } catch (Exception e) {
            //nothing
        }
    }
}
