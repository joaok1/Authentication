package com.example.Authentication.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
@Component
@Table(name = "lanche")
public class ListLancheIgrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;
    private String name;
    private Double valor;
}
