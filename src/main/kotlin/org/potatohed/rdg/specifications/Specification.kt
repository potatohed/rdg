package org.potatohed.rdg.specifications

interface Specification<S> {
    fun apply(target : S)
}