package org.potatohed.rdg.objects.room

import org.potatohed.rdg.objects.item.Item

interface Room {
    val items :List<Item>
}