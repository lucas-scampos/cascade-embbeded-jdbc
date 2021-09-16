package com.example.domain

import io.micronaut.core.annotation.NonNull

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Template {

    @Id
    @GeneratedValue
    Long id

    @NonNull
    String name

    @OneToMany(mappedBy = "id.template", cascade = CascadeType.ALL)
    Set<Tag> tags = [] as Set


}
