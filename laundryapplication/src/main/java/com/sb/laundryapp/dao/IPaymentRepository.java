package com.sb.laundryapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.laundryapp.beans.Payment;



@Repository
public interface IPaymentRepository extends JpaRepository<Payment, Long> {

}
