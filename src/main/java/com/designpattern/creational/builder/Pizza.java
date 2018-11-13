package com.designpattern.creational.builder;

public class Pizza {
	 	private String dough = "";
	    private String sauce = "";
	    private String topping = "";

	    void setDough(String dough) {
	        this.dough = dough;
	    }

	    void setSauce(String sauce) {
	        this.sauce = sauce;
	    }

	    public String getDough() {
			return dough;
		}

		public String getSauce() {
			return sauce;
		}

		public String getTopping() {
			return topping;
		}

		void setTopping(String topping) {
	        this.topping = topping;
	    }
}
