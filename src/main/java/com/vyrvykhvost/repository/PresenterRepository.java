package com.vyrvykhvost.repository;

import com.vyrvykhvost.presenters.Guest;
import com.vyrvykhvost.presenters.PersonInterface;
import com.vyrvykhvost.presenters.Presenter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PresenterRepository implements PersonInterface {

    @Override
    public List<Presenter> createPresenter() {
        List<Presenter> presenters = new ArrayList<>();
        presenters.add(new Presenter("PLastName1", "PName1", "Pexp1"));
        presenters.add(new Presenter("PLastName2", "PName2", "Pexp2"));
        return presenters;
    }

    @Override
    public List<Guest> createGuest() {
        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest("GLastName1", "GName1", "Gresume1"));
        guests.add(new Guest("GLastName2", "GName2", "Gresume2"));
        return guests;
    }

    public void getAllPersons() {
        List<String> allPersons = new ArrayList<>();
        allPersons.add(createPresenter().get(0).lastName());
        allPersons.add(createPresenter().get(1).lastName());
        allPersons.add(createGuest().get(0).lastName());
        allPersons.add(createGuest().get(1).lastName());
        System.out.println(allPersons);

        try (OutputStream f = new FileOutputStream("demo.txt", true);
             OutputStreamWriter writer = new OutputStreamWriter(f);
             BufferedWriter out = new BufferedWriter(writer)){
            for (int i = 0; i < allPersons.size(); i++) {
                out.write(allPersons.get(i));
                writer.write(System.getProperty("line.separator"));
                out.flush();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
