package com.vyrvykhvost;

import com.vyrvykhvost.repository.PresenterRepository;
import com.vyrvykhvost.repository.StreamRepository;

public class Main {
    private static final StreamRepository STREAM_REPOSITORY = new StreamRepository();
    private static final PresenterRepository PRESENTER_REPOSITORY = new PresenterRepository();

    public static void main(String[] args) {
        STREAM_REPOSITORY.checkPaidContent();
        STREAM_REPOSITORY.checkLimit();
        STREAM_REPOSITORY.generateStream();
        PRESENTER_REPOSITORY.getAllPersons();
    }

}
