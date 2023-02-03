package com.vyrvykhvost.presenters;

import java.util.List;

public interface PersonInterface {
    List<Presenter> createPresenter();
    List<Guest> createGuest();
}
