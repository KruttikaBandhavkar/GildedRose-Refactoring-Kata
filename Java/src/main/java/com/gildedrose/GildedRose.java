package com.gildedrose;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		ItemsFactory itemsFactory = new ItemsFactory();
		for (int i = 0; i < items.length; i++) {				
			//Call update method based on item type
			if(items[i].name.equals("Aged Brie")) {
				itemsFactory.new AgeBrie(items[i].name, items[i].sellIn, items[i].quality).update();			
			}
			else if(items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
				itemsFactory.new sulfuras(items[i].name, items[i].sellIn, items[i].quality).update();
			}
			else if(items[i].name.equals("Conjured")) {
				itemsFactory.new Conjured(items[i].name, items[i].sellIn, items[i].quality).update();
			}
			else if(items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
				itemsFactory.new BackstagePasses(items[i].name, items[i].sellIn, items[i].quality).update();
			}
			else {
				itemsFactory.new Regular(items[i].name, items[i].sellIn, items[i].quality).update();
			}		
			
			//Original code
			/*if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }*/
		}
	}
}