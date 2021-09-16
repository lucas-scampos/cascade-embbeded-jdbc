package com.example

import com.example.domain.Tag
import com.example.domain.TagPK
import com.example.domain.Template
import com.example.repository.TemplateRepository
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Single
import jakarta.inject.Inject

import javax.transaction.Transactional

@Controller("/")
class ControllerTest {

    @Inject TemplateRepository templateRepository

    @Transactional
    @Get(uri = "/{id}")
    HttpResponse get(Long id) {
        Template template = new Template()
        template.name = "Template test"

        Tag tag = new Tag()
        TagPK tagPK = new TagPK()
        tagPK.tag = "New tag"
        tagPK.template = template
        tag.id = tagPK

        template.tags << tag


        templateRepository.save(template)
        return HttpResponse.ok()
    }
}