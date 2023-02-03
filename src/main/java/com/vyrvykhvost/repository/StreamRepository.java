package com.vyrvykhvost.repository;

import com.vyrvykhvost.stream.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class StreamRepository implements StreamFactory {
    private Double continuance = 14400.0;
    Stream stream = new Stream.Builder().numInterview(2).numAdvertising(3).numMusic(6).build();
    public Stream createStream(int numInterview, int numAdvertising, int numMusic) {
        Stream stream = new Stream.Builder()
                .numInterview(numInterview)
                .numAdvertising(numAdvertising)
                .numMusic(numMusic)
                .build();
        System.out.println(stream);
        return stream;
    }
    public List<Interview> createPaidInterview() {
        List<Interview> interviews = new ArrayList<>();
        interviews.add(new Interview("Interviewer1", 3300.0));
        interviews.add(new Interview("Interviewer2", 3300.0));
        return interviews;
    }

    public List<Advertising> createPaidAdvertising() {
        List<Advertising> advertisings = new ArrayList<>();
        advertisings.add(new Advertising("Cola", 300.0));
        advertisings.add(new Advertising("Fanta", 300.0));
        advertisings.add(new Advertising("Sprite", 300.0));
        return advertisings;
    }

    public List<Music> crateNoPaid() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(new Music("Singer1", "Music1", 200.0));
        musicList.add(new Music("Singer2", "Music2", 200.0));
        musicList.add(new Music("Singer3", "Music3", 200.0));
        musicList.add(new Music("Singer4", "Music4", 200.0));
        musicList.add(new Music("Singer5", "Music5", 200.0));
        musicList.add(new Music("Singer6", "Music6", 200.0));
        return musicList;
    }

    public void checkPaidContent() {
        if (stream.getNumInterview()*createPaidInterview().get(1).continuance()
                + stream.getNumAdvertising()*createPaidAdvertising().get(1).continuance() >
        stream.getNumMusic()*crateNoPaid().get(1).continuance()) {
            System.out.println("Paid content more than 50%!");
        } else {
            System.out.println("Paid content less than 50%");
        }
    }

    public void checkLimit() {
        if(stream.getNumInterview()*createPaidInterview().get(1).continuance()
        + stream.getNumAdvertising()*createPaidAdvertising().get(1).continuance()
        + stream.getNumMusic()*crateNoPaid().get(1).continuance() > continuance) {
            System.out.println("Out of limit time!");
        } else {
            System.out.println("Limit time correct");
        }
    }

    public void generateStream() {
        List<String> streamList = new ArrayList<>();
        createMusic(streamList);
        streamList.add(createPaidAdvertising().get(0 + (int) (Math.random() * 3)).name());
        streamList.add(createPaidInterview().get(0 + (int) (Math.random() * 2)).name());
        createMusic(streamList);
        streamList.add(createPaidAdvertising().get(0 + (int) (Math.random() * 3)).name());
        streamList.add(createPaidInterview().get(0 + (int) (Math.random() * 2)).name());
        streamList.add(createPaidAdvertising().get(0 + (int) (Math.random() * 3)).name());
        System.out.println(streamList);

        try (OutputStream f = new FileOutputStream("demo.txt", true);
             OutputStreamWriter writer = new OutputStreamWriter(f);
             BufferedWriter out = new BufferedWriter(writer)){
                for (int i = 0; i < streamList.size(); i++) {
                    out.write(streamList.get(i));
                    writer.write(System.getProperty("line.separator"));
                    out.flush();
                }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void createMusic(List advertisingMusicList) {
        for (int i = 0; i < 3; i++) {
            advertisingMusicList.add(crateNoPaid().get(0 + (int) (Math.random() * 6)).getSongName());
        }
    }

}
