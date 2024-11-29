package com.example.model;

public class Restaurant {
    private Long id;
    private String name;
    private String category;
    private String address;
    private double lat;
    private double lng;
    private double rating;
    private int reviewCount;
    private String imageUrl;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public double getLat() { return lat; }
    public void setLat(double lat) { this.lat = lat; }
    
    public double getLng() { return lng; }
    public void setLng(double lng) { this.lng = lng; }
    
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
    
    public int getReviewCount() { return reviewCount; }
    public void setReviewCount(int reviewCount) { this.reviewCount = reviewCount; }
    
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
