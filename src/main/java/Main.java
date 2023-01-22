import entity.Flight;
import org.hibernate.Session;
import repository.FlightRepo;
import service.JsonService;
import util.HibernateUtil;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Session session = HibernateUtil.getSessionFactory().openSession();

      JsonService jsonService = new JsonService();
      List< Flight> flights =  jsonService.getDataFromJsonToList();
//        jsonService.anotherJson();
//        System.out.println(flights);
//        FlightRepo flightRepo = new FlightRepo();
//        flightRepo.save(flights);


    }
}
