package com.itc475.finalproject.controller;

import com.itc475.finalproject.model.Inquiry;
import com.itc475.finalproject.service.InquiryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class InquiryController {
    private final InquiryService inquiryService;

    public InquiryController(InquiryService inquiryService) {
        this.inquiryService = inquiryService;
    }

    @GetMapping("/inquiry")
    public String inquiryForm() {
        return "inquiry";
    }

    @PostMapping("/inquiry")
    public String submitInquiry(@ModelAttribute Inquiry inquiry) {
        inquiryService.addInquiry(inquiry);
        return "redirect:/inquiry?success";
    }
}