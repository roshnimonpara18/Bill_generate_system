package com.example.BillGeneration.Scheduler;

import com.example.BillGeneration.Service.EmailService;
import com.example.BillGeneration.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ReportScheduler {
        @Autowired
        private ReportService reportService;

        @Autowired
        private EmailService emailService;

        @Scheduled(cron = "0 41 10 * * *")
        public void sendReport() throws IOException {
            try {
                reportService.generateReport();
                emailService.sendReportEmail();
            } catch (IOException | jakarta.mail.MessagingException e) {
                e.printStackTrace();
            }
        }
}
