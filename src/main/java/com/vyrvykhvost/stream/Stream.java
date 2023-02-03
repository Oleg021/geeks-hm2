package com.vyrvykhvost.stream;

import lombok.Getter;


@Getter
public class Stream {
    private int numInterview;
    private int numAdvertising;
    private int numMusic;

    public static class Builder{
        private int numInterview;
        private int numAdvertising;
        private int numMusic;

        public Builder numInterview(int numInterview) {
            this.numInterview = numInterview;
            return this;
        }

        public Builder numAdvertising(int numAdvertising) {
            this.numAdvertising = numAdvertising;
            return this;
        }

        public Builder numMusic(int numMusic) {
            this.numMusic = numMusic;
            return this;
        }

        public Stream build() {
            Stream stream = new Stream();
            stream.numInterview = numInterview;
            stream.numAdvertising = numAdvertising;
            stream.numMusic = numMusic;
            return stream;
        }

    }

    private Stream() {}



}
