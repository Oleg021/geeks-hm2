package com.vyrvykhvost.stream;

import java.util.List;

public interface StreamFactory {
    List<Interview> createPaidInterview();
    List<Advertising> createPaidAdvertising();
    List<Music> crateNoPaid();
}
