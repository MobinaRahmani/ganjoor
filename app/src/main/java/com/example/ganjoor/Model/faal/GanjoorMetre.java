package com.example.ganjoor.Model.faal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GanjoorMetre {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("urlSlug")
@Expose
private Object urlSlug;
@SerializedName("rhythm")
@Expose
private String rhythm;
@SerializedName("name")
@Expose
private Object name;
@SerializedName("description")
@Expose
private Object description;
@SerializedName("verseCount")
@Expose
private Integer verseCount;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Object getUrlSlug() {
return urlSlug;
}

public void setUrlSlug(Object urlSlug) {
this.urlSlug = urlSlug;
}

public String getRhythm() {
return rhythm;
}

public void setRhythm(String rhythm) {
this.rhythm = rhythm;
}

public Object getName() {
return name;
}

public void setName(Object name) {
this.name = name;
}

public Object getDescription() {
return description;
}

public void setDescription(Object description) {
this.description = description;
}

public Integer getVerseCount() {
return verseCount;
}

public void setVerseCount(Integer verseCount) {
this.verseCount = verseCount;
}

}
