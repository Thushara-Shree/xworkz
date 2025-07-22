package com.xworkz.internal;

public class Runner {

    public static void main(String[] args) {
        School school=new School(53,'B',8);
        System.out.println("School "+school);

        Board board=new Board(9,8,5);
        System.out.println("Board "+board);

        Bag bag=new Bag(8,6,9);
        System.out.println("Bag " +bag);

        Hair hair=new Hair("Curly","Clinic Plus","U-cut");
        System.out.println("Hair "+hair);

        Tea tea=new Tea("Rose","Sweet",80);
        System.out.println("Tea "+tea);

        Sweets sweets=new Sweets("Soan Papdi","Haldiram",100);
        System.out.println("sweets"+sweets);

        College college = new College(1500, "Science, Arts, Commerce", 5);
        System.out.println(college);

        SchoolReport report = new SchoolReport("St Agnes", "2025-04-09", "Ms. Johnson");
        System.out.println(report);

        Chocolate choco = new Chocolate("Dark Delight", 2.5, "ChocoHeaven");
        System.out.println(choco);


        ChocolateBox box = new ChocolateBox(choco, 10, "Alice");
        System.out.println(box);

        Shoe shoe = new Shoe("Nike", 9, "Black");
        System.out.println(shoe);

        ShoeBox shoebox = new ShoeBox("Nike", "David", "Men's Running Shoes");
        System.out.println(shoebox);

        Human person = new Human("Alice", 30, "Female");
        System.out.println(person);

        HumanProfile profile = new HumanProfile("person", "Software Engineer", "Canadian");
        System.out.println(profile);

        Laptop lappy = new Laptop("Dell", "Intel i7", 16);
        System.out.println(lappy);

        LaptopDetails details = new LaptopDetails("lappy", 1200.00, "John Doe");
        System.out.println(details);

        Pencil pencil = new Pencil("Faber-Castell", "Black", true);
        System.out.println(pencil);

        PencilBox pencilbox = new PencilBox("pencil", 12, "Emma");
        System.out.println(pencilbox);

        Color color = new Color("Sky Blue", "#87CEEB", "Primary");
        System.out.println(color);

        ColorPalette palette = new ColorPalette("color", "Ocean Breeze", "Lily");
        System.out.println(palette);

        Projector projector = new Projector("Epson", 1080, true);
        System.out.println(projector);

        ProjectorSetup setup = new ProjectorSetup("projector", "Meeting Room A", "Michael");
        System.out.println(setup);

        Glass glass = new Glass("Tempered", 250, true);
        System.out.println(glass);


        GlassSet set = new GlassSet("glass", 6, "Sophia");
        System.out.println(set);

        Jail jail = new Jail("Alcatraz Island", 500, true);
        System.out.println(jail);

        JailRecord record = new JailRecord("jail", "Warden Blake", "2025-04-09");
        System.out.println(record);

        Mobile mobile = new Mobile("Samsung", "Galaxy S23", 256);
        System.out.println(mobile);

        MobileDetails mobiledetails = new MobileDetails("mobile", "Aarav", "2025-03-15");
        System.out.println(mobiledetails);

        Juice juice = new Juice("Mango", 300, true);
        System.out.println(juice);

        JuiceOrder order = new JuiceOrder(juice, "Neha", "10:45 AM");
        System.out.println(order);

        Box box1 = new Box("Cardboard", 40, true);
        System.out.println(box1);

        BoxInfo info = new BoxInfo("box", "Rahul", "Storing books");
        System.out.println(info);

        Calender calendar = new Calender("2025", "Gregorian", true);
        System.out.println(calendar);

        CalendarDetails cdetails = new CalendarDetails("calendar", "Anjali", "English");
        System.out.println(cdetails);

        Book book = new Book("The Alchemist", "Paulo Coelho", 197);
        System.out.println(book);

        BookRecord bookrecord = new BookRecord("book", "Riya", "Shelf A3");
        System.out.println(bookrecord);

        Moisturizer moisturizer = new Moisturizer("Nivea", 100, true);
        System.out.println(moisturizer);

        MoisturizerInfo minfo = new MoisturizerInfo("moisturizer", "Kavya", "2026-01-10");
        System.out.println(minfo);


        Chips chips = new Chips("Tomato", 50, true);
        System.out.println(chips);

        ChipsPacket packet = new ChipsPacket("chips", "Lays", "2025-04-01");
        System.out.println(packet);


        Bed bed = new Bed("Queen", "Wood", true);
        System.out.println(bed);

        BedInfo bedinfo = new BedInfo(bed, "Sneha", "Master Bedroom");
        System.out.println(bedinfo);

        Bottle bottle = new Bottle("Steel", 750, true);
        System.out.println(bottle);

        BottleInfo bottleinfo = new BottleInfo("bottle", "Ankit", "Silver");
        System.out.println(bottleinfo);

        Cupboard cupboard = new Cupboard("Wood", 4, true);
        System.out.println(cupboard);

        CupboardInfo cupboardInfoinfo = new CupboardInfo(cupboard, "Nisha", "Living Room");
        System.out.println(cupboardInfoinfo);

        Flower flower = new Flower("Rose", "Red", true);
        System.out.println(flower);

        FlowerInfo flowerinfo = new FlowerInfo("flower", "Lalbagh Garden", "Spring");
        System.out.println(flowerinfo);

        Bird bird = new Bird("Parrot", "Green", true);
        System.out.println(bird);

        BirdInfo birdinfo = new BirdInfo(bird, "Amazon Forest", "Squawk");
        System.out.println(birdinfo);

        Kettle kettle = new Kettle("Steel", 1500, true);
        System.out.println(kettle);

        KettleInfo kettleInfo = new KettleInfo("kettle", "Arjun", "Prestige");
        System.out.println(kettleInfo);


        Song song = new Song("Perfect", "Ed Sheeran", 263);
        System.out.println(song);

        SongInfo songInfo= new SongInfo("song", "Divide", "Pop");
        System.out.println(songInfo);

        Charger charger = new Charger("USB-C", 65, true);
        System.out.println(charger);

        ChargerInfo chargerInfo = new ChargerInfo("charger", "Samsung", "Galaxy S21");
        System.out.println(chargerInfo);

        Art art = new Art("Starry Night", "Oil on Canvas", 1889);
        System.out.println(art);

        ArtInfo artinfo = new ArtInfo("art", "Vincent van Gogh", "Museum of Modern Art");
        System.out.println(artinfo);

        Instrument instrument = new Instrument("Guitar", "String", false);
        System.out.println(instrument);

        InstrumentInfo instrumentInfo = new InstrumentInfo("instrument", "Yamaha", "Rahul");
        System.out.println(instrumentInfo);

        Water water = new Water("River", 7.2, true);
        System.out.println(water);

        WaterInfo waterInfo = new WaterInfo(water, "Bottle", "Ganga Valley");
        System.out.println(waterInfo);

        Device device = new Device("Smartphone", "Communication", true);
        System.out.println(device);

        DeviceInfo deviceInfo= new DeviceInfo("device", "OnePlus", "Kiran");
        System.out.println(deviceInfo);

        Dance dance = new Dance("Bharatanatyam", "India", true);
        System.out.println(dance);

        DanceInfo danceInfo= new DanceInfo(dance, "Meera", "Cultural Fest");
        System.out.println(danceInfo);

        Soap soap = new Soap("Dove", "Lavender", true);
        System.out.println(soap);

        SoapInfo soapInfo = new SoapInfo(soap, 125, "White");
        System.out.println(soapInfo);

        Cream cream = new Cream("Moisture Boost", "Hydration", true);
        System.out.println(cream);

        CreamInfo creamInfo = new CreamInfo(cream, 100, "Neutrogena");
        System.out.println(creamInfo);

        Dish dish = new Dish("Paneer Butter Masala", "Indian", true);
        System.out.println(dish);

        DishInfo dishInfo = new DishInfo(dish, 450, "Naan");
        System.out.println(dishInfo);

        Alcohol alcohol = new Alcohol("Whiskey", 40.0, "Distilled");
        System.out.println(alcohol);

        AlcoholInfo alcoholInfo = new AlcoholInfo(alcohol, "Scotland", 750);
        System.out.println(alcoholInfo);

        IceCream iceCream = new IceCream("Chocolate", "Cone", true);
        System.out.println(iceCream);


        IceCreamInfo iceCreamInfo= new IceCreamInfo(iceCream, 150, "Amul");
        System.out.println(iceCreamInfo);

        Metal metal = new Metal("Iron", 7.87, true);
        System.out.println(metal);

        MetalInfo metalInfo = new MetalInfo(metal, "Construction", "Gray and shiny");
        System.out.println(metalInfo);

        Cash cash = new Cash("INR", 5000, true);
        System.out.println(cash);


        CashInfo cashInfo = new CashInfo(cash, "Salary", "Shopping");
        System.out.println(cashInfo);

        NailPolish nailPolish = new NailPolish("Red", "Glossy", true);
        System.out.println(nailPolish);

        NailPolishInfo nailPolishInfo = new NailPolishInfo(nailPolish, 15, "Lakme");
        System.out.println(nailPolishInfo);

        Game game = new Game("Valorant", "Shooter", true);
        System.out.println(game);

        GameInfo gameInfo = new GameInfo(game, "PC", 9);
        System.out.println(gameInfo);

        Keyboard keyboard = new Keyboard("Mechanical", "QWERTY", true);
        System.out.println(keyboard);

        KeyboardInfo keyboardInfo = new KeyboardInfo(keyboard, "Logitech", 3499);
        System.out.println(keyboardInfo);

        Guitar guitar = new Guitar("Acoustic", 6, false);
        System.out.println(guitar);

        GuitarInfo guitarInfo = new GuitarInfo(guitar, "Yamaha", 10500);
        System.out.println(guitarInfo);

        Toothpaste toothpaste = new Toothpaste("Mint", true, "Cavity Protection");
        System.out.println(toothpaste);

        ToothpasteInfo toothpasteInfo = new ToothpasteInfo(toothpaste, "Colgate", 120);
        System.out.println(toothpasteInfo);


        Emoji emoji = new Emoji("K", "Face with tears of joy", false);
        System.out.println(emoji);

        EmojiInfo emojiInfo= new EmojiInfo(emoji, "Smileys & Emotion", "Android");
        System.out.println(emojiInfo);

        Building building = new Building("Skyview Tower", 20, true);
        System.out.println(building);


        BuildingInfo buildingInfo= new BuildingInfo(building, "Mumbai", "Commercial");
        System.out.println(buildingInfo);

        Handwash handwash = new Handwash("Lemon", true, "Yellow");
        System.out.println(handwash);

        Sanitizer sanitizer = new Sanitizer("Gel", 70, true);
        System.out.println(sanitizer);

        Oil oil = new Oil("Coconut", "Natural", true);
        System.out.println(oil);

        Aeroplane plane = new Aeroplane("Boeing 777", 396, true);
        System.out.println(plane);

        Bank bank = new Bank("State Bank of India", "MG Road", true);
        System.out.println(bank);

        Cup cup = new Cup("Ceramic", 250, true);
        System.out.println(cup);



















    }
}
