package com.gildedrose;

public class ItemsFactory {	

	class Regular extends Item{
		//If item is not one of the special items, regular rules will apply
		public Regular(String name, int sellIn, int quality) {
			super(name, sellIn, quality);
		}
		public void update() {
			this.sellIn--;
			if(checkAndSetQualityBounds()) {
				if (this.sellIn >= 0) {
					this.quality--;
				}
				else {
					this.quality = this.quality - 2;
				}
				checkAndSetQualityBounds();
			}
			return;
		}
		public boolean checkAndSetQualityBounds() {
			//Handle bad input and perform check on quality bounds
			if(this.quality <= 0) {
				//Do not allow quality to go below 0
				this.quality = 0;
				return false;
			}
			if(this.quality >= 50) {
				//Do not allow quality to go above 50
				this.quality = 50;
				return false;
			}
			return true;
		}
	}

	class AgeBrie extends Item{

		public AgeBrie(String name, int sellIn, int quality) {
			super(name, sellIn, quality);
			// TODO Auto-generated constructor stub
		}
		public void update() {
			this.sellIn--;
			if(checkAndSetQualityBounds()) {
				this.quality++; //Assumption: Quality does not increase faster (2X) after sellIn date
				checkAndSetQualityBounds();
			}
			return;
		}
		public boolean checkAndSetQualityBounds() {
			//Handle bad input and perform check on quality bounds
			if(this.quality <= 0) {
				//Do not allow quality to go below 0
				this.quality = 0;
				return false;
			}
			if(this.quality >= 50) {
				//Do not allow quality to go above 50
				this.quality = 50;
				return false;
			}
			return true;
		}
	}

	class sulfuras extends Item{

		public sulfuras(String name, int sellIn, int quality) {
			super(name, sellIn, quality);
			// TODO Auto-generated constructor stub

		}
		public void update() {
			//Legendary Item, quality is always 80 and is not affected ever.
		}
		
		//NOTE: Bounds check can be added here for sulfuras

	}

	class BackstagePasses extends Item {
		public BackstagePasses(String name, int sellIn, int quality) {
			super(name, sellIn, quality);
			// TODO Auto-generated constructor stub
		}

		public void update() {
			this.sellIn--;
			if(checkAndSetQualityBounds()) {
				//Perform sellIn expired check first
				if (this.sellIn < 0) {
					this.quality = 0;
				}
				else if(this.sellIn >= 10) {
					this.quality++;
				}
				else if (this.sellIn < 10 && this.sellIn >= 5) {
					this.quality = this.quality + 2;

				}
				else if (this.sellIn < 5) {
					this.quality = this.quality + 3;
				}
				checkAndSetQualityBounds();
			}
			return;
		}
		public boolean checkAndSetQualityBounds() {
			//Handle bad input and perform check on quality bounds
			if(this.quality <= 0) {
				//Do not allow quality to go below 0
				this.quality = 0;
				return false;
			}
			if(this.quality >= 50) {
				//Do not allow quality to go above 50
				this.quality = 50;
				return false;
			}
			return true;
		}	
		
	}

	class Conjured extends Item {		public Conjured(String name, int sellIn, int quality) {
			super(name, sellIn, quality);
			// TODO Auto-generated constructor stub
		}

		public void update() {
			this.sellIn--;
			if(checkAndSetQualityBounds()) {
				if (this.sellIn >= 0) {
					this.quality = this.quality - 2;
				}
				else {
					this.quality = this.quality - 4;
				}
				checkAndSetQualityBounds();
			}
			return;
		}
		public boolean checkAndSetQualityBounds() {
			//Handle bad input and perform check on quality bounds
			if(this.quality <= 0) {
				//Do not allow quality to go below 0
				this.quality = 0;
				return false;
			}
			if(this.quality >= 50) {
				//Do not allow quality to go above 50
				this.quality = 50;
				return false;
			}
			return true;
		}
	}
}