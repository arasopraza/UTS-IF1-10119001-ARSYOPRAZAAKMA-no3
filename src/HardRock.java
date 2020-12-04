public class HardRock extends RnB implements PopRock, ProgressiveRock, Psycehedellic {
    public void genreHardRock(String artisName){

    }

    @Override
    public void genrePopRock(String artisName) {
        System.out.println(artisName + " adalah musisi PopRock");
    }

    @Override
    public void genreProgessiveRock(String artisName) {
        System.out.println(artisName + " adalah musisi ProgressiveRock");
    }

    @Override
    public void genrePsycehedellic(String artisName) {
        System.out.println(artisName + " adalah musisi Psycehedellic");
    }
}
