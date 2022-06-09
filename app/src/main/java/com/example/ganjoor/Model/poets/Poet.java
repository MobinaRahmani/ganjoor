package com.example.ganjoor.Model.poets;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Poet {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("description")
@Expose
private Object description;
@SerializedName("fullUrl")
@Expose
private String fullUrl;
@SerializedName("rootCatId")
@Expose
private Integer rootCatId;
@SerializedName("nickname")
@Expose
private String nickname;
@SerializedName("published")
@Expose
private Boolean published;
@SerializedName("imageUrl")
@Expose
private String imageUrl;
@SerializedName("birthYearInLHijri")
@Expose
private Integer birthYearInLHijri;
@SerializedName("validBirthDate")
@Expose
private Boolean validBirthDate;
@SerializedName("deathYearInLHijri")
@Expose
private Integer deathYearInLHijri;
@SerializedName("validDeathDate")
@Expose
private Boolean validDeathDate;
@SerializedName("pinOrder")
@Expose
private Integer pinOrder;
@SerializedName("birthPlace")
@Expose
private String birthPlace;
@SerializedName("birthPlaceLatitude")
@Expose
private Double birthPlaceLatitude;
@SerializedName("birthPlaceLongitude")
@Expose
private Double birthPlaceLongitude;
@SerializedName("deathPlace")
@Expose
private String deathPlace;
@SerializedName("deathPlaceLatitude")
@Expose
private Double deathPlaceLatitude;
@SerializedName("deathPlaceLongitude")
@Expose
private Double deathPlaceLongitude;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Object getDescription() {
return description;
}

public void setDescription(Object description) {
this.description = description;
}

public String getFullUrl() {
return fullUrl;
}

public void setFullUrl(String fullUrl) {
this.fullUrl = fullUrl;
}

public Integer getRootCatId() {
return rootCatId;
}

public void setRootCatId(Integer rootCatId) {
this.rootCatId = rootCatId;
}

public String getNickname() {
return nickname;
}

public void setNickname(String nickname) {
this.nickname = nickname;
}

public Boolean getPublished() {
return published;
}

public void setPublished(Boolean published) {
this.published = published;
}

public String getImageUrl() {
return imageUrl;
}

public void setImageUrl(String imageUrl) {
this.imageUrl = imageUrl;
}

public Integer getBirthYearInLHijri() {
return birthYearInLHijri;
}

public void setBirthYearInLHijri(Integer birthYearInLHijri) {
this.birthYearInLHijri = birthYearInLHijri;
}

public Boolean getValidBirthDate() {
return validBirthDate;
}

public void setValidBirthDate(Boolean validBirthDate) {
this.validBirthDate = validBirthDate;
}

public Integer getDeathYearInLHijri() {
return deathYearInLHijri;
}

public void setDeathYearInLHijri(Integer deathYearInLHijri) {
this.deathYearInLHijri = deathYearInLHijri;
}

public Boolean getValidDeathDate() {
return validDeathDate;
}

public void setValidDeathDate(Boolean validDeathDate) {
this.validDeathDate = validDeathDate;
}

public Integer getPinOrder() {
return pinOrder;
}

public void setPinOrder(Integer pinOrder) {
this.pinOrder = pinOrder;
}

public String getBirthPlace() {
return birthPlace;
}

public void setBirthPlace(String birthPlace) {
this.birthPlace = birthPlace;
}

public Double getBirthPlaceLatitude() {
return birthPlaceLatitude;
}

public void setBirthPlaceLatitude(Double birthPlaceLatitude) {
this.birthPlaceLatitude = birthPlaceLatitude;
}

public Double getBirthPlaceLongitude() {
return birthPlaceLongitude;
}

public void setBirthPlaceLongitude(Double birthPlaceLongitude) {
this.birthPlaceLongitude = birthPlaceLongitude;
}

public String getDeathPlace() {
return deathPlace;
}

public void setDeathPlace(String deathPlace) {
this.deathPlace = deathPlace;
}

public Double getDeathPlaceLatitude() {
return deathPlaceLatitude;
}

public void setDeathPlaceLatitude(Double deathPlaceLatitude) {
this.deathPlaceLatitude = deathPlaceLatitude;
}

public Double getDeathPlaceLongitude() {
return deathPlaceLongitude;
}

public void setDeathPlaceLongitude(Double deathPlaceLongitude) {
this.deathPlaceLongitude = deathPlaceLongitude;
}

}