package com.urandom.utech.u_random;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nopphon on 4/13/16.
 */
public class soundCloudTrack {

    @SerializedName("title")
    private String songTitle;

    @SerializedName("id")
    private String trackID;

    @SerializedName("stream_url")
    private String trackURL;

    @SerializedName("artwork_url")
    private String artWorkURL;

    public String getSongTitle() {
        return songTitle;
    }

    public String getTrackID() {
        return trackID;
    }

    public String getTrackURL() {
        return trackURL;
    }

    public String getArtWorkURL() {
        return artWorkURL;
    }
}
