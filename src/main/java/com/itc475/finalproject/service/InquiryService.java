package com.itc475.finalproject.service;

import com.itc475.finalproject.mapper.InquiryMapper;
import com.itc475.finalproject.model.Inquiry;
import org.springframework.stereotype.Service;

@Service
public class InquiryService {
    private final InquiryMapper inquiryMapper;

    public InquiryService(InquiryMapper inquiryMapper) {
        this.inquiryMapper = inquiryMapper;
    }

    public void addInquiry(Inquiry inquiry) {
        inquiryMapper.insert(inquiry);
    }
}