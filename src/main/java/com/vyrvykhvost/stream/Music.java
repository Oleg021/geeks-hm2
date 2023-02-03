package com.vyrvykhvost.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Music implements NoPaidStream {
    private String nameSinger;
    private String nameSong;
    private double continuance;


    public Double continuance() {
        return continuance;
    }

    public String getSingerName() {
        return nameSinger;
    }

    public String getSongName() {
        return nameSong;
    }
}
