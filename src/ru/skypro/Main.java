package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author chuckPalahniuk = new Author("Chuck", "Palahniuk");
        Author chuckPalahniuk2 = new Author("Chuck", "Palahniuk");

        Book fightClub = new Book("Fight Club", chuckPalahniuk, 1995);
        Book fightClub2 = new Book("Fight Club", chuckPalahniuk, 1995);

        Author georgeOrwell = new Author("George", "Orwell");
        Book _1984 = new Book("1984", georgeOrwell, 1949);

        System.out.println(chuckPalahniuk.toString());
        System.out.println(fightClub.toString() +"\n");

        System.out.println(fightClub.equals(_1984));
        System.out.println(fightClub.equals(fightClub2));

        System.out.println(chuckPalahniuk.equals(georgeOrwell));
        System.out.println(chuckPalahniuk.equals(chuckPalahniuk2));

        System.out.println(chuckPalahniuk.hashCode());
        System.out.println(fightClub.hashCode());
    }
}
