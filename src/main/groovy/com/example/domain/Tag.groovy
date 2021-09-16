package com.example.domain

import io.micronaut.data.annotation.MappedEntity

import javax.persistence.EmbeddedId

@MappedEntity(value = 'template_tag')
class Tag {

    @EmbeddedId
    TagPK id

}
