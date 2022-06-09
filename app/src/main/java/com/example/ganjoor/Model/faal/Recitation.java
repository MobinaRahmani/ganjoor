package com.example.ganjoor.Model.faal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Recitation {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("poemId")
@Expose
private Integer poemId;
@SerializedName("poemFullTitle")
@Expose
private String poemFullTitle;
@SerializedName("poemFullUrl")
@Expose
private String poemFullUrl;
@SerializedName("audioTitle")
@Expose
private String audioTitle;
@SerializedName("audioArtist")
@Expose
private String audioArtist;
@SerializedName("audioArtistUrl")
@Expose
private String audioArtistUrl;
@SerializedName("audioSrc")
@Expose
private String audioSrc;
@SerializedName("audioSrcUrl")
@Expose
private String audioSrcUrl;
@SerializedName("legacyAudioGuid")
@Expose
private String legacyAudioGuid;
@SerializedName("mp3FileCheckSum")
@Expose
private String mp3FileCheckSum;
@SerializedName("mp3SizeInBytes")
@Expose
private Integer mp3SizeInBytes;
@SerializedName("publishDate")
@Expose
private String publishDate;
@SerializedName("fileLastUpdated")
@Expose
private String fileLastUpdated;
@SerializedName("mp3Url")
@Expose
private String mp3Url;
@SerializedName("xmlText")
@Expose
private String xmlText;
@SerializedName("plainText")
@Expose
private String plainText;
@SerializedName("htmlText")
@Expose
private String htmlText;
@SerializedName("mistakes")
@Expose
private List<Object> mistakes = null;

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

public String getPoemFullTitle() {
return poemFullTitle;
}

public void setPoemFullTitle(String poemFullTitle) {
this.poemFullTitle = poemFullTitle;
}

public String getPoemFullUrl() {
return poemFullUrl;
}

public void setPoemFullUrl(String poemFullUrl) {
this.poemFullUrl = poemFullUrl;
}

public String getAudioTitle() {
return audioTitle;
}

public void setAudioTitle(String audioTitle) {
this.audioTitle = audioTitle;
}

public String getAudioArtist() {
return audioArtist;
}

public void setAudioArtist(String audioArtist) {
this.audioArtist = audioArtist;
}

public String getAudioArtistUrl() {
return audioArtistUrl;
}

public void setAudioArtistUrl(String audioArtistUrl) {
this.audioArtistUrl = audioArtistUrl;
}

public String getAudioSrc() {
return audioSrc;
}

public void setAudioSrc(String audioSrc) {
this.audioSrc = audioSrc;
}

public String getAudioSrcUrl() {
return audioSrcUrl;
}

public void setAudioSrcUrl(String audioSrcUrl) {
this.audioSrcUrl = audioSrcUrl;
}

public String getLegacyAudioGuid() {
return legacyAudioGuid;
}

public void setLegacyAudioGuid(String legacyAudioGuid) {
this.legacyAudioGuid = legacyAudioGuid;
}

public String getMp3FileCheckSum() {
return mp3FileCheckSum;
}

public void setMp3FileCheckSum(String mp3FileCheckSum) {
this.mp3FileCheckSum = mp3FileCheckSum;
}

public Integer getMp3SizeInBytes() {
return mp3SizeInBytes;
}

public void setMp3SizeInBytes(Integer mp3SizeInBytes) {
this.mp3SizeInBytes = mp3SizeInBytes;
}

public String getPublishDate() {
return publishDate;
}

public void setPublishDate(String publishDate) {
this.publishDate = publishDate;
}

public String getFileLastUpdated() {
return fileLastUpdated;
}

public void setFileLastUpdated(String fileLastUpdated) {
this.fileLastUpdated = fileLastUpdated;
}

public String getMp3Url() {
return mp3Url;
}

public void setMp3Url(String mp3Url) {
this.mp3Url = mp3Url;
}

public String getXmlText() {
return xmlText;
}

public void setXmlText(String xmlText) {
this.xmlText = xmlText;
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

public List<Object> getMistakes() {
return mistakes;
}

public void setMistakes(List<Object> mistakes) {
this.mistakes = mistakes;
}

}
