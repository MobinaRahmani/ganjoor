package com.example.ganjoor.Model.faal;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Fal {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("title")
@Expose
private String title;
@SerializedName("fullTitle")
@Expose
private String fullTitle;
@SerializedName("urlSlug")
@Expose
private String urlSlug;
@SerializedName("fullUrl")
@Expose
private String fullUrl;
@SerializedName("plainText")
@Expose
private String plainText;
@SerializedName("htmlText")
@Expose
private String htmlText;
@SerializedName("sourceName")
@Expose
private String sourceName;
@SerializedName("sourceUrlSlug")
@Expose
private String sourceUrlSlug;
@SerializedName("oldTag")
@Expose
private Object oldTag;
@SerializedName("oldTagPageUrl")
@Expose
private Object oldTagPageUrl;
@SerializedName("mixedModeOrder")
@Expose
private Integer mixedModeOrder;
@SerializedName("published")
@Expose
private Boolean published;
@SerializedName("language")
@Expose
private Object language;
@SerializedName("category")
@Expose
private Object category;
@SerializedName("next")
@Expose
private Object next;
@SerializedName("previous")
@Expose
private Object previous;
@SerializedName("verses")
@Expose
private List<Verse> verses = null;
@SerializedName("recitations")
@Expose
private List<Recitation> recitations = null;
@SerializedName("images")
@Expose
private Object images;
@SerializedName("songs")
@Expose
private Object songs;
@SerializedName("comments")
@Expose
private Object comments;
@SerializedName("sections")
@Expose
private List<Section> sections = null;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getFullTitle() {
return fullTitle;
}

public void setFullTitle(String fullTitle) {
this.fullTitle = fullTitle;
}

public String getUrlSlug() {
return urlSlug;
}

public void setUrlSlug(String urlSlug) {
this.urlSlug = urlSlug;
}

public String getFullUrl() {
return fullUrl;
}

public void setFullUrl(String fullUrl) {
this.fullUrl = fullUrl;
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

public String getSourceName() {
return sourceName;
}

public void setSourceName(String sourceName) {
this.sourceName = sourceName;
}

public String getSourceUrlSlug() {
return sourceUrlSlug;
}

public void setSourceUrlSlug(String sourceUrlSlug) {
this.sourceUrlSlug = sourceUrlSlug;
}

public Object getOldTag() {
return oldTag;
}

public void setOldTag(Object oldTag) {
this.oldTag = oldTag;
}

public Object getOldTagPageUrl() {
return oldTagPageUrl;
}

public void setOldTagPageUrl(Object oldTagPageUrl) {
this.oldTagPageUrl = oldTagPageUrl;
}

public Integer getMixedModeOrder() {
return mixedModeOrder;
}

public void setMixedModeOrder(Integer mixedModeOrder) {
this.mixedModeOrder = mixedModeOrder;
}

public Boolean getPublished() {
return published;
}

public void setPublished(Boolean published) {
this.published = published;
}

public Object getLanguage() {
return language;
}

public void setLanguage(Object language) {
this.language = language;
}

public Object getCategory() {
return category;
}

public void setCategory(Object category) {
this.category = category;
}

public Object getNext() {
return next;
}

public void setNext(Object next) {
this.next = next;
}

public Object getPrevious() {
return previous;
}

public void setPrevious(Object previous) {
this.previous = previous;
}

public List<Verse> getVerses() {
return verses;
}

public void setVerses(List<Verse> verses) {
this.verses = verses;
}

public List<Recitation> getRecitations() {
return recitations;
}

public void setRecitations(List<Recitation> recitations) {
this.recitations = recitations;
}

public Object getImages() {
return images;
}

public void setImages(Object images) {
this.images = images;
}

public Object getSongs() {
return songs;
}

public void setSongs(Object songs) {
this.songs = songs;
}

public Object getComments() {
return comments;
}

public void setComments(Object comments) {
this.comments = comments;
}

public List<Section> getSections() {
return sections;
}

public void setSections(List<Section> sections) {
this.sections = sections;
}

}















