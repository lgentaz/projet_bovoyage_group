import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.voyage.configuration.AppConfiguration;
import com.voyage.daos.*;
import com.voyage.entities.*;
import com.voyage.entities.Reservation.EtatReservation;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		Adresse a = (Adresse) context.getBean("adresse1");
		Prestation p = (Prestation) context.getBean("prestation1");
		Voyage v = (Voyage) context.getBean("voyage1");
		v.setStatut(true);
		Voyageur vp = (Voyageur) context.getBean("voyageur1");
		vp.setAdresse(a);
		Client c = (Client) context.getBean("client1");
		c.setAdresse(a);
		Reservation r = (Reservation) context.getBean("reservation1");
		r.setEtatReservation(EtatReservation.EnCours);
		r.setNumeroReservation(r.getIdReservation());

		
		IDAOAdresse adao = (IDAOAdresse) context.getBean("adao");
		IDAOPrestation pdao = (IDAOPrestation) context.getBean("pdao");
		IDAOVoyageur vdao = (IDAOVoyageur) context.getBean("vdao");
		IDAOClient cdao = (IDAOClient) context.getBean("cdao");
		IDAOVoyage vvdao = (IDAOVoyage) context.getBean("vvdao");
		IDAOReservation rdao = (IDAOReservation) context.getBean("rdao");		
		adao.addAdresse(a);
		pdao.addPrestation(p);
		vvdao.addVoyage(v);
		vdao.addVoyageur(vp);
		cdao.addClient(c);
		rdao.addReservation(r);
	}

}
