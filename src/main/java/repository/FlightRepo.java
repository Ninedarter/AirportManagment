package repository;

import entity.Flight;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class FlightRepo {

    public void save(List<Flight> flights) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        flights.forEach(session::save);
        transaction.commit();
        session.close();
    }

}
