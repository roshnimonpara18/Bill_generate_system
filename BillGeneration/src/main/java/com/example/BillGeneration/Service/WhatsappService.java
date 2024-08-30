package com.example.BillGeneration.Service;

import com.example.BillGeneration.Configration.TwilioConfiguration;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class WhatsappService {

        @Autowired
        private TwilioConfiguration twilioConfig;

        public void sendWhatsAppMessage(String customerNumber, String message) {

            String customerPhoneNumber = "+" + customerNumber;

            Message.creator(
                    new PhoneNumber("whatsapp:+916356774910"),
                    new PhoneNumber("whatsapp:+14155238886"),
                    message
            ).create();

            System.out.println("WhatsApp message sent to customer ID: " + customerPhoneNumber + " with message: " + message);
        }
}
