package com.example.findmin;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/calculate")
public class CalculationController {

    @PostMapping
    public CalculationDto calculateMinimum(@RequestParam List<MultipartFile> file) throws IOException {
        MultipartFile f1 = file.get(0);
        String content = new String(f1.getBytes());
        String[] ordered = content.split("\n");
        int minimum = Integer.parseInt(ordered[0]);
        int line = 1;
        int currentLine = 1;
        for (int i =1; i < ordered.length; i++) {
            currentLine++;
            int number = Integer.parseInt(ordered[i]);
            if (minimum > number) {
                minimum = number;
                line = currentLine;
            }
        }
        CalculationDto dto = new CalculationDto();
        dto.setMinimum(minimum);
        dto.setLine(line);
        return dto;
    }
}
