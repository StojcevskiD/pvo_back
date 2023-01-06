package com.example.findmin;


import org.springframework.web.multipart.MultipartFile;

public class RequestDto {
    public MultipartFile file;

    public RequestDto() {
    }

    public RequestDto(MultipartFile file) {
        this.file = file;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
