/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program genre musik
 * berkonsep OOP dengan menerapkan pewarisan, interface dan abstrak
 */

public class UTS12018 {
    public static void main(String[] args) {
        RnB rnB = new RnB();
        rnB.setArtisName("Jimmy Hendrik");
        rnB.genreBlues(rnB.getArtisName());
        rnB.setArtisName("Chad Baker");
        rnB.genreJazz(rnB.getArtisName());

        Folk folk = new Folk();
        folk.setArtisName("Bob Dylan");
        folk.genreFolk(folk.getArtisName());

        Rockabilly rockabilly = new Rockabilly();
        rockabilly.setArtisName("Elvis Presley");
        rockabilly.genreRockabilly(rockabilly.getArtisName());

        HardRock hardRock = new HardRock();
        hardRock.setArtisName("Dream Theater");
        hardRock.genreProgessiveRock(hardRock.getArtisName());
        hardRock.setArtisName("The Doors");
        hardRock.genrePsycehedellic(hardRock.getArtisName());
        hardRock.setArtisName("Kiss");
        hardRock.genrePopRock(hardRock.getArtisName());

        Metal metal = new Metal();
        metal.setArtisName("MXPX");
        metal.genrePunk(metal.getArtisName());
        metal.setArtisName("METALLICA");
        metal.genreHeavyMetal(metal.getArtisName());

        GrindCore grindCore = new GrindCore();
        grindCore.setArtisName("Mesin Tempur");
        grindCore.genreGrindCore(grindCore.getArtisName());

        DeathMetal deathMetal = new DeathMetal();
        deathMetal.setArtisName("JASAD");
        deathMetal.genreDeathMetal(deathMetal.getArtisName());

        DeathCoreKepiting deathCoreKepiting = new DeathCoreKepiting();
        deathCoreKepiting.setArtisName("Revenge The Fate");
        deathCoreKepiting.genreDeathCoreKepiting(deathCoreKepiting.getArtisName());

        BlackMetal blackMetal = new BlackMetal();
        blackMetal.setArtisName("Behemoth");
        blackMetal.genreBlackMetal(blackMetal.getArtisName());

        NewSkul newSkul = new NewSkul();
        newSkul.setArtisName("HATEBREED");
        newSkul.genreNewSkul(newSkul.getArtisName());
    }
}