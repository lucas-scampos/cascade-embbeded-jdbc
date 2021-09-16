package com.example.domain

import io.micronaut.core.annotation.NonNull
import io.micronaut.data.annotation.Embeddable

import javax.persistence.Column
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Embeddable
class TagPK implements Serializable {

    static final long serialVersionUID = 1L

    @NonNull
    @Column(name = "tag")
    String tag

    @ManyToOne
    @JoinColumn(name = "template_id")
    @Column(name = "template_id")
    Template template

    @Override
    boolean equals(o) {
        if (this.is(o)) {
            return true
        }
        if (getClass() != o.class) {
            return false
        }

        TagPK that = (TagPK) o

        if (tag != that.tag) {
            return false
        }
        return template == that.template
    }

    @Override
    int hashCode() {
        int result
        result = tag.hashCode()
        result = 31 * result + (template != null ? template.hashCode() : 0)
        return result
    }
}
