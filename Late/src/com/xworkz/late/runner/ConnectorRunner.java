package com.xworkz.late.runner;

import com.xworkz.late.external.user.*;
import com.xworkz.late.internal.imple.*;

public class ConnectorRunner {

    public static void main(String[] args) {

        Connector connector=new ConnectorImpl();

        ConnectorUser connectorUser=new ConnectorUser(connector);
        connectorUser.execute();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Icc icc=new IccImpl();

        BCCI bcci=new BCCI(icc);
        bcci.play();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Constitution constitution=new CitizenConstImpl();
        Government government=new Government(constitution);
        government.rule();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Laptop laptop=new LaptopImpl();
        OperatingSystem operatingSystem=new OperatingSystem(laptop);
        operatingSystem.feature();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Agency agency=new AgencyImp();
        StudyAbroad studyAbroad=new StudyAbroad(agency);
        studyAbroad.travel();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Bridge bridge=new BridgeImpl();
        ConnectRoad connectRoad=new ConnectRoad(bridge);
        connectRoad.landmark();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Vehicle vehicle=new VehicleImpl();
        Engine engine=new Engine(vehicle);
        engine.tyre();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Mobile mobile=new MobileImpl();
        Information information=new Information(mobile);
        information.scroll();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Newspaper newspaper=new NewspaperImpl();
        News news=new News(newspaper);
        news.scroll();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Market market=new MarketImpl();
        Customer customer=new Customer(market);
        customer.sell();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Application application=new ApplicationImpl();
        UserNeed userNeede=new UserNeed(application);
        userNeede.play();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        PostOffice postOffice=new PostOfficeImpl();
        Posts posts=new Posts(postOffice);
        posts.message();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Whatsapp whatsapp=new WhatsappImpl();
        Text text=new Text(whatsapp);
        text.messages();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        LinkedIn linkedIn=new LinkedInImpl();
        Oppurtunity oppurtunity=new Oppurtunity(linkedIn);
        oppurtunity.job();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Facebook facebook=new FacebookImpl();
        Meta meta=new Meta(facebook);
        meta.connect();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Road road = new RoadImpl();
        RoadUser user = new RoadUser(road);
        user.useRoad();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Company company = new CompanyImpl();
        CompanyUser companyUser = new CompanyUser(company);
        companyUser.useCompany();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Teacher teacher = new TeacherImpl();
        TeacherUser teacherUseruser = new TeacherUser(teacher);
        teacherUseruser.useTeacher();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Boat boat = new BoatImpl();
        BoatUser boatUseruser = new BoatUser(boat);
        boatUseruser.useBoat();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Harbor harbor = new HarborImpl();
        HarborUser harborUser= new HarborUser(harbor);
        harborUser.useHarbor();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Switch sw = new SwitchImpl();
        SwitchUser switchUseruser = new SwitchUser(sw);
        switchUseruser.useSwitch();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");


        Bank bank = new BankImpl();
        BankUser bankUser = new BankUser(bank);
        bankUser.useBank();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Hospital hospital = new HospitalImpl();
        HospitalUser hospitalUser = new HospitalUser(hospital);
        hospitalUser.useHospital();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Airport airport = new AirportImpl();
        AirportUser airportUser = new AirportUser(airport);
        airportUser.useAirport();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Charger charger = new ChargerImpl();
        ChargerUser chargerUser = new ChargerUser(charger);
        chargerUser.useCharger();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        USB usb = new USBImpl();
        USBUser usbUser = new USBUser(usb);
        usbUser.useUSB();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Wifi wifi = new WifiImpl();
        WifiUser wifiUser = new WifiUser(wifi);
        wifiUser.useWiFi();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Internet internet = new InternetImpl();
        InternetUser internetUser = new InternetUser(internet);
        internetUser.useInternet();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Google google = new GoogleImpl();
        GoogleUser googleUser = new GoogleUser(google);
        googleUser.useGoogle();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Council council = new CouncilImpl();
        CouncilUser councilUser = new CouncilUser(council);
        councilUser.useCouncil();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Cable cable = new CableImpl();
        CableUser cableUser= new CableUser(cable);
        cableUser.useCable();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Station station = new StationImpl();
        StationUser stationUser = new StationUser(station);
        stationUser.useStation();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Studio studio = new StudioImpl();
        StudioUser studioUser = new StudioUser(studio);
        studioUser.useStudio();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Art art = new ArtImpl();
        ArtUser artUser = new ArtUser(art);
        artUser.useArt();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Education education = new EducationImpl();
        EducationUser educationUser = new EducationUser(education);
        educationUser.useEducation();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Taxi taxi = new TaxiImpl();
        TaxiUser taxiUser = new TaxiUser(taxi);
        taxiUser.useTaxi();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Metro metro = new MetroImpl();
        MetroUser metroUser = new MetroUser(metro);
        metroUser.useMetro();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Railway railway = new RailwayImpl();
        RailwayUser railwayUser = new RailwayUser(railway);
        railwayUser.useRailway();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Speaker speaker = new SpeakerImpl();
        SpeakerUser speakerUser = new SpeakerUser(speaker);
        speakerUser.useSpeaker();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Air air = new AirImpl();
        AirUser airUser = new AirUser(air);
        airUser.useAir();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Office office = new OfficeImpl();
        OfficeUser user1 = new OfficeUser(office);
        user1.useOffice();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Shape shape = new ShapeImpl();
        ShapeUser user2 = new ShapeUser(shape);
        user2.useShape();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Repository repository = new RepositoryImpl();
        RepositoryUser user3 = new RepositoryUser(repository);
        user3.useRepository();

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Map map = new MapImpl();
        MapUser user4 = new MapUser(map);
        user4.useMap();


        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        List list = new ListImpl();
        ListUser user5 = new ListUser(list);
        user5.useList();


        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Set set = new SetImpl();
        SetUser user6 = new SetUser(set);
        user6.useSet();


        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        School school = new SchoolImpl();
        SchoolUser user7 = new SchoolUser(school);
        user7.useSchool();


        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Book book = new BookImpl();
        BookUser user8 = new BookUser(book);
        user8.useBook();


        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Paper paper = new PaperImpl();
        PaperUser user9 = new PaperUser(paper);
        user9.usePaper();


        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");


        Food food = new FoodImpl();
        FoodUser user10 = new FoodUser(food);
        user10.useFood();


















    }
}
