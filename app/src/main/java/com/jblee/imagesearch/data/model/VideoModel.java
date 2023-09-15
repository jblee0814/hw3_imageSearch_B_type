

package com.jblee.imagesearch.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 * 비디오 검색 응답을 위한 모델 클래스.
 */
public class VideoModel {

    @SerializedName("documents")
    private ArrayList<Documents> documents;

    @SerializedName("meta")
    private Meta meta;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public ArrayList<Documents> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Documents> documents) {
        this.documents = documents;
    }

    /**
     * 비디오 검색 응답에서 단일 문서 혹은 결과를 나타내는 클래스.
     */
    public class Documents {

        @SerializedName("title")
        private String title;

        @SerializedName("url")
        private String url;

        @SerializedName("datetime")
        private String datetime;

        @SerializedName("play_time")
        private int play_time;

        @SerializedName("thumbnail")
        private String thumbnail;

        @SerializedName("author")
        private String author;

        // 위의 속성들에 대한 getter와 setter...
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDatetime() {
            return datetime;
        }

        public void setDatetime(String datetime) {
            this.datetime = datetime;
        }

        public int getPlay_time() {
            return play_time;
        }

        public void setPlay_time(int play_time) {
            this.play_time = play_time;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

    /**
     * 비디오 검색 응답에 대한 메타 정보를 나타내는 클래스.
     */
    public class Meta {

        @SerializedName("is_end")
        private boolean is_end;

        @SerializedName("pageable_count")
        private int pageable_count;

        @SerializedName("total_count")
        private int total_count;

        // 위의 속성들에 대한 getter와 setter...
        public boolean isIs_end() {
            return is_end;
        }

        public void setIs_end(boolean is_end) {
            this.is_end = is_end;
        }

        public int getPageable_count() {
            return pageable_count;
        }

        public void setPageable_count(int pageable_count) {
            this.pageable_count = pageable_count;
        }

        public int getTotal_count() {
            return total_count;
        }

        public void setTotal_count(int total_count) {
            this.total_count = total_count;
        }

    }
}
