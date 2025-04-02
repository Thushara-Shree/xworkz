package com.xworkz.internal;
import com.xworkz.external.*;
import com.xworkz.external.Education;

public class MainRunner {
    public static void main(String[] args) {


        Education education=new Education();
        education.uniform();
        education.syllabus();
        education.assembly();
        education.classes();
        education.staff();
        education.playground();

        School school=new School();
        school.uniform();
        school.assembly();
        school.classes();
        school.staff();
        school.playground();

        School school1=new Education();
        school1.uniform();
        school1.assembly();
        school1.classes();
        school1.staff();
        school1.playground();

        System.out.println("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Purse purse=new Purse();
        purse.color();
        purse.design();
        purse.size();
        purse.type();
        purse.zip();

        Money money=new Money();
        money.currency();
        money.color();
        money.design();
        money.size();
        money.type();
        money.zip();


        Purse purse1=new Money();
        purse1.color();
        purse1.design();
        purse1.size();
        purse1.type();
        purse1.zip();

        System.out.println("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");

        Book book=new Book();
        book.bookmark();
        book.cost();
        book.name();
        book.pages();
        book.subject();

        Chapter chapter=new Chapter();
        chapter.title();
        chapter.bookmark();
        chapter.cost();
        chapter.name();
        chapter.pages();
        chapter.subject();

        Book book1=new Chapter();
        book1.bookmark();
        book1.cost();
        book1.name();
        book1.pages();
        book1.subject();

        System.out.println("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");

        Music music=new Music();
        music.musicType();
        music.rockMusic();
        music.band();
        music.classical();
        music.metal();

        Studio studio=new Studio();
        studio.musicIndustry();
        studio.musicType();
        studio.rockMusic();
        studio.band();
        studio.classical();
        studio.metal();

        Music music1=new Studio();
        music1.musicType();
        music1.rockMusic();
        music1.band();
        music1.classical();
        music1.metal();

        System.out.println("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");

        Fish fish=new Fish();
        fish.fishAquarium();
        fish.fishColor();
        fish.fishCost();
        fish.fishFood();
        fish.fishType();

        Water water=new Water();
        water.river();
        water.fishAquarium();
        water.fishColor();
        water.fishCost();
        water.fishFood();
        water.fishType();

        Fish fish1=new Fish();
        fish1.fishAquarium();
        fish1.fishColor();
        fish1.fishCost();
        fish1.fishFood();
        fish1.fishType();

        System.out.println("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");

        Science science=new Science();
        science.physics();
        science.aeroscinec();
        science.biology();
        science.chemistry();
        science.research();

        Subject subject=new Subject();
        subject.core();
        subject.physics();
        subject.aeroscinec();
        subject.biology();
        subject.chemistry();
        subject.research();

        Science science1=new Subject();
        science1.physics();
        science1.aeroscinec();
        science1.biology();
        science1.chemistry();
        science1.research();

        System.out.println("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");

        Clothes clothes=new Clothes();
        clothes.jeans();
        clothes.frock();
        clothes.cotton();
        clothes.gown();
        clothes.tshirt();

        Store store=new Store();
        store.location();
        store.jeans();
        store.frock();
        store.cotton();
        store.gown();
        store.tshirt();

        Clothes clothes1=new Store();
        clothes1.jeans();
        clothes1.frock();
        clothes1.cotton();
        clothes1.gown();
        clothes1.tshirt();

        System.out.println("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");

        Chips chips=new Chips();
        chips.banana();
        chips.masala();
        chips.potato();
        chips.salty();
        chips.spicy();

        Food food=new Food();
        food.flavor();
        food.banana();
        food.masala();
        food.potato();
        food.salty();
        food.spicy();

        Chips chips1=new Food();
        chips1.banana();
        chips1.masala();
        chips1.potato();
        chips1.salty();
        chips1.spicy();

        System.out.println("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");

        Tulsi tulsi=new Tulsi();
        tulsi.eat();
        tulsi.anitBacteria();
        tulsi.health();
        tulsi.medicinal();
        tulsi.prayer();

        Plant plant=new Plant();
        plant.nature();
        plant.eat();
        plant.anitBacteria();
        plant.health();
        plant.medicinal();
        plant.prayer();

        Tulsi tulsi1=new Plant();
        tulsi1.eat();
        tulsi1.anitBacteria();
        tulsi1.health();
        tulsi1.medicinal();
        tulsi1.prayer();

        System.out.println("\n&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&\n");

        Juice juice=new Juice();
        juice.ad();
        juice.company();
        juice.flavor();
        juice.taste();
        juice.mango();



        Slice slice=new Slice();
        slice.company();
        juice.ad();
        juice.company();
        juice.flavor();
        juice.taste();
        juice.mango();

        Juice juice1=new Juice();
        juice1.ad();
        juice1.company();
        juice1.flavor();
        juice1.taste();
        juice1.mango();











    }
}
