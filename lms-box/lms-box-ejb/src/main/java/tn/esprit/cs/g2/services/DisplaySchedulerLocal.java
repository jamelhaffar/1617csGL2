package tn.esprit.cs.g2.services;

import javax.ejb.Local;

@Local
public interface DisplaySchedulerLocal {
	String requestForScheduler();
}
