package com.example.ganjoor.Model.faal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Top6RelatedSection {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("poemId")
@Expose
private Integer poemId;
@SerializedName("poem")
@Expose
private Object poem;
@SerializedName("sectionIndex")
@Expose
private Integer sectionIndex;
@SerializedName("poetId")
@Expose
private Integer poetId;
@SerializedName("relationOrder")
@Expose
private Integer relationOrder;
@SerializedName("poetName")
@Expose
private String poetName;
@SerializedName("poetImageUrl")
@Expose
private String poetImageUrl;
@SerializedName("fullUrl")
@Expose
private String fullUrl;
@SerializedName("fullTitle")
@Expose
private String fullTitle;
@SerializedName("htmlExcerpt")
@Expose
private String htmlExcerpt;
@SerializedName("targetPoemId")
@Expose
private Integer targetPoemId;
@SerializedName("targetSectionIndex")
@Expose
private Integer targetSectionIndex;
@SerializedName("poetMorePoemsLikeThisCount")
@Expose
private Integer poetMorePoemsLikeThisCount;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Integer getPoemId() {
return poemId;
}

public void setPoemId(Integer poemId) {
this.poemId = poemId;
}

public Object getPoem() {
return poem;
}

public void setPoem(Object poem) {
this.poem = poem;
}

public Integer getSectionIndex() {
return sectionIndex;
}

public void setSectionIndex(Integer sectionIndex) {
this.sectionIndex = sectionIndex;
}

public Integer getPoetId() {
return poetId;
}

public void setPoetId(Integer poetId) {
this.poetId = poetId;
}

public Integer getRelationOrder() {
return relationOrder;
}

public void setRelationOrder(Integer relationOrder) {
this.relationOrder = relationOrder;
}

public String getPoetName() {
return poetName;
}

public void setPoetName(String poetName) {
this.poetName = poetName;
}

public String getPoetImageUrl() {
return poetImageUrl;
}

public void setPoetImageUrl(String poetImageUrl) {
this.poetImageUrl = poetImageUrl;
}

public String getFullUrl() {
return fullUrl;
}

public void setFullUrl(String fullUrl) {
this.fullUrl = fullUrl;
}

public String getFullTitle() {
return fullTitle;
}

public void setFullTitle(String fullTitle) {
this.fullTitle = fullTitle;
}

public String getHtmlExcerpt() {
return htmlExcerpt;
}

public void setHtmlExcerpt(String htmlExcerpt) {
this.htmlExcerpt = htmlExcerpt;
}

public Integer getTargetPoemId() {
return targetPoemId;
}

public void setTargetPoemId(Integer targetPoemId) {
this.targetPoemId = targetPoemId;
}

public Integer getTargetSectionIndex() {
return targetSectionIndex;
}

public void setTargetSectionIndex(Integer targetSectionIndex) {
this.targetSectionIndex = targetSectionIndex;
}

public Integer getPoetMorePoemsLikeThisCount() {
return poetMorePoemsLikeThisCount;
}

public void setPoetMorePoemsLikeThisCount(Integer poetMorePoemsLikeThisCount) {
this.poetMorePoemsLikeThisCount = poetMorePoemsLikeThisCount;
}

}
