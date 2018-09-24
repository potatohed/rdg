package org.potatohed.rdg.generators

import org.potatohed.rdg.specifications.Specification

interface Generator<G> {
    fun generate(specs : Specification<G>) : G
}