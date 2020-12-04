public class Metal extends HardRock implements HeavyMetal {
    public void genreMetal(String artisName){

    }

    @Override
    public void genreHeavyMetal(String artisName) {
        System.out.println(artisName + " adalah musisi Heavy Metal");

    }

    @Override
    public void genrePunk(String artisName) {
        System.out.println(artisName + " adalah musisi Punk");
    }

    public void genreGrunge(String artisName){

    }
}
