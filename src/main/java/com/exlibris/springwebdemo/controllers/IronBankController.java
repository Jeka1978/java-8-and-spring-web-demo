package com.exlibris.springwebdemo.controllers;

import com.exlibris.springwebdemo.model.Person;
import com.exlibris.springwebdemo.sevices.MoneyService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/iron-bank")
@RequiredArgsConstructor
public class IronBankController {
    private final MoneyService moneyService;


    @GetMapping("/loan")
    public String loan(@RequestParam("name") String name, @RequestParam("amount") long amount) {
        long answer = moneyService.loan(name, amount);
        if (answer == -1) {
            return "declined, you will not survive the winter, or we don't have enough money, or we just don't like you";
        }else {
            return " money was transfered, current remaining balance is: " + answer;
        }
    }








    @GetMapping("/ping")
    public String ping() {
        return "Game of thrones...";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "hello " + name;
    }

    @GetMapping("/hello")
    public String hello2(@RequestParam(value = "name", defaultValue = "Stark") String name) {
        return "hello " + name;
    }

    @PostMapping("/inc_age")
    public Person incAge(@RequestBody Person person) {
        System.out.println(person + " recieved");
        return Person.builder()
                .name(person.getName())
                .address(person.getAddress())
                .age(person.getAge() + 1)
                .build();
    }


    @SneakyThrows
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Jeka")
                .address("Isarael")
                .age(39)
                .build();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(person);
        System.out.println("json = " + json);
        Person person1 = mapper.readValue(json, Person.class);
        System.out.println("person1 = " + person1);
    }


}







