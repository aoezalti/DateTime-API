package com.example.datetimeapi;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;


@RestController
public class DateTimeController {

    DateTime dateTime = new DateTime();

        @RequestMapping("/api/today")
        public LocalDate date(){
            return dateTime.getDate();
        }

}
