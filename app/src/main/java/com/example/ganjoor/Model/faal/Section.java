package com.example.ganjoor.Model.faal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Section {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("poemId")
@Expose
private Integer poemId;
@SerializedName("poem")
@Expose
private Object poem;
@SerializedName("poetId")
@Expose
private Integer poetId;
@SerializedName("poet")
@Expose
private Object poet;
@SerializedName("index")
@Expose
private Integer index;
@SerializedName("number")
@Expose
private Integer number;
@SerializedName("sectionType")
@Expose
private Integer sectionType;
@SerializedName("verseType")
@Expose
private Integer verseType;
@SerializedName("ganjoorMetreId")
@Expose
private Integer ganjoorMetreId;
@SerializedName("ganjoorMetre")
@Expose
private GanjoorMetre ganjoorMetre;
@SerializedName("ganjoorMetreRefSectionIndex")
@Expose
private Object ganjoorMetreRefSectionIndex;
@SerializedName("rhymeLetters")
@Expose
private String rhymeLetters;
@SerializedName("plainText")
@Expose
private String plainText;
@SerializedName("htmlText")
@Expose
private String htmlText;
@SerializedName("poemFormat")
@Expose
private Integer poemFormat;
@SerializedName("cachedFirstCoupletIndex")
@Expose
private Integer cachedFirstCoupletIndex;
@SerializedName("top6RelatedSections")
@Expose
private List<Top6RelatedSection> top6RelatedSections = null;
@SerializedName("oldGanjoorMetreId")
@Expose
private Object oldGanjoorMetreId;
@SerializedName("oldRhymeLetters")
@Expose
private Object oldRhymeLetters;
@SerializedName("modified")
@Expose
private Boolean modified;
@SerializedName("excerpt")
@Expose
private Object excerpt;

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

public Integer getPoetId() {
return poetId;
}

public void setPoetId(Integer poetId) {
this.poetId = poetId;
}

public Object getPoet() {
return poet;
}

public void setPoet(Object poet) {
this.poet = poet;
}

public Integer getIndex() {
return index;
}

public void setIndex(Integer index) {
this.index = index;
}

public Integer getNumber() {
return number;
}

public void setNumber(Integer number) {
this.number = number;
}

public Integer getSectionType() {
return sectionType;
}

public void setSectionType(Integer sectionType) {
this.sectionType = sectionType;
}

public Integer getVerseType() {
return verseType;
}

public void setVerseType(Integer verseType) {
this.verseType = verseType;
}

public Integer getGanjoorMetreId() {
return ganjoorMetreId;
}

public void setGanjoorMetreId(Integer ganjoorMetreId) {
this.ganjoorMetreId = ganjoorMetreId;
}

public GanjoorMetre getGanjoorMetre() {
return ganjoorMetre;
}

public void setGanjoorMetre(GanjoorMetre ganjoorMetre) {
this.ganjoorMetre = ganjoorMetre;
}

public Object getGanjoorMetreRefSectionIndex() {
return ganjoorMetreRefSectionIndex;
}

public void setGanjoorMetreRefSectionIndex(Object ganjoorMetreRefSectionIndex) {
this.ganjoorMetreRefSectionIndex = ganjoorMetreRefSectionIndex;
}

public String getRhymeLetters() {
return rhymeLetters;
}

public void setRhymeLetters(String rhymeLetters) {
this.rhymeLetters = rhymeLetters;
}

public String getPlainText() {
return plainText;
}

public void setPlainText(String plainText) {
this.plainText = plainText;
}

public String getHtmlText() {
return htmlText;
}

public void setHtmlText(String htmlText) {
this.htmlText = htmlText;
}

public Integer getPoemFormat() {
return poemFormat;
}

public void setPoemFormat(Integer poemFormat) {
this.poemFormat = poemFormat;
}

public Integer getCachedFirstCoupletIndex() {
return cachedFirstCoupletIndex;
}

public void setCachedFirstCoupletIndex(Integer cachedFirstCoupletIndex) {
this.cachedFirstCoupletIndex = cachedFirstCoupletIndex;
}

public List<Top6RelatedSection> getTop6RelatedSections() {
return top6RelatedSections;
}

public void setTop6RelatedSections(List<Top6RelatedSection> top6RelatedSections) {
this.top6RelatedSections = top6RelatedSections;
}

public Object getOldGanjoorMetreId() {
return oldGanjoorMetreId;
}

public void setOldGanjoorMetreId(Object oldGanjoorMetreId) {
this.oldGanjoorMetreId = oldGanjoorMetreId;
}

public Object getOldRhymeLetters() {
return oldRhymeLetters;
}

public void setOldRhymeLetters(Object oldRhymeLetters) {
this.oldRhymeLetters = oldRhymeLetters;
}

public Boolean getModified() {
return modified;
}

public void setModified(Boolean modified) {
this.modified = modified;
}

public Object getExcerpt() {
return excerpt;
}

public void setExcerpt(Object excerpt) {
this.excerpt = excerpt;
}

}
