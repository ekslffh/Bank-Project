package com.example.bank.entity;

import com.example.bank.entity.Account;
import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;

    @OneToMany
    List<Account> accountList = new ArrayList<>();
}
