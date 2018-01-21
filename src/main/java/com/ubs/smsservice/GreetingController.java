package com.ubs.smsservice;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

    @Autowired
    SmsService smsService;

    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "AC8af8fe0565035d36100a6eeb34aa5ce4";
    public static final String AUTH_TOKEN = "3bd4265016767b8185a95ecd5158032f";

    @RequestMapping("/greeting")
    public String greeting() {
        smsService.sendSms();
        return "greeting";
    }

}
