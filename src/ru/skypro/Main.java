package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author chuckPalahniuk = new Author("Chuck", "Palahniuk");
        Book fightClub = new Book("Fight Club", chuckPalahniuk, 1995);

        Author georgeOrwell = new Author("George", "Orwell");
        Book _1984 = new Book("1984", georgeOrwell, 1949);

        fightClub.setPublicationYear(1996);
        System.out.println("fightClub.getPublicationYear() = " + fightClub.getPublicationYear());
    }
}
