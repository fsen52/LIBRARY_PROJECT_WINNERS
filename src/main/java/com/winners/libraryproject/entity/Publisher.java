package com.winners.libraryproject.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="publishers")
public class Publisher {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    @Size(min= 2, max = 50)
    @NotNull(message = "Please enter a valid Name!")
    @Column(nullable = false)
    private String name;



    @Column(nullable = false)
    private Boolean builtIn= false;




   /* @ManyToMany(fetch = FetchType.LAZY, mappedBy = "publishers")
    private Set<Book> books = new HashSet<Book>();*/














}