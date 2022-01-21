package CHAPTER3DITEL;

import java.time.LocalDate;

public enum FavouriteDay {

    //instantiation of the enum class
    NN("bigboy", "oshodi", LocalDate.of(2022,12,2)),
    SS("bigboy", "oshodi", LocalDate.of(2022,1,9));

    //instance variables
    private final String name;
    private final String placeOfOccurence;
    private final LocalDate date;

    //enum constructors
    FavouriteDay(String name, String place, LocalDate date) {
        this.name = name;
        placeOfOccurence = place;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getPlaceOfOccurence() {
        return placeOfOccurence;
    }

    public LocalDate getdate() {
        return date;
    }
}

