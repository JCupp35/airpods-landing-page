package com.itc475.finalproject.mapper;

import com.itc475.finalproject.model.Inquiry;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InquiryMapper {
    void insert(Inquiry inquiry);
}