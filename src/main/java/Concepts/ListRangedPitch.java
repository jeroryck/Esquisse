package Concepts;

import format.LilyPondFormatter;

public class ListRangedPitch extends ListRangedValues<Pitch,Duration> {

    public String[] lilyPondVersion(int style) {
        return (new LilyPondFormatter()).format(this,style);
    }
}
