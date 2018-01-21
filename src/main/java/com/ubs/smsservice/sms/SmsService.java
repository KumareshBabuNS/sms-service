package com.ubs.smsservice.sms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;


@Service
public class SmsService {

    Logger logger = LoggerFactory
            .getLogger(SmsService.class);

    @Autowired
    SmsRepository smsRepo;

    public List<Sms> findByPhoneNumber(String phoneNumber) {
        return smsRepo.findByPhoneNumber(phoneNumber);
    }
}

