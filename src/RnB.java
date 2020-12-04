public class RnB extends MusicGenre implements Blues, Jazz {
    @Override
    public void genreBlues(String artisName) {
        System.out.println(artisName + " adalah musisi Blues");
    }

    @Override
    public void genreJazz(String artisName) {
        System.out.println(artisName + " adalah musisi Jazz");
    }
}
