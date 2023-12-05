package com.model;

public class VCDBean {
	public String title;
	public String actor;
  	public float price;
  	public int quantity;

  	public VCDBean()
  	{
    	this.title = "";
    	this.actor = "";
    	this.price = 0;
    	this.quantity = 0;
  	}

  	public void setTitle(String title)
  	{
    	this.title = title;
  	}

  	public void setActor(String actor)
  	{
    	this.actor = actor;
  	}

  	public void setPrice(float price)
  	{
    	this.price = price;
  	}

  	public void setQuantity(int quantity)
  	{
    	this.quantity = quantity;
  	}

  	//*******************************************
  	public String getTitle()
  	{
    	return title;
  	}

  	public String getActor()
  	{
    	return actor;
  	}

  	public float getPrice()
  	{
    	return price;
  	}

  	public int getQuantity()
  	{
    	return quantity;
  	}

}
