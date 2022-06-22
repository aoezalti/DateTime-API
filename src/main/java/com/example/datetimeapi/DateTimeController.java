package com.example.datetimeapi;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


@RestController
public class DateTimeController {

    DateTime dateTime = new DateTime();

        @RequestMapping("/api/today")
        public LocalDate date(){
            return dateTime.getDate();
        }


    @GetMapping("/api/now")
    public String formattedDate(@RequestParam(required = false) String format){
            if(format != null){
                DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern(format);
                return customFormatter.format(LocalTime.now());
            }
        else {
            return dateTime.getTime().toString();
            }
    }


}
