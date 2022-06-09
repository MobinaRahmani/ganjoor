package com.example.ganjoor.Model.faal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Verse {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("vOrder")
@Expose
private Integer vOrder;
@SerializedName("coupletIndex")
@Expose
private Integer coupletIndex;
@SerializedName("versePosition")
@Expose
private Integer versePosition;
@SerializedName("sectionIndex1")
@Expose
private Integer sectionIndex1;
@SerializedName("sectionIndex2")
@Expose
private Object sectionIndex2;
@SerializedName("sectionIndex3")
@Expose
private Object sectionIndex3;
@SerializedName("sectionIndex4")
@Expose
private Object sectionIndex4;
@SerializedName("text")
@Expose
private String text;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Integer getvOrder() {
return vOrder;
}

public void setvOrder(Integer vOrder) {
this.vOrder = vOrder;
}

public Integer getCoupletIndex() {
return coupletIndex;
}

public void setCoupletIndex(Integer coupletIndex) {
this.coupletIndex = coupletIndex;
}

public Integer getVersePosition() {
return versePosition;
}

public void setVersePosition(Integer versePosition) {
this.versePosition = versePosition;
}

public Integer getSectionIndex1() {
return sectionIndex1;
}

public void setSectionIndex1(Integer sectionIndex1) {
this.sectionIndex1 = sectionIndex1;
}

public Object getSectionIndex2() {
return sectionIndex2;
}

public void setSectionIndex2(Object sectionIndex2) {
this.sectionIndex2 = sectionIndex2;
}

public Object getSectionIndex3() {
return sectionIndex3;
}

public void setSectionIndex3(Object sectionIndex3) {
this.sectionIndex3 = sectionIndex3;
}

public Object getSectionIndex4() {
return sectionIndex4;
}

public void setSectionIndex4(Object sectionIndex4) {
this.sectionIndex4 = sectionIndex4;
}

public String getText() {
return text;
}

public void setText(String text) {
this.text = text;
}

}