package org.potatohed.rdg.objects.room

import org.potatohed.rdg.objects.item.Item

class RectangularRoom : Room {
    override val items: List<Item>
        get() = emptyList()
}