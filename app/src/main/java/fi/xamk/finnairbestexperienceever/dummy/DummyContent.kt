package fi.xamk.finnairbestexperienceever.dummy

import java.util.*

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()


    private val COUNT = DummyData.OFFERS.size

    init {
        // Add some sample items.
        for (i in 0 until COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int): DummyItem {
        return DummyItem(DummyData.OFFERS[position][0], DummyData.OFFERS[position][1], DummyData.OFFERS[position][2])
    }

    /**
     * A dummy item representing a piece of content.
     */
    class DummyItem(val id: String, val img: String, val details: String) {

    }
}
