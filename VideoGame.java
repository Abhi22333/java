// VideoGame.java
public class VideoGame {
    private String title;
    private String genre;
    private int releaseYear;

    public VideoGame(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public void display() {
        System.out.println("VideoGame [title=" + title + ", genre=" + genre + ", releaseYear=" + releaseYear + "]");
    }
}

// Garland.java
public class Garland {
    private String color;
    private int length;
    private String material;

    public Garland(String color, int length, String material) {
        this.color = color;
        this.length = length;
        this.material = material;
    }

    public void display() {
        System.out.println("Garland [color=" + color + ", length=" + length + ", material=" + material + "]");
    }
}

// GiantWheel.java
public class GiantWheel {
    private int height;
    private int numberOfSeats;
    private String location;

    public GiantWheel(int height, int numberOfSeats, String location) {
        this.height = height;
        this.numberOfSeats = numberOfSeats;
        this.location = location;
    }

    public void display() {
        System.out.println("GiantWheel [height=" + height + ", numberOfSeats=" + numberOfSeats + ", location=" + location + "]");
    }
}

// Banner.java
public class Banner {
    private String message;
    private String color;
    private int size;

    public Banner(String message, String color, int size) {
        this.message = message;
        this.color = color;
        this.size = size;
    }

    public void display() {
        System.out.println("Banner [message=" + message + ", color=" + color + ", size=" + size + "]");
    }
}
