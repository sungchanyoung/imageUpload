package com.korit.fileupload_back.dto;

import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter

public class RequestFileUpLoadDto {

    private  String title;
    private List <MultipartFile> img;
}
