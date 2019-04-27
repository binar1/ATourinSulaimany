package com.example.developer.atourinsulaimany;

/**
 * Created by binar on 20/10/2017.
 */

public class Item {

  private int name;
  private int location;
  private int url;

  public  Item(int name,int location,int imageurl)
  {
   this.name=name;
    this.location=location;
    this.url=imageurl;

  }

  public void setName(int name){this.name=name;}
  public int getName() {return this.name;}
  public void setLocation(int location){ this.location=location;}
  public int getLocation(){return this.location;}
  public void setUrl(int url){this.url=url;}
  public int getUrl(){return this.url;}





}
