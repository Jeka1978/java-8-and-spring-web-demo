package com.exlibris.springwebdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "banks")
public class Bank {
    @Id
    @GeneratedValue
    private int id;
    private long amount;

    public Bank(long amount) {
        this.amount = amount;
    }
}
