package org.javaguru.mentor.lesson_14_refactoring.homework.level_5_middle.gildedrose;

import java.util.ArrayList;
import java.util.List;

class GildedRoseDemo {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		items.add(new Item("+5 Dexterity Vest", 10, 20));
		items.add(new Item("Aged Brie", 2, 0));
		items.add(new Item("Elixir of the Mongoose", 5, 7));
		items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new Item("Conjured Mana Cake", 3, 6));

		GildedRose gildedRose = new GildedRose();
		gildedRose.updateQuality(items);
	}

}