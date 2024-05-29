package net.flix;

public class Movie {
    //  instance variables or fields
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;


    //  constructors - these get called when clients say "new"
//    public Movie() {
//       no-op
//    }

    public Movie(String title){
        setTitle(title);
    }

    public Movie(String title, Genre genre){
        this(title);                    //  delegate to ctor above which handles title
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear, Double revenue){
        this(title);                    //  delegate to ctor above which handles title
        setReleaseYear(releaseYear);    //  delegate to setters for any validation/conversion
        setRevenue(revenue);

    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre){
        this(title, releaseYear, revenue);  //  delegate to 3-arg ctor above me for these 3
        setRating(rating);
        setGenre(genre);
    }

    //  "action" method - play(), pause(), stop(), rewind(), fastForward()

    //"accessor" methods, aka get/set methods, aka getters-and-setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    //  TODO: if revenue is null, use %s for that one, otherwise use %,.2f
    public String toString(){
        if (getRevenue() == (null)){        //  if revenue is not provided, this will print it out in string format
            return String.format("Movie: title = %s, releaseYear = %s, revenue = %s, rating = %s, genre = %s",
                    getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
        }
        else {                             //   if revenue is provided, this will print it as a floating point
            return String.format("Movie: title = %s, releaseYear = %s, revenue = %,.2f, rating = %s, genre = %s",
                    getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
        }

//        return "Movie: title = " + getTitle() + ", releaseYear = " + getReleaseYear() +
//                ", revenue = " + getRevenue() + ", rating = " + getRating() + ", genre = " + getGenre();
    }
}